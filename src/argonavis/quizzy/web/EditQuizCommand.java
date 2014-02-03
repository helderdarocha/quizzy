/*
 * EditQuizCommand.java
 *
 * Created on 8 de Fevereiro de 2005, 14:10
 */

package argonavis.quizzy.web;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author helder
 */
public class EditQuizCommand extends Command {
    String nextUrl = "/";
    /** Creates a new instance of EditQuizCommand */
    public EditQuizCommand(String nextUrl) {
        this.nextUrl = nextUrl;
    }
    
    public String execute(HttpServletRequest request) {
        return nextUrl;
    }
    
}
