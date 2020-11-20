<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <title>DentalClinic | Listado Pacientes</title>
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
		<section class="content-header">
			<div class="container-fluid">
				<div class="row mb-2">
					<div class="col-sm-6">
						
					</div>
					<div class="col-sm-6">
						<ol class="breadcrumb float-sm-right">
							
						</ol>
					</div>
				</div>
			</div>
		</section>
		<section class="content">

	      <div class="card">
	        <div class="card-header">
	          <h3 class="card-title">Pacientes</h3>
	
	          <div class="card-tools">
	            <button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
	              <i class="fas fa-minus"></i></button>
	            <button type="button" class="btn btn-tool" data-card-widget="remove" data-toggle="tooltip" title="Remove">
	              <i class="fas fa-times"></i></button>
	          </div>
	        </div>
	        <div class="card-body p-0">
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
	                          Historia Clinica
	                      </th>
	                      <th style="width: 20%">
	                          Telefono
	                      </th>
	                      <th>
	                          Email
	                      </th>
	                      <th style="width: 18%" class="text-center">
	                          Proxima cita
	                      </th>
	                      <th style="width: 20%">
	                      </th>
	                  </tr>
	              </thead>
	              <tbody>
	                <c:forEach items="${model.pacientes}" var="paciente">
	                  <tr>
	                      <td>
	                          #
	                      </td>
	                      <td>
	                           ${paciente.nombre}, ${paciente.apellido}
	                      </td>
	                      <td>
	                          ${paciente.numHistoriaClinica}
	                      </td>
	                      <td>
	                          <small>+54 9</small> 351 <b>351-3513</b>
	                      </td>
	                      <td class="project_progress">
	                          <c:out value="${paciente.email}"/>
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
	        </div>
	      </div>
	
	    </section>
</div>
	<aside class="control-sidebar control-sidebar-dark"></aside>

</div>
<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>
</body>
</html>
