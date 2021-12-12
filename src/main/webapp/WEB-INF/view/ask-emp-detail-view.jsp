<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="FORM" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<h2>Dear Employee, Please enter your details</h2>
<br>
<br>

<form:form action="showDetails" modelAttribute="employee">
    Name<form:input path="name"/>

<br><br>
    Surname<form:input path="surName"/>
    <br><br>
    Salary<form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
<%--    <form:option value="Information Tech" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales " label="Sales"/>--%>

    <form:options items="${employee.departments}"/>

</form:select>
    <br><br>

    Which car do you want?
<%--    BMW<form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Mersedec<form:radiobutton path="carBrand" value="Mersedec"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <br>
    Languages
<%--    EN<form:checkbox path="languages" value="English"/>--%>
<%--    FR<form:checkbox path="languages" value="Frenche"/>--%>
<%--    DE<form:checkbox path="languages" value="Deutche"/>--%>
    <form:checkboxes path="languages" items="${employee.languagess}"/>

    <input type="submit" value="ok">


</form:form>

</html>