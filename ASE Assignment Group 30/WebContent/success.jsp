<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>ASE Assignment 2</title>
    </head>
 
    <body>
    <h2>
    Welcome <s:property value="user.name"/> !
    </h2>
    	<s:form action="logout">
        <s:submit value="Logout" ></s:submit>
        </s:form>
    </body>
 
</html>