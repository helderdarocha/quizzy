/*
 * TestServlet.java
 *
 * Created on 6 de Fevereiro de 2005, 01:30
 */

package argonavis.quizzy.web;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;

/**
 *
 * @author helder
 * @version
 */
public class TestServlet extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    
    Map<String, Command> commandMap = new HashMap<String, Command>();
    
    public void init() {
        commandMap.put("/createQuestion", new CreateQuestionCommand("/listQuestions"));
        commandMap.put("/listQuestions", new ListQuestionsCommand("/list_questions.jsp"));
        commandMap.put("/listQuizzes", new ListQuizzesCommand("/list_quizzes.jsp"));
        commandMap.put("/createQuiz", new CreateQuizCommand("/listQuizzes"));
        commandMap.put("/editQuiz", new EditQuizCommand("/list_quizzes.jsp"));
        commandMap.put("/addQuestion", new AddQuestionCommand("/showQuiz"));
        commandMap.put("/showQuiz", new ShowQuizCommand("/edit_quiz.jsp"));
        commandMap.put("/newQuestion", new RedirectCommand("/new_question.html"));
        commandMap.put("/newQuiz", new RedirectCommand("/new_quiz.jsp"));
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String commandString = request.getServletPath();
        Command command = commandMap.get(commandString);
        if (command == null) {
            command = new RedirectCommand("/index.html");
        }
        String path = command.execute(request);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
        dispatcher.forward(request, response);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
