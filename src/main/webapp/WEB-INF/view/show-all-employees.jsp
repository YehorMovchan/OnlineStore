<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: GwynBleidd
  Date: 31.01.2025
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All Employees</h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operation</th>
    </tr>

        <c:forEach var="emp" items="${employees}">
            <c:url var="UpdateButton" value="/employees/updateEmployee">
                <c:param name="empID" value="${emp.id}"/>
            </c:url>
            <c:url var="DeleteButton" value="/employees/deleteEmployee">
                <c:param name="empID" value="${emp.id}"/>
            </c:url>
            <tr>
                <td>${emp.name}</td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
                <td>
                    <input type="button" value="Update" onclick="window.location.href = '${UpdateButton}'">
                    <input type="button" value="Delete" onclick="window.location.href = '${DeleteButton}'">
                </td>
            </tr>

        </c:forEach>

</table>
<br>
<input type="button" value="Add" onclick="window.location.href = 'addNewEmployee'">

</body>
</html>
