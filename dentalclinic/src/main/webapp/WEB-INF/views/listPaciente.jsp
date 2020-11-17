<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title>Pacientes</title></head>
  <body>
    <h1></h1>
    <h3>Pacientes</h3>
    <c:forEach items="${model.pacientes}" var="pac">
      <c:out value="${pac.nombres}"/> <c:out value="${pac.apellidos}"/><br><br>
    </c:forEach>
  </body>
</html>