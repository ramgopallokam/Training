<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="msg" value="I am a very Huge fan of You Sam"/>
	<p>Substring: ${fn:substring(msg, 7, 31)} </p>
	
<c:set var="name" value="My name is Nani"/>
		<p>SubstringAfter: ${fn:substringAfter(name, "is")} </p>

<c:set var="justastring" value="Welcome to the channel"/>
	<p> SubstringBefore: ${fn:substringBefore(justastring, "the")} </p>
<c:set var = "string1" value = "Hi, There."/> 
		<p>Lower case string: ${fn:toUpperCase(string1)} </p>
		
<c:set var="string" value="Thank YOU for CominG"/>   
	<p>Lower case string: ${fn:toLowerCase(string)} </p>

</body>
</html>