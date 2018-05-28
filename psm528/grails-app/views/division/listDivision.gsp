<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>Division List</h1>

	<a href="createDivision.gsp">Add New Division</a>
	<table cellpadding="5" cellspacing="8">
		<thead>
			<tr>
				<td>Division</td>
				<td>Division Chief</td>
				<td>Action</td>
			</tr>
		</thead>
			<g:each var="divisionList" in="${divisionListInstance}">
		<tbody>
			<tr>
				<td>${divisionList.divisionName}</td>
				<td>${divisionList.chief.firstName} ${divisionList.chief.middleName} ${divisionList.chief.lastName}</td>
				<td><g:link action="editDivision" id="${divisionList.id}">Edit</g:link> <g:link action="viewDivision" id="${divisionList.id}">View</g:link></td>
			</tr>
		</tbody>
			</g:each>
	</table>
</body>
</html>