<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<body>

<form:form action="processForm" modelAttribute="student">

    <br>
    First name : <form:input name="firstName" path="firstName" />
    <br>
    Last name : <form:input name="lastName" path="lastName" />
    <br>
    Country :   <form:select name="country" path="country">
                    <form:option name="Romania" value="Romania"/>
                    <form:option name="Italia"  value="Italia"/>
                    <form:option name="Spania" value="Spania"/>

                </form:select>

    <br>
    <form:button id="submit" value="submit">say hi</form:button>
</form:form>
</body>
</html>