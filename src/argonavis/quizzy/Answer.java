package argonavis.quizzy;

public class Answer {
	
	private boolean correct = false;
	
	/**
	 * @return Returns the correct.
	 */
	public boolean isCorrect() {
		return correct;
	}
	/**
	 * @param correct The correct to set.
	 */
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	public boolean equals(Object other) {
		if ( !(other instanceof Answer)) return false;
		Answer a = (Answer) other;
		return a.isCorrect() == isCorrect();
	}
}