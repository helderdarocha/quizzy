package argonavis.quizzy;

import java.util.*;

public class Description {
	
	private String text;
	private List<String> images;
	
	
	
		/**
	 * @param text
	 */
	public Description(String text) {
		super();
		this.text = text;
	}
/**
	 * @return Returns the text.
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text The text to set.
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	public boolean equals(Object other) {
		if ( !(other instanceof Description)) return false;
		Description d = (Description) other;
		return d.getText().equals(d.getText());
	}
}