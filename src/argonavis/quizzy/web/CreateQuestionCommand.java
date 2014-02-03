/*
 * CreateQuestionCommand.java
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
public class CreateQuestionCommand extends Command {
    
    QuestionFacade questFac = new QuestionFacade();
    String nextUrl = "/";
    
    /** Creates a new instance of CreateQuestionCommand */
    public CreateQuestionCommand(String nextUrl) {
        this.nextUrl = nextUrl;
    }
    
    public String execute(HttpServletRequest request) {
        String descriptionText = request.getParameter("question_description");
        String solutionText    = request.getParameter("answer_description");;
        SingleOptionAnswer answer = null;
        int listSize = Integer.parseInt(request.getParameter("size"));
        
        answer = new SingleOptionAnswer();
        List<Option> list = new ArrayList<Option>();
        for (int i = 0; i < listSize; i++) {
            list.add(new Option(request.getParameter("field_"+i), answer));
        }
		answer.setOptions(list);
        
        questFac.createNewQuestion(descriptionText, solutionText, answer);
        return nextUrl;
    }
    
}
