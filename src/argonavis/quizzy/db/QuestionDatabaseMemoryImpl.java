/*
 * Created on 03/02/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy.db;

import java.util.*;

import argonavis.quizzy.Question;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class QuestionDatabaseMemoryImpl extends QuestionDatabase {
	
	Map<String,Question> questionMap;
	
	private static QuestionDatabaseMemoryImpl instance = new QuestionDatabaseMemoryImpl();
	private QuestionDatabaseMemoryImpl() {
		questionMap = new HashMap<String,Question>();
	}
	public static QuestionDatabase getInstance() {
		return instance;
	}

	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuestionDatabase#selectAll(boolean)
	 */
	public Collection<Question> selectAll(boolean active) {
		// TODO Auto-generated method stub
		return questionMap.values();
	}

	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuestionDatabase#select(java.lang.String)
	 */
	public Question select(String id) {
		// TODO Auto-generated method stub
		return questionMap.get(id);
	}

	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuestionDatabase#update(argonavis.quizzy.Question)
	 */
	public void update(Question question) {
		// TODO Auto-generated method stub
		questionMap.put(question.getId(), question);
	}

	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuestionDatabase#remove(java.lang.String)
	 */
	public void remove(String id) {
		// TODO Auto-generated method stub
		questionMap.remove(id);
	}

	/* (non-Javadoc)
	 * @see argonavis.quizzy.db.QuestionDatabase#insert(argonavis.quizzy.Question)
	 */
	public void insert(Question question) {
		// TODO Auto-generated method stub
		questionMap.put(question.getId(), question);
	}

}
