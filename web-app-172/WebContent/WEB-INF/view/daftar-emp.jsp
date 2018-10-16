<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<!-- form data employee -->
		<form action="employee" method="POST">
		<table>
			<tr>
				<td>Nama</td>
				<td>:</td>
				<td>
					<input type="text" name="name" />
				</td>
			</tr>
			<tr>
				<td>Alamat</td>
				<td>:</td>
				<td>
					<input type="text" name="address" />
				</td>
			</tr>
			<tr>
				<td>Kontak</td>
				<td>:</td>
				<td>
					<input type="text" name="contact" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td>
		<input type="submit" name="submit" value="Simpan" />
				</td>
			</tr>
		</table>
		</form>
		<hr/>
		<div id="kiri" style="float : left; width: 50%;">
			<table style="width: 100%;" border=1px;>
				<thead>
					<tr>
						<th>Nama</th>
						<th>Alamat</th>
						<th>Kontak</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${employees }" var="employee">
						<tr>
							<td>${employee.name }</td>
							<td>${employee.address }</td>
							<td>${employee.contact }</td>
							<td>
								<a onClick="deleteEmployee(${employee.id});" href="#">delete</a> |
								<a href="${pageContext.request.contextPath }/employee?idupd=${employee.id}">update</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div id="kanan" style="float: left;">
			<form action="employee" method="POST">
				<table>
				<input type="hidden" name="id" value="${employee.id }" />
					<tr>
						<td>Nama</td>
						<td>:</td>
						<td>
							<input type="text" name="name" value="${employee.name }" />
						</td>
					</tr>
					<tr>
						<td>Alamat</td>
						<td>:</td>
						<td>
							<input type="text" name="address" value="${employee.address }" />
						</td>
					</tr>
					<tr>
						<td>Kontak</td>
						<td>:</td>
						<td>
							<input type="text" name="contact" value="${employee.contact }" />
						</td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td>
				<input type="submit" name="submit-update" value="Update" />
						</td>
					</tr>
				</table>
		</form>
		</div>
	</div>
	<script>
		function deleteEmployee(id){
			var conf= confirm("are you sure delete this data ?");
			if(conf)
				window.location = "${pageContext.request.contextPath }/employee?id=" + id;			
			else
				return false;
		}
	</script>
</body>
</html>