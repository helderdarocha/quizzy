/*
 * RedirectCommand.java
 *
 * Created on 8 de Fevereiro de 2005, 14:11
 */

package argonavis.quizzy.web;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author helder
 */
public class RedirectCommand extends Command {
    String nextUrl = "/";
    /** Creates a new instance of RedirectCommand */
    public RedirectCommand(String nextUrl) {
        this.nextUrl = nextUrl;
    }
    
    public String execute(HttpServletRequest request) {
        return nextUrl;
    }
    
}
