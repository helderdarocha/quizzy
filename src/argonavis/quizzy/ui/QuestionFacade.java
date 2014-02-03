/*
 * Created on 17/01/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy.ui;

import argonavis.quizzy.Description;
import argonavis.quizzy.Question;
import argonavis.quizzy.Answer;
import argonavis.quizzy.db.QuestionDatabase;
import java.util.*;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class QuestionFacade {
	private Question newQuestion;
	private QuestionDatabase database;
	
	public QuestionFacade() {
		database = QuestionDatabase.getInstance();
	}
	
	public String createNewQuestion(String descriptionText, String solutionText, Answer answer) {
		String id = generateId();
		Description description = new Description(descriptionText);
		Description solution = new Description(solutionText);
		newQuestion = new Question(id, description, solution, answer);
		database.insert(newQuestion);
		return id;
	}
	
	public String createNewQuestion(String descriptionText) {
		return this.createNewQuestion(descriptionText, "", null);
	}
	
	// select (find, show) question
	public Collection<Question> select(boolean active) {
		Collection<Question> questionList = database.selectAll(active);
		return questionList;
	}
	
	public Question select(String id) {
		return database.select(id);
	}
	
	// edit (update) question
	public void edit(String id, String descriptionText, String solutionText, Answer answer) {
       Question question = database.select(id);
	   if (descriptionText != null) {
	   	   question.setQuestionDescription(descriptionText);
	   }
	   if (solutionText != null) {
	   	   question.setSolutionDescription(new Description(solutionText));
	   }
	   if (answer != null) {
	   	   question.setAnswer(answer);
	   }
	   database.update(question);
	}
	
    // remove question
	public void remove(String id) {
		database.remove(id);
	}
	
	public String generateId() {
		return "" + (int)(Math.random() * 1000000);
	}
}
