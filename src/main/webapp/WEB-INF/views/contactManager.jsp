<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body>

	<div class="container mx-auto my-5">

		<!-- FORM -->
		<form:form id="" class="row g-3 border p-3" action="/contactManager/addContact" modelAttribute="contactForm" method="POST">

			<!-- NAME -->
			<div class="col-md-4">
				<label for="inputName" class="form-label">Nombre</label> <input
					type="text" class="form-control" id="inputName" name="name" required>
			</div>

			<!-- LAST NAME -->
			<div class="col-md-4">
				<label for="inputLastName" class="form-label">Apellido Paterno</label> <input
					type="text" class="form-control" id="inputLastName" name="lastName" required>
			</div>

			<!-- MOTHER'S LAST NAME -->
			<div class="col-md-4">
				<label for="inputMothersName" class="form-label">Apellido Materno</label> <input
					type="text" class="form-control" id="inputMothersName" name="motherLastName" required>
			</div>

			<!-- ADDRESS -->
			<div class="col-7">
				<label for="inputAddress" class="form-label">Direccion</label> <input
					type="text" class="form-control" id="inputAddress"
					placeholder="1234 Main St" name="address" required>
			</div>

			<!-- PHONE NUMBER -->
			<div class="col-md-5">
				<label for="inputPhoneNumber" class="form-label">Numero Telefono</label> <input
					type="number" class="form-control" id="inputPhoneNumber" name="phoneNumber" required>
			</div>

			<div class="col-12">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" id="gridCheck" required>
					<label class="form-check-label" for="gridCheck"> Confirma el envio </label>
				</div>
			</div>

			<div class="col-12">
				<button type="submit" class="btn btn-primary">Enviar</button>
			</div>
		</form:form>
	</div>
	
	<%-- <div class="container mx-auto my-5">
		<form:form id="" class="row g-3 border p-3" action="/contactManager/deleteContact" modelAttribute="contactForm" method="POST">
			<div class="col-md-5">
				<label for="inputDeleteContact" class="form-label">Eliminar Contacto</label> <input
					type="number" class="form-control" id="inputDeleteContact" name="deleteContact" required>
			</div>

			<div class="col-12">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" id="gridCheck" required>
					<label class="form-check-label" for="gridCheck"> Confirma el envio </label>
				</div>
			</div>

			<div class="col-12">
				<button type="submit" class="btn btn-primary">Enviar</button>
			</div>
		</form:form>	
	</div> --%>
	
	<!-- TABLE -->
	<section class="my-5">
		<table class="table container">
			<thead class="table-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Apellido paterno</th>
					<th scope="col">Apellido materno</th>
					<th scope="col">Direccion</th>
					<th scope="col">Telefono</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${contactList}" var="contact">
				<tr>
					<th scope="row"><c:out value="${contact.getId()}"></c:out></th>
					<td><c:out value="${contact.getName()}"></c:out></td>
					<td><c:out value="${contact.getLastName()}"></c:out></td>
					<td><c:out value="${contact.getMotherLastName()}"></c:out></td>
					<td><c:out value="${contact.getAddress()}"></c:out></td>
					<td><c:out value="${contact.getPhoneNumber()}"></c:out></td>
					<td>
					<a class="btn btn-primary" href="/contactManager/deleteContact?id=${contact.getId()}" role="button">Eliminar</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</section>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>