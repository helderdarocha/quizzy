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
        <title>Create New Quiz</title>
    </head>
    <body>

    <h1>Create New Quiz</h1>
    

    <form action="createQuiz">
    <p>Quiz Title
    <input type="text" name="test_title" />
    <p>Quiz description<br>
    <textarea rows="5" cols="60" name="test_description"></textarea>

    <br><button type="submit">Create</button>
    </form>

    </body>
</html>
