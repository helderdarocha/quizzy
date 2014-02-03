<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. In the project properties
choose Build -> Compiling sources and use the Add Libray... button to add 
the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of available quizzes</title>
    </head>
    <body>

    <h1>List of available quizzes</h1>
    
    <form action="selectQuiz">
    <br><table border=1>
    <%
        Collection quizlist = (Collection)request.getAttribute("quizlist");
        Iterator it = quizlist.iterator();
        while (it.hasNext()) {
            Quiz q = (Quiz)it.next();
            out.println("<tr><td>"+<input type='checkbox' name='q' value='<%=q.getId() %>'>+"</td><td><a href="showQuiz?quiz=<%=q.getId() $%>"+q.getId()+"</a></td><td>" + q.getTitle() + "</td></tr>");
        }
        <button type="">Remove selected</button>
        <button type="">Publish selected</button>
    %></table>
    </form>
    
    </body>
</html>
