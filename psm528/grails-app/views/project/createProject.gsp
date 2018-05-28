<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<h1>Create Project</h1>

	<g:form controller="project">
		<g:textField name="projectName" placeholder="Project Name"></g:textField><br/>	
		<g:actionSubmit value="Create Project" action="saveProject"/>
	</g:form>
</body>
</html>