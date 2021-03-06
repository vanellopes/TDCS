<%@ include file="/WEB-INF/views/include.jsp" %>

<aside class="main-sidebar sidebar-dark-primary elevation-4">
	<a href="#" class="brand-link">
		<img src="<c:url value="/static/dist/img/AdminLTELogo.png"/>"
	       alt="AdminLTE Logo"
	       class="brand-image img-circle elevation-3"
	       style="opacity: .8">
		<span class="brand-text font-weight-light">DentalClinic</span>
	</a>
	
	<div class="sidebar">
		<div class="user-panel mt-3 pb-3 mb-3 d-flex">
			<div class="image">
				<img src="<c:url value="/static/dist/img/user2-160x160.jpg"/>" class="img-circle elevation-2" alt="User Image">
			</div>
			<div class="info">
				<a href="#" class="d-block">Secretariado</a>
			</div>
		</div>
	
		<nav class="mt-2">
			<ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
				<li class="nav-item">
					<a href="<c:url value="index.jsp"/>" class="nav-link">
						<i class="nav-icon fas fa-th"></i>Home
					</a>
				</li>
				<li class="nav-item">
					<a href="<c:url value="listado-odontologo"/>" class="nav-link">
						<i class="nav-icon fas fa-user-md"></i>Odontologos
					</a>
				</li>
				<li class="nav-item">
					<a href="<c:url value="nuevo-odontologo"/>" class="nav-link">
						<i class="nav-icon fas fa-user-md"></i>Nuevo Odontologo
					</a>
				</li>
				<li class="nav-item">
					<a href="<c:url value="listado-paciente"/>" class="nav-link">
						<i class="nav-icon fas fa-tooth"></i>Pacientes
					</a>
				</li>
				<li class="nav-item">
					<a href="<c:url value="nuevo-paciente"/>" class="nav-link">
						<i class="nav-icon fas fa-tooth"></i>Nuevo Paciente
					</a>
				</li>
				<li class="nav-item">
					<a href="<c:url value="#"/>" class="nav-link">
						<i class="nav-icon fas fa-calendar"></i>Turnos
					</a>
				</li>
			</ul>
		</nav>
	</div>
</aside>