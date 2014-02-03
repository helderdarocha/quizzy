package argonavis.quizzy;

import java.util.*;

public class Quiz {
	
	private String id;
	private Description description;
	private String title;
	private List<Question> questions;
	private boolean active = false;
	
			/**
	 * @return Returns the active.
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active The active to set.
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
/**
	 * @param id
	 * @param description
	 * @param title
	 */
	public Quiz(String id, Description description, String title) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
	}
/**
	 * @return Returns the description.
	 */
	public Description getDescription() {
		return description;
	}
	/**
	 * @param description The description to set.
	 */
	public void setDescription(Description description) {
		this.description = description;
	}
	/**
	 * @return Returns the id.
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id The id to set.
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return Returns the title.
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title The title to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return Returns the questions.
	 */
	public List<Question> getQuestions() {
		return questions;
	}
	/**
	 * @param questions The questions to set.
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	/**
	 * @return Returns specified question.
	 */
	public Question getQuestion(int number) {
		return questions.get(number);
	}
	/**
	 * @return Set specified question.
	 */
	public void setQuestion(int number, Question question) {
		questions.set(number, question);
	}
	/**
	 * @return Adds a question.
	 */
	public void addQuestion(Question question) {
		questions.add(question);
	}
	/**
	 * @return Removes a question.
	 */
	public void removeQuestion(int number) {
		questions.remove(number);
	}
	
	public boolean equals(Object obj) {
		if ( !(obj instanceof Quiz)) return false;
		Quiz other = (Quiz) obj;
		return other.id.equals(id);
	}
}