<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>DentalClinic | Nuevo Paciente</title>
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
						<h1>Nuevo Paciente</h1>
					</div>
					<div class="col-sm-6">
						<ol class="breadcrumb float-sm-right">
							<li class="breadcrumb-item"><a href="#">Home</a></li>
							<li class="breadcrumb-item active">Nuevo paciente</li>
						</ol>
					</div>
				</div>
			</div>
		</section>
	
		<section class="content">
		<form id="frmIngreso" name="input" action="nuevo-paciente" method="post">
				<div class="row">
					<div class="col-md-6">
						<div class="card card-primary">
							<div class="card-header">
								<h3 class="card-title">General</h3>
				
								<div class="card-tools">
									<button type="button" class="btn btn-tool" data-card-widget="collapse" data-toggle="tooltip" title="Collapse">
										<i class="fas fa-minus"></i>
									</button>
								</div>
							</div>
							<div class="card-body">
							<div class="form-group">
						          <!-- Text input-->
						          <label class="control-label" for="input01" style="float:left;width:140px">Num Documento</label>	          
						          <div class="controls">
						            <input type="number" class="input-xlarge" id="txtDNI" name="txtDNI"  max="99999999" min="1" required>
						           </div>
					    		</div>
					    
							    <div class="form-group">
							          <!-- Text input-->
							          <label class="control-label" for="input01" style="float:left;width:140px">Nombre</label>
							          <div class="controls">
							            <input type="text" class="input-xlarge" name="txtNombre" id="txtNombre" maxlength="30" required>
							          </div>
							    </div>
							    
							    <div class="form-group">
							          <!-- Text input-->
							          <label class="control-label" for="input01" style="float:left;width:140px">Apellido</label>
							          <div class="controls">
							            <input type="text"  class="input-xlarge"  name="txtApellido" id="txtApellido" maxlength="30" required>
							          </div>
							    </div>
							    
							    <div class="form-group">
							          <!-- Text input-->
							          <label class="control-label" for="input01" style="float:left;width:140px">Fecha Nac</label>
							          <div class="controls">	
							          	<input type="date" class="input-xlarge" name ="fecha" id="fecha" required>		      
							          </div>
					    		</div>
							    
							    <div class="form-group">
							          <!-- Text input-->
							          <label class="control-label" for="input01" style="float:left;width:140px">Telefono</label>
							          <div class="controls">
							            <input type="number" class="input-xlarge" name ="txtTelefono" min="1" max="99999999" required>
							          </div>
							    </div>
							    
							    <div class="form-group">
							          <!-- Text input-->
							          <label class="control-label" for="input01" style="float:left;width:140px">Historia Clinica</label>
							          <div class="controls">
							            <input type="text" class="input-xlarge" name ="txtMatricula" maxlength="200">
							          </div>
							    </div>
							    
							    <div class="form-group">
							          <!-- Text input-->
							          <label class="control-label" for="input01" style="float:left;width:140px">Email</label>
							          <div class="controls">
							            <input type="email" class="input-xlarge" name ="txtEmail" maxlength="50">
							          </div>
							    </div>
							
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-12">
						<a href="#" class="btn btn-secondary">Cancelar</a>
						<input type="submit" value="Crear nuevo paciente" class="btn btn-success ">
					</div>
				</div>
				</form>
		</section>
	</div>

	<aside class="control-sidebar control-sidebar-dark"></aside>
</div>

<%@ include file="/WEB-INF/views/fragments/footer.jsp" %>
   
 



</body>
</html>
