package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {
	private static String createTableStr= "CREATE TABLE IF NOT EXISTS user(username VARCHAR(45) NOT NULL, password VARCHAR(45),name VARCHAR(45), PRIMARY KEY (username))";
	
	public static void main(String[] args) throws Exception {
		createTable();		
//		addUser("limkaraik","12345","Kai");
//		ArrayList<String> a = findUser("limkaraik");
//		System.out.println(a.get(0));
	}
	
	public static boolean createTable() throws Exception{
		boolean check = true;
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement(Main.createTableStr);
			create.executeUpdate();
			System.out.println("Table Created/Already Exists");
		}catch(Exception e) {System.out.println(e); check = false;}
		finally {System.out.println("Create Table Function Complete");}
		return check;
	}
	
	public static boolean addUser(String id, String pd, String name) throws Exception{
		boolean check = true;
		try {
			Connection con = getConnection();
			PreparedStatement post = con.prepareStatement("INSERT INTO user (username, password, name) VALUES ('"+id+"','"+pd+"','"+name+"')");
			post.executeUpdate();
			System.out.println("User Added");
		}catch(Exception e) {System.out.println(e); check = false;}
		finally {System.out.println("addUser Function Complete");}
		return check;
	}
	
	public static ArrayList<String> findUser(String id) throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement find = con.prepareStatement("SELECT name,password FROM user WHERE username='"+id+"'");
			ResultSet result = find.executeQuery();
			ArrayList<String> array = new ArrayList<String>();
			while (result.next()){
				array.add(result.getString("password"));
				array.add(result.getString("name"));
			}
			System.out.println("Fetched user from DB");
			return array;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	
	public static Connection getConnection() throws Exception{
		try {
			String url = "jdbc:mysql://localhost:3306/ase-2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String username= "root";
			String password = "limkaraik";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		} catch(Exception e) {System.out.println(e);}
		
		
		return null;
	}
}