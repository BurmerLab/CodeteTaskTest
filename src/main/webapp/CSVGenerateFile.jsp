<%-- 
    Document   : CSVGenerateFile
    Created on : 2014-02-25, 22:18:15
    Author     : Michał
--%>

<%@page import="pl.codete.generator.GeneratorCSVFile"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
     <%
    int fileNumber = Integer.parseInt(request.getParameter("count"));
    out.println("test: " + fileNumber);
    
    GeneratorCSVFile.generateCSVFileWithRandomValues(fileNumber);
  
    %>
  </body>
</html>
