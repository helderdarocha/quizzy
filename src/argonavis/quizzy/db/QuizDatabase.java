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
public abstract class QuizDatabase {
	/**
	 * Returns default (dummy) implementation.
	 * @return
	 */
	public static QuizDatabase getInstance() {
		return QuizDatabaseMemoryImpl.getInstance();
	}
	public abstract Collection<Quiz> selectAll(boolean active);
	public abstract Quiz select(String id);
	public abstract void update(Quiz quiz);
	public abstract void remove(String id);
	public abstract void insert(Quiz quiz);
}
