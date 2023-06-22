
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>

	<c:forEach var="dish" items="${favDishes}">
          ${dish} <br>
	</c:forEach><br><br>
	<c:forEach var="breed" items="${DogBreed}">
         ${dish} <br>
	</c:forEach><br><br>

