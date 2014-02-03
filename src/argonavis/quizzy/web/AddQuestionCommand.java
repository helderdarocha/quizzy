/*
 * AddQuestionCommand.java
 *
 * Created on 8 de Fevereiro de 2005, 14:10
 */

package argonavis.quizzy.web;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author helder
 */
public class AddQuestionCommand extends Command {
    String nextUrl = "/";
    /** Creates a new instance of AddQuestionCommand */
    public AddQuestionCommand(String nextUrl) {
        this.nextUrl = nextUrl;
    }
    
    public String execute(HttpServletRequest request) {
        return nextUrl;
    }
    
}
