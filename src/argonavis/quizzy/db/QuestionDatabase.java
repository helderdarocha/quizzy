/*
 * Created on 17/01/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy.db;
import java.util.*;
import argonavis.quizzy.*;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class QuestionDatabase {
	public static QuestionDatabase getInstance() {
		return QuestionDatabaseMemoryImpl.getInstance();
	}
	public abstract Collection<Question> selectAll(boolean active);
	public abstract Question select(String id);
	public abstract void update(Question question);
	public abstract void remove(String id);
	public abstract void insert(Question question);
}
