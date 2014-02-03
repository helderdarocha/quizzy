package argonavis.quizzy;

public class Question {
	
	private String id;
	private Description questionDescription;
	private Description solutionDescription;
	private Answer answer;
	
	/**
	 * @param questionDescription
	 * @param answer
	 */
	public Question(String questionDescription, Answer answer) {
		super();
		this.questionDescription = new Description(questionDescription);
		this.answer = answer;
	}
	
	/**
	 * @param questionDescription
	 * @param answer
	 */
	public Question(Description questionDescription, Answer answer) {
		super();
		this.questionDescription = questionDescription;
		this.answer = answer;
	}
	/**
	 * @param id
	 * @param questionDescription
	 * @param solutionDescription
	 * @param answer
	 */
	public Question(String id, Description questionDescription,
			Description solutionDescription, Answer answer) {
		super();
		this.id = id;
		this.questionDescription = questionDescription;
		this.solutionDescription = solutionDescription;
		this.answer = answer;
	}
	/**
	 * @return Returns the answer.
	 */
	public Answer getAnswer() {
		return answer;
	}
	/**
	 * @param answer The answer to set.
	 */
	public void setAnswer(Answer answer) {
		this.answer = answer;
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
	 * @return Returns the questionDescription.
	 */
	public Description getQuestionDescription() {
		return questionDescription;
	}
	/**
	 * @return Returns the questionDescription.
	 */
	public String getQuestionDescriptionAsText() {
		return questionDescription.getText();
	}
	/**
	 * @param questionDescription The questionDescription to set.
	 */
	public void setQuestionDescription(Description questionDescription) {
		this.questionDescription = questionDescription;
	}
	/**
	 * @param questionDescription The questionDescription to set.
	 */
	public void setQuestionDescription(String descriptionText) {
		questionDescription.setText(descriptionText);
	}
	/**
	 * @return Returns the solutionDescription.
	 */
	public Description getSolutionDescription() {
		return solutionDescription;
	}
	/**
	 * @param solutionDescription The solutionDescription to set.
	 */
	public void setSolutionDescription(Description solutionDescription) {
		this.solutionDescription = solutionDescription;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if ( !(obj instanceof Question)) return false;
		Question other = (Question) obj;
		return id.equals(other.id);
	}
}