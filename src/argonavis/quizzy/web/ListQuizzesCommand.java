/*
 * ListQuizzesCommand.java
 *
 * Created on 8 de Fevereiro de 2005, 14:08
 */

package argonavis.quizzy.web;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author helder
 */
public class ListQuizzesCommand extends Command {
    String nextUrl = "/";
    /** Creates a new instance of ListQuizzesCommand */
    public ListQuizzesCommand(String nextUrl) {
        this.nextUrl = nextUrl;
    }
    
    public String execute(HttpServletRequest request) {
        return nextUrl;
    }
    
}
