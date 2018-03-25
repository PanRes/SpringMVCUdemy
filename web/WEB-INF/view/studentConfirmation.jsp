<%--
  Created by IntelliJ IDEA.
  User: PR
  Date: 25-Mar-18
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		${student.toString()}

		<br><br>

		The student owns the following devices:
		<br><br>
		<c:forEach items="${student.devices}" var="temp" >
			<li>${temp}</li>
		</c:forEach>
	</body>
</html>
