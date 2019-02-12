<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<body>

<form:form action="processForm" modelAttribute="student">

    <br>
    First name : <form:input name="firstName" path="firstName" />
    <form:errors path="firstName" />
    <br>
    Last name : <form:input name="lastName" path="lastName" />
    <form:errors path="lastName" />
    <br>
    Country :       <form:select path="country">
                        <form:options items="${countries}" />
                    </form:select>
                    <form:errors path="country" />

    <br>
    Favourite Language : <form:radiobuttons path="favouriteLanguage" items="${languages}" />
    <form:errors path="favouriteLanguage" />

    <br>
    Operating Systems : <form:checkboxes path="operatingSystemList" items="${operatingSystems}" />
    <form:errors path="operatingSystemList" />

    <br>
    <form:button id="submit" value="submit">say hi</form:button>
</form:form>
</body>
</html>