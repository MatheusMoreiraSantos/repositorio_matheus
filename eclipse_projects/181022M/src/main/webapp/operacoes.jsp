<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
	
<html>

<head>
<meta charset="ISO-8859-1">
<title>Calculadora JSP</title>
</head>


<body>

	<% 
	float num1 = Float.parseFloat(request.getParameter("vlr1"));
	float num2 = Float.parseFloat(request.getParameter("vlr2"));
	float total = 0f;
	
	String oper = request.getParameter("btn");
	
	if (oper.equals("+"))
		total = num1+num2;
	else
		if (oper.equals("-"))
			total = num1-num2;
		else
			if (oper.equals("*"))
				total = num1*num2;
			else
				if (oper.equals("/"))
					total = num1/num2;
				else
		 			if (oper.equals("%"))
		 				total = ((num1 * num2)/100);
		 			else
		 				if (oper.equals("R%"))
		 					total = num1 % num2;
		 	
	out.println("<div class 'resultado'> <h2> O resultado é: " + total+"</h2></div>");

	%>
	
</body>