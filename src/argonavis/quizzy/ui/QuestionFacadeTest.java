/*
 * Created on 03/02/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy.ui;

import argonavis.quizzy.Description;
import argonavis.quizzy.Option;
import argonavis.quizzy.Question;
import argonavis.quizzy.Quiz;
import argonavis.quizzy.SingleOptionAnswer;
import java.util.*;
import junit.framework.TestCase;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class QuestionFacadeTest extends TestCase {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(QuestionFacadeTest.class);
	}
	
	QuestionFacade facade = new QuestionFacade();
	SingleOptionAnswer answer;
	String stdId, lastId;

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		answer = new SingleOptionAnswer();
		answer.addOption(new Option("Option 1", answer));
		answer.addOption(new Option("Option 2", answer));
		stdId = facade.createNewQuestion("Test Question", "Test Solution", answer);
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/*
	 * Class under test for String createNewQuestion(String, String, Answer)
	 */
	public final void testCreateNewQuestionStringStringAnswer() {
		//TODO Implement createNewQuestion().
	}

	/*
	 * Class under test for String createNewQuestion(String)
	 */
	public final void testCreateNewQuestionString() {
		//TODO Implement createNewQuestion().
	}

	/*
	 * Class under test for void select(boolean)
	 */
	public final void testSelectboolean() {
		//TODO Implement select().
		Collection<Question> all = facade.select(false); // all quizzes
	}

	public final void testEdit() {
		//TODO Implement edit().
		facade.edit(stdId, null, null, null);
	    Question test = facade.select(stdId);
	    assertEquals("Test Question", test.getQuestionDescriptionAsText());
		assertEquals("Test Solution", test.getSolutionDescription().getText());
		assertEquals(answer, test.getAnswer());
		
		facade.edit(stdId, "New Description", null, null);
	    test = facade.select(stdId);
	    assertEquals("New Description", test.getQuestionDescriptionAsText());
	    assertEquals("Test Solution", test.getSolutionDescription().getText());
		assertEquals(answer, test.getAnswer());
		
		facade.edit(stdId, null, "New Solution", null);
	    test = facade.select(stdId);
	    assertEquals("New Description", test.getQuestionDescriptionAsText());
	    assertEquals("New Solution", test.getSolutionDescription().getText());
		assertEquals(answer, test.getAnswer());
		
		SingleOptionAnswer newAnswer = new SingleOptionAnswer();
		newAnswer.addOption(new Option("New Option 1", answer));
		newAnswer.addOption(new Option("New Option 2", answer));
		facade.edit(stdId, "Test Question", "New Test Solution", newAnswer);
	    test = facade.select(stdId);
	    assertEquals("Test Question", test.getQuestionDescriptionAsText());
	    assertEquals("New Test Solution", test.getSolutionDescription().getText());
		assertEquals(newAnswer, test.getAnswer());
	}

	public final void testRemove() {
		//TODO Implement remove().
		facade.remove(stdId);
		Question test = facade.select(stdId);
		assertNull(test);
	}

	public final void testGenerateId() {
		//TODO Implement generateId().
	}

	public final void testEquals() {
		//TODO Implement equals().
	}

}
