/*
 * CreateQuizCommand.java
 *
 * Created on 8 de Fevereiro de 2005, 14:09
 */

package argonavis.quizzy.web;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author helder
 */
public class CreateQuizCommand extends Command {
    String nextUrl = "/";
    /** Creates a new instance of CreateQuizCommand */
    public CreateQuizCommand(String nextUrl) {
        this.nextUrl = nextUrl;
    }
    
    public String execute(HttpServletRequest request) {
        return nextUrl;
    }
    
}
