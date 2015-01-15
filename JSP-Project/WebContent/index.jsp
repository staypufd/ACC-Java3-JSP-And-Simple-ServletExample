<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Tag Example</title>
</head>
<body>

<c:set var="salary" scope="session" value="${2000*2}"/>
Salary is: <c:out value="${salary}"/>

<br/>
<a href="GoodbyeServlet" title="Bye">Bye</a>

</body>
</html>