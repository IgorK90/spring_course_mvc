<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<DOCTYPE HTML>
<html>
<body>
<h2> Dear employeee, your are welcome</h2>
<br>
<br>
 <%--Your name: ${param.employeeName }--%>
<%--Your name: ${nameAttribute}--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br
Language (s):
 <ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang} </li>
    </c:forEach>
 </ul>
<br>
Your Phone Number:${employee.phoneNumber}
<br>
Your email:${employee.email }

</body>
</html>