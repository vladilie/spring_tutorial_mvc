<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>

Hi ${student.firstName} ${student.lastName}
<br>
<br>
Origin : ${student.countryName}
<br>
<br>
Favourite Language: ${student.favouriteLanguageName}
<br>
<br>
Operating Systems: <c:forEach var="temp" items="${student.operatingSystemNames}">
    <c:out value = "${temp}"/><p>
</c:forEach>

</body>


</html>