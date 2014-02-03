/*
 * Created on 17/01/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy.db;

import argonavis.quizzy.Quiz;
import java.util.*;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class QuizDatabaseMemoryImpl extends QuizDatabase {
	
	Map<String,Quiz> quizMap;
	
	private static QuizDatabaseMemoryImpl instance = new QuizDatabaseMemoryImpl();
	private QuizDatabaseMemoryImpl() {
		quizMap = new HashMap<String,Quiz>();
	}
	public static QuizDatabase getInstance() {
		return instance;
	}

	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuizDatabase#insert(argonavis.quizzy.Quiz)
	 */
	public void insert(Quiz quiz) {
		// TODO Auto-generated method stub
		// check if it does not exist
		quizMap.put(quiz.getId(), quiz);
	}
	
	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuizDatabase#remove(java.lang.String)
	 */
	public void remove(String id) {
		// TODO Auto-generated method stub
		// check if it exists
		quizMap.remove(id);
	}
	
	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuizDatabase#select()
	 */
	public Quiz select(String id) {
		// TODO Auto-generated method stub
		return quizMap.get(id);
	}
	
	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuizDatabase#selectAll(boolean)
	 */
	public Collection<Quiz> selectAll(boolean active) {
		// TODO Auto-generated method stub
		// if active, select only active quizzes
		return quizMap.values();
	}
	
	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuizDatabase#update(argonavis.quizzy.Quiz)
	 */
	public void update(Quiz quiz) {
		// TODO Auto-generated method stub
		// check if it exists
		quizMap.put(quiz.getId(), quiz);
	}
}
