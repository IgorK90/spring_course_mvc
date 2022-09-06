<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<DOCTYPE HTML>
<HTML>
<body>
<h2> Dear employeee, please enter your details</h2>
<br>
<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">


<!--<form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>-->

    <form:options items="${employee.departments}"/>

    </form:select>
    <br><br>
    <br><br>

    Which car do you want?
<!--BMW <form:radiobutton path="carBrand" value="BMW"/>
    Audi <form:radiobutton path="carBrand" value="Audi"/>
    Mercedes <form:radiobutton path="carBrand" value="Mercedes"/> -->

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <br><br>
    <br><br>

    Foreign Languages
<!--EN <form:checkbox path="languages" value="Englosh"/>
    DE <form:checkbox path="languages" value="German"/>
    FR <form:checkbox path="languages" value="French"/> -->

    <form:checkboxes path="languages" items="${employee.languageList}"/>

    <br><br>
    <br><br>



    <input type="submit" value="OK"/>
</form:form>

<!--
<form action="showDetails" method="get">
    <input type="text" name="employeeName"
    placeholder="Write your name"/>

    <input type="submit"/>
</form>-->

</body>
</HTML>