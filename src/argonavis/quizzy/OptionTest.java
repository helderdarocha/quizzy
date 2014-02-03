/*
 * Created on 13/01/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy;

import junit.framework.TestCase;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class OptionTest extends TestCase {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(OptionTest.class);
	}
	
	Answer answer = new SingleOptionAnswer();
	Option option = new Option("Option 1", answer);

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Constructor for OptionTest.
	 * @param arg0
	 */
	public OptionTest(String arg0) {
		super(arg0);
	}

	/*
	 * Class under test for void Option(String, Answer)
	 */
	public final void testOptionStringAnswer() {
		//TODO Implement Option().
	}

	/*
	 * Class under test for void Option(String, boolean, Answer)
	 */
	public final void testOptionStringbooleanAnswer() {
		//TODO Implement Option().
	}

	public final void testSetText() {
		//TODO Implement setText().
		option.setText("New Text");
		assertEquals("New Text", option.getText());
	}

	public final void testGetText() {
		//TODO Implement getText().
		assertEquals("Option 1", option.getText());
	}

	public final void testSetCorrect() {
		//TODO Implement setCorrect().
		option.setCorrect(true);
		assertTrue(option.isCorrect());
	}

	public final void testIsCorrect() {
		//TODO Implement isCorrect().
		assertFalse(option.isCorrect());
	}
	
	public final void testSetSelected() {
		//TODO Implement setCorrect().
		option.setSelected(true);
		assertTrue(option.isSelected());
	}

	public final void testIsSelected() {
		//TODO Implement isCorrect().
		assertFalse(option.isSelected());
	}

	public final void testSetParent() {
		//TODO Implement setParent().
		Answer newAnswer = new SingleOptionAnswer();
		assertEquals(newAnswer, option.getParent());
	}

	public final void testGetParent() {
		//TODO Implement getParent().
		assertEquals(answer, option.getParent());
	}

	/*
	 * Class under test for boolean equals(Object)
	 */
	public final void testEqualsObject() {
		//TODO Implement equals().
		Option other = new Option("Option 1", answer);
		assertEquals(option, other);		
	}

}
