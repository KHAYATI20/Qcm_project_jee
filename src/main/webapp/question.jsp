<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="services.*,dbtable.*,java.util.*"%>
    <jsp:useBean  id="forme" class="dbtable.forme"  scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! List<question> listqst = new ArrayList<question>(); 
   List<reponse> listrsp = new ArrayList<reponse>();
    String question; String reponse;%>
   <%
     listqst =Dquestion.getQuestions(forme.getFormeId());
     for( question q : listqst){
   %>
	 <%= q.getQuestionId()%><b><%= q.getQuestionLib()%></b><br/>
	  <form action="" method="get">
	   <% 
	     listrsp =Dreponse.getReponseFor(q.getQuestionId()); 
	     for(reponse r : listrsp){ 
	   %>
		   <input type="radio" name="repQ<%=q.getQuestionId() %>"" value="<%=r.getReponseId()%>"><label><%= r.getReponseLib() %> </label><br/>
	  <% } %> 
	   </form>
   <% } %>


</body>
</html>