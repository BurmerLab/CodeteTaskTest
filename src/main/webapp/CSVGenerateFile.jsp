<%@page import="pl.codete.generator.GeneratorFactory"%>
<%@page import="pl.codete.generator.CSVActions"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>GENERATOR</title>
  </head>
  <body>
     <%
    int filesCount = Integer.parseInt(request.getParameter("count"));
    String systemType = request.getParameter("system");
    
    CSVActions actions = new CSVActions(GeneratorFactory.createGenerator(systemType));
    actions.runApplication(filesCount);
    out.println("Generated All Files");
    %>
    
  </body>
</html>
