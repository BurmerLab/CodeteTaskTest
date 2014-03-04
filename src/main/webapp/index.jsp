<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generator File</title>
    </head>
    <body>
      <form action="CSVGenerateFile.jsp" method="get">
        <p>Insert number of files to generate:</p>
        <input type="text" name="count"/>
        <p>Insert type of system you use:</p>
        <select name="system">
          <option>windows</option>
          <option>linux</option>
        </select>
        <input type="submit" value="Do Dziela"/>
      </form>
    </body>
</html>
