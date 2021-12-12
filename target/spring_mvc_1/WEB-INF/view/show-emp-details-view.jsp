<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee,You are welcome!</h2>
<br>
<br>

<%--Your name: ${param.employeeName}--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surName}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Languages: <ur>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang}</li>
    </c:forEach>
</ur>


</body>

</html>