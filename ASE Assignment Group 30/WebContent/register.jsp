<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>ASE Assignment 2</title>
	</head>
	<body>
		<h1>Register</h1>
        <s:form action="register" theme="bootstrap"
        cssClass="well form-vertical form">
        <s:textfield key="user.name" label="Name"></s:textfield>
        <s:textfield key="user.username" label="Username"></s:textfield>
        <s:textfield key="user.password" label="Password"></s:textfield>
        <br />
        <s:submit label="Submit" ></s:submit>
        </s:form>
        <br/>
        <br/>
        <s:form action="goToLogin" theme="bootstrap"
        cssClass="well form-vertical form2">
        <p>Already have an account?</p>
        <s:submit value="Go To Login" ></s:submit>
        </s:form>
	</body>


<style type="text/css">
.container {position relative;
	
}
.form {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 250px;
	height: 250px;
	border: 20px;
}
.form2{
	position: absolute;
	top: 90%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 250px;
	height: 250px;
	border: 20px;
}
</style>
</html>