package argonavis.quizzy;

import java.util.*;

public class SingleOptionAnswer extends Answer {
	
	private List<Option> options;
	private Option correct;
	
	/**
	 * @param correct
	 * @param options
	 */
	public SingleOptionAnswer() {
		super();
		options = new ArrayList<Option>();
	}
	
	/**
	 * @param correct
	 * @param options
	 */
	public SingleOptionAnswer(Option correct, List<Option> options) {
		this();
		this.correct = correct;
		this.options = options;
	}
/**
	 * @param options The options to set.
	 */
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	/**
	 * @return Returns the options.
	 */
	public List getOptions() {
		return options;
	}
	/**
	 * @return Returns specified option.
	 */
	public Option getOption(int number) {
		return options.get(number);
	}
	/**
	 * @return Set specified option.
	 */
	public void setOption(int number, Option option) {
		options.set(number, option);
	}
	/**
	 * @return Adds an option.
	 */
	public void addOption(Option option) {
		options.add(option);
	}
	/**
	 * @return Removes an option.
	 */
	public void removeOption(int number) {
		options.remove(number);
	}
	
	/**
	 * @param correct The correct to set.
	 */
	public void setCorrectOption(Option correct) {
		this.correct = correct;
		correct.setCorrect(true); // redundant in this mode.
	}
	/**
	 * @return Returns the correct.
	 */
	public Option getCorrectOption() {
		return correct;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SingleOptionAnswer)) return false;
		SingleOptionAnswer soa = (SingleOptionAnswer)obj;
		return super.equals(obj) && soa.options.equals(this.options);
	}
	
}