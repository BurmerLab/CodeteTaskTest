<%@page import="pl.codete.generator.GeneratorCSVFile"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>GENERATOR</title>
  </head>
  <body>
     <%
    int fileNumber = Integer.parseInt(request.getParameter("count"));
    GeneratorCSVFile.generateCSVFileWithRandomValues(fileNumber);
    out.println("Generated number of files " + fileNumber);
    %>
  </body>
</html>
