<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produtos</title>
</head>
<body>

	<form:form modelAttribute="produto">
	
		<form:label path="">nome</form:label>
		<form:input path="nome"/>
		
		<form:label path="">Fornecedor :</form:label>
		<form:input path="fornecedor.nome"/>
		
		<form:label path="">categoria do produto :</form:label>
		<form:input path="categorias[0].nome"/>
		<form:input path="categorias[1].nome"/>
		<form:button type="submit">enviar</form:button>
	
	</form:form>


</body>
</html>