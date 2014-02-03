package argonavis.quizzy.ui;

import argonavis.quizzy.*;
import argonavis.quizzy.db.*;
import java.util.*;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class QuizFacade {
	
	private Quiz newQuiz;
	private QuizDatabase database;
	
	public QuizFacade() {
		database = QuizDatabase.getInstance();
	}
	
	public String createNewQuiz(String title, String descriptionText) {
		String id = generateId();
		Description description = new Description(descriptionText);
		newQuiz = new Quiz(id, description, title);
		database.insert(newQuiz);
		return id;
	}
	
	public String createNewQuiz(String title) {
		return this.createNewQuiz(title, "");
	}
	
	// publish quiz (activate)
	public void publish(String id) {
		Quiz quiz = database.select(id);
		quiz.setActive(true);
	}
	
	// unpublish quiz (disactivate)
	public void unpublish(String id) {
		Quiz quiz = database.select(id);
		quiz.setActive(false);
	}
	
	// select (find, show) quiz
	public Collection<Quiz> select(boolean active) {
		Collection<Quiz> quizList = database.selectAll(active);
		return quizList;
	}
	
	public Quiz select(String id) {
		return database.select(id);
	}
	
	// edit (update) quiz
	public void edit(String id, String title, String descriptionText) {
       Quiz quiz = database.select(id);
	   if (title != null) {
	   	   quiz.setTitle(title);
	   }
	   if (descriptionText != null) {
	   	   quiz.setDescription(new Description(descriptionText));
	   }
	   database.update(quiz);
	}
	
    // remove quiz
	public void remove(String id) {
		database.remove(id);
	}
	
	public String generateId() {
		return "" + (int)(Math.random() * 1000000);
	}

}
