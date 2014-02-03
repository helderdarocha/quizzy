/*
 * Created on 17/01/2005
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
public class AnswerTest extends TestCase {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(AnswerTest.class);
	}
	
	Answer answer = new SingleOptionAnswer();

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
	 * Constructor for AnswerTest.
	 * @param arg0
	 */
	public AnswerTest(String arg0) {
		super(arg0);
	}

	public final void testIsCorrect() {
		//TODO Implement isCorrect().
		assertFalse(answer.isCorrect());
	}

	public final void testSetCorrect() {
		//TODO Implement setCorrect().
		answer.setCorrect(true);
		assertTrue(answer.isCorrect());
	}

	public final void testEquals() {
		//TODO Implement equals().
		Answer other = new SingleOptionAnswer();
		assertTrue(answer.equals(other));
		other.setCorrect(true);
		assertFalse(answer.equals(other));
	}

}
