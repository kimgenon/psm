<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>View Division</h1>
	Division: <b>${divisionParamsInstanceView.divisionName}</b> <br/>
	Division Chief: <b>${divisionParamsInstanceView.chief.firstName} ${divisionParamsInstanceView.chief.middleName} ${divisionParamsInstanceView.chief.lastName}</b> <br/>

	<h3>Division Projects</h3>
%{-- 	<g:link controller="project" action="createProject" params="[chief:params.params]"> --}%
%{-- 		Add Project --}%
%{-- 	</g:link> --}%
	<g:form>
		<g:textField name="projectName" placeholder="Project Name"></g:textField><br/>	
		<g:actionSubmit value="Create Project" action="saveProject"/>
	</g:form>
	<table cellpadding="5" cellspacing="8">
		<thead>
			<tr>
				<td>Project Name</td>
				<td>Action</td>
			</tr>
		</thead>
			<g:each var="projectList" in="${projectListInstance}">
		<tbody>
			<tr>
				<td>${projectList.projectName}</td>
				<td><g:link>Edit</g:link> <g:link>View</g:link></td>
			</tr>
		</tbody>
			</g:each>
	</table>
	<h3>Project Managers</h3>
	<table cellpadding="5" cellspacing="8">
		<thead>
			<tr>
				<td>Project Manager</td>
				<td>Assigned Project</td>
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