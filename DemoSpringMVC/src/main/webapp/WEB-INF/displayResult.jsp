<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<!-- YH: Display the data passed from a ModelAndView in MathController --> 
	<!-- YH: Question how variable "request" is available? --> 
	Result is <%= request.getAttribute("result") %>
	
	<!-- YH: Display result by expression language (EL), make sure in the head we set isELIgnored="false" --> 
	<br>
	Result is ${result} 
	
	
</body>
</html>