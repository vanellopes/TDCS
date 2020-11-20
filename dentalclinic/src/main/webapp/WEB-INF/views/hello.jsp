
<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<%-- <%@ include file="/WEB-INF/views/head.jsp" %> --%>
 <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>DentalClinic</title>
	 <meta name="viewport" content="width=device-width, initial-scale=1">

  <link href="<c:url value="/static/plugins/fontawesome-free/css/all.min.css" />" rel="stylesheet">
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <link href="<c:url value="/static/dist/css/adminlte.min.css" />" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>

<body class="hold-transition sidebar-mini">
<div class="wrapper">
<%@ include file="/WEB-INF/views/fragments/sidebar.jsp" %>
<div class="content-wrapper">
	<section class="content" style="margin-left:250px;">

		<div class="card">
			<div class="card-header">
				<h3 class="card-title">Próximos turnos</h3>

				<div class="card-tools">
					<button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
						<i class="fas fa-minus"></i>
					</button>
					<button type="button" class="btn btn-tool" data-card-widget="remove" data-toggle="tooltip" title="Remove">
						<i class="fas fa-times"></i>
					</button>
				</div>
			</div>
			<div class="card-body p-0">
				<c:choose>
					<c:when test="${model.odontologo==null}">
						<h1>No hay turnos asignados en este momento</h1>
					</c:when>
					<c:otherwise>
						<table class="table table-striped projects">
							<thead>
								<tr>
									<th style="width: 1%">
										#
									</th>
									<th style="width: 20%">
										Nombre y Apellido
									</th>
									<th style="width: 20%">
										Telefono
									</th>
									<th>
										Email
									</th>
									<th style="width: 18%" class="text-center">
										Hora
									</th>
									<th style="width: 20%">
										Confirmado
									</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${model.odontologo}" var="odontologo">
									<tr>
										<td>
											
										</td>
										<td>
											<a>
												
											</a>
											<br/>
											<small>
												
											</small>
										</td>
										<td>
											
										</td>
										<td class="project_progress">
											<c:out value="${odontologo.nombre}"/>
										</td>
										<td class="project-state">
											21/12/2020 10:00 <span class="badge badge-success">Confirmada</span>
										</td>
										<td class="project-actions text-right">
											<a class="btn btn-primary btn-sm" href="#">
												<i class="fas fa-folder">
												</i>
												Ver
											</a>
											<a class="btn btn-info btn-sm" href="#">
												<i class="fas fa-pencil-alt">
												</i>
												Editar
											</a>
											<a class="btn btn-danger btn-sm" href="#">
												<i class="fas fa-trash">
												</i>
												Dar de Baja
											</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</c:otherwise>
				</c:choose>
			</div>
		</div>

	</section>
</div>
	<aside class="control-sidebar control-sidebar-dark"></aside>

</div>
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>
</body>
</html>
