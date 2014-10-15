<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>书目详情</title>
</head>
<body>
	<ul>
		<li>ISBN:<s:property value="isbn" /></li>
		<li>Title:<s:property value="title" /></li>
		<li>Publisher:<s:property value="publisher" /></li>
		<li>Publishdate:<s:property value="publishDate" /></li>
		<li>Price:<s:property value="price" /></li>
		<li>Authorid:<s:property value="authorid" /></li>	
		<li>Name:<s:property value="name" /></li>
		<li>Age:<s:property value="age" /></li>
		<li>Country:<s:property value="country" /></li>
	</ul>
</body>
</html>