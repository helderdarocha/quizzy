<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" import="java.util.*, argonavis.quizzy.*, argonavis.quizzy.ui.*" %>
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
        <title>List of available questions</title>
    </head>
    <body>

    <h1>List of available questions</h1>
    <form action="addQuestions">
    <br><table border=1>
    <%
        Collection questions = (Collection)request.getAttribute("questions");
        Iterator it = questions.iterator();
        while (it.hasNext()) {
            Question q = (Question)it.next();
            out.println("<tr><td>"+<input type='checkbox' name='q' value='<%=q.getId() %>'>+"</td><td>"+q.getId()+"</td><td>" + q.getQuestionDescriptionAsText() + "</td></tr>");
        }
        String quizId = request.getParameter("quiz");
    %></table>
    <input type="hidden" name="quiz" value="<%=quizId %>" />
    <button type="submit">Include these questions in Quiz <%=quizId %></button>
    </form>
    
    
    </body>
</html>
