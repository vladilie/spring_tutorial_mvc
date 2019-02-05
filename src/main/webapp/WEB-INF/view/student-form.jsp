<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<body>

<form:form action="processForm" modelAttribute="student">

    <br>
    First name : <form:input name="firstName" path="firstName" />
    <br>
    Last name : <form:input name="lastName" path="lastName" />
    <br>
    Country :       <form:select path="country">
                        <form:options items="${countries}" />
                    </form:select>

    <br>
    Favourite Language : <form:radiobuttons path="favouriteLanguage" items="${languages}" />

    <br>

    <form:button id="submit" value="submit">say hi</form:button>
</form:form>
</body>
</html>