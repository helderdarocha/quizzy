package argonavis.quizzy;

public class Option {
	
	private String text;
	private boolean correct;
	private Answer parent;
	private boolean selected;
	
	/**
	 * @param text TODO
	 * @param correct TODO
	 * @param parent TODO
	 * 
	 */
	public Option(String text, Answer parent) {
		super();
		this.text = text;
		this.correct = false;
		this.parent = parent;
	}
	
	/**
	 * @param text TODO
	 * @param correct TODO
	 * @param parent TODO
	 * 
	 */
	public Option(String text, boolean correct, Answer parent) {
		super();
		this.text = text;
		this.correct = correct;
		this.parent = parent;
	}
	/**
	 * @param text The text to set.
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return Returns the text.
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param correct The correct to set.
	 */
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	/**
	 * @return Returns the correct.
	 */
	public boolean isCorrect() {
		return correct;
	}
	/**
	 * @param parent The parent to set.
	 */
	public void setParent(Answer parent) {
		this.parent = parent;
	}
	/**
	 * @return Returns the parent.
	 */
	public Answer getParent() {
		return parent;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Option)) return false;
		Option option = (Option)obj;
		return option.text.equals(this.text) && option.parent.equals(this.parent);
	}
	
	/**
	 * @return Returns the selected.
	 */
	public boolean isSelected() {
		return selected;
	}
	/**
	 * @param selected The selected to set.
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}