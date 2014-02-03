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
public class QuestionTest extends TestCase {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(QuestionTest.class);
	}

	SingleOptionAnswer answer;
	Question question;
	Description questionText;
	Description solutionText;
	String id = "testID";

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		answer = new SingleOptionAnswer();
		answer.addOption(new Option("Option 1", answer));
		answer.addOption(new Option("Option 2", answer));
		questionText = new Description("Question 1");
		solutionText = new Description("Solution 1");
		question = new Question(id, questionText, solutionText, answer);
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		question = null;
		answer = null;
	}

	/**
	 * Constructor for QuestionTest.
	 * @param arg0
	 */
	public QuestionTest(String arg0) {
		super(arg0);
	}

	/*
	 * Class under test for void Question(String, Answer)
	 */
	public final void testQuestionStringAnswer() {
		//TODO Implement Question().
	}

	/*
	 * Class under test for void Question(Description, Answer)
	 */
	public final void testQuestionDescriptionAnswer() {
		//TODO Implement Question().
	}

	/*
	 * Class under test for void Question(String, Description, Description, Answer)
	 */
	public final void testQuestionStringDescriptionDescriptionAnswer() {
		//TODO Implement Question().
	}

	public final void testGetAnswer() {
		//TODO Implement getAnswer().
		assertEquals(answer, question.getAnswer());
	}

	public final void testSetAnswer() {
		//TODO Implement setAnswer().
		SingleOptionAnswer answer2 = new SingleOptionAnswer();
		answer2.addOption(new Option("Option 3", answer2));
		answer2.addOption(new Option("Option 4", answer2));
		question.setAnswer(answer2);
		assertEquals(answer2, question.getAnswer());
	}

	public final void testGetId() {
		//TODO Implement getId().
		assertEquals(id, "testID");
	}

	public final void testSetId() {
		//TODO Implement setId().
		question.setId("otherID");
		assertEquals(question.getId(), "otherID");
	}

	public final void testGetQuestionDescription() {
		//TODO Implement getQuestionDescription().
		assertEquals(questionText.getText(), question.getQuestionDescription().getText());
	}

	public final void testGetQuestionDescriptionAsText() {
		//TODO Implement getQuestionDescriptionAsText().
		assertEquals(questionText.getText(), question.getQuestionDescriptionAsText());
	}

	/*
	 * Class under test for void setQuestionDescription(Description)
	 */
	public final void testSetQuestionDescriptionDescription() {
		//TODO Implement setQuestionDescription().
		question.setQuestionDescription(new Description("NewQuestionDescription"));
		assertEquals("NewQuestionDescription", question.getQuestionDescriptionAsText());
	}

	/*
	 * Class under test for void setQuestionDescription(String)
	 */
	public final void testSetQuestionDescriptionString() {
		//TODO Implement setQuestionDescription().
		question.setQuestionDescription("NewQuestionDescription2");
		assertEquals("NewQuestionDescription2", question.getQuestionDescriptionAsText());
	}

	public final void testGetSolutionDescription() {
		//TODO Implement getSolutionDescription().
		assertEquals(solutionText.getText(), question.getSolutionDescription().getText());
	}

	public final void testSetSolutionDescription() {
		//TODO Implement setSolutionDescription()
		question.setSolutionDescription(new Description("NewSolutionDescription"));
		assertEquals("NewSolutionDescription", question.getSolutionDescription().getText());
	}

	/*
	 * Class under test for boolean equals(Object)
	 */
	public final void testEqualsObject() {
		//TODO Implement equals().
		Description questionText = new Description("Question 1");
		Description solutionText = new Description("Solution 1");
		Question other = new Question(id, questionText, solutionText, answer);
		assertEquals(question, other);
		other.setId("different");
		assertFalse(other.equals(question));
	}

}
