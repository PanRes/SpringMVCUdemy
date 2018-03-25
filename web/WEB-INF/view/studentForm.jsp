<%--
  Created by IntelliJ IDEA.
  User: PR
  Date: 25-Mar-18
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<title>Student Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>

			<br><br>

			Last Name: <form:input path="lastName"/>

			<br><br>

			Country: 
			<form:select path="country">
				<form:options items="${theCountryOption}"/>
			</form:select>

			<br><br>

			Java <form:radiobutton path="favoriteLanguage" value="Java"/>
			Python <form:radiobutton path="favoriteLanguage" value="Python"/>
			C# <form:radiobutton path="favoriteLanguage" value="C#"/>
			Javascript <form:radiobutton path="favoriteLanguage" value="Javascript"/>

			<br><br>

			<form:radiobuttons path="sex" items="${theSexOptions}"/>

			<br><br>

			Operating Systems Owned:

			<form:checkbox path="operatingSystems" value="Linux"/> Linux
			<form:checkbox path="operatingSystems" value="Windows"/> Windows
			<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS

			<br><br>

			Devices Owned:

			<form:checkboxes items="${theDeviceOptions}" path="devices"/>

			<br><br>

			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>
