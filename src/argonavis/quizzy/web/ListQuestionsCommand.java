/*
 * ListQuestionsCommand.java
 * 
 * Created on 3 de Fevereiro de 2005, 20:55
 */

package argonavis.quizzy.web;

import java.util.*;
import argonavis.quizzy.ui.*;
import argonavis.quizzy.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Helder da Rocha
 */
public class ListQuestionsCommand extends Command {
    
    String nextUrl = "/";
    QuestionFacade questFac = new QuestionFacade();
    
    /** Creates a new instance of ListQuestionsCommand */
    public ListQuestionsCommand(String nextUrl) {
        this.nextUrl = nextUrl;
    }
    
    public String execute(HttpServletRequest request) {
       
        Collection<Question> questions = questFac.select(false);
        request.setAttribute("questions", questions);
        return nextUrl;
    }
    
}
