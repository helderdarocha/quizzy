/*
 * Command.java
 *
 * Created on 7 de Fevereiro de 2005, 23:11
 */

package argonavis.quizzy.web;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author helder
 */
public abstract class Command {
    
    /** Creates a new instance of Command */
    public Command() {
    }
    
    public abstract String execute(HttpServletRequest request);
    
}
