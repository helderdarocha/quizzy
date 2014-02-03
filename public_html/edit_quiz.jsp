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
        <title>Edit Quiz</title>
    </head>
    <body>

    <h1>Edit Quiz</h1>
    
    <form action="editQuiz">
    
    <%
        Quiz quiz = (Quiz)request.getAttribute("quiz");
    %>
    
    <p>Quiz Title: 
    <input type="text" name="test_title" value="<%=quiz.getTitle()%>"/>
    <p>Quiz description<br>
    <textarea rows="5" cols="60" name="test_description" value="<%=quiz.getDescription().getText()%>"></textarea>
    <p>List of questions
    <br><table border=1>
    <%
        Collection questions = (Collection)request.getAttribute("questions");
        Iterator it = questions.iterator();
        while (it.hasNext()) {
            Question q = (Question)it.next();
            out.println("<tr><td>"+q.getId()+"</td><td>" + q.getQuestionDescriptionAsText() + "</td></tr>");
        }
    %></table>
    <br><a href="/list_questions.jsp?quiz=<%=quiz.getId() %>">Add Question</a>
    
    <br><button type="submit">Save Changes</button>
    </form>
    
    </body>
</html>
