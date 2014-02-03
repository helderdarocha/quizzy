/*
 * Created on 17/01/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy;

import junit.framework.TestCase;
import java.util.*;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class QuizTest extends TestCase {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(QuizTest.class);
	}

	String id;
	Description description;
	String title;
	Quiz quiz;
	Question q1;
	Question q2;
	List<Question> questions;
	
	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		id = "testID";
		description = new Description("Quiz description");
		title = "Quiz title";
		quiz = new Quiz(id, description, title);
		q1 = createTestQuestion("1");
		q2 = createTestQuestion("2");
		questions = new ArrayList<Question>();
		questions.add(q1);
		questions.add(q2);
	}
	
	private Question createTestQuestion(String number) {
		SingleOptionAnswer answer = new SingleOptionAnswer();
		answer.addOption(new Option("Option 1", answer));
		answer.addOption(new Option("Option 2", answer));
		Question question = new Question("Question " + number, answer);
		question.setId(number);
		return question;
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Constructor for QuizTest.
	 * @param arg0
	 */
	public QuizTest(String arg0) {
		super(arg0);
	}

	public final void testQuiz() {
		//TODO Implement Quiz().
	}

	public final void testGetDescription() {
		//TODO Implement getDescription().
		assertEquals(description.getText(), quiz.getDescription().getText());
	}

	public final void testSetDescription() {
		//TODO Implement setDescription().
		quiz.setDescription(new Description("New Description"));
		assertEquals("New Description", quiz.getDescription().getText());
	}

	public final void testGetId() {
		//TODO Implement getId().
		assertEquals(id, quiz.getId());
	}

	public final void testSetId() {
		//TODO Implement setId().
		quiz.setId("New ID");
		assertEquals("New ID", quiz.getId());
	}

	public final void testGetTitle() {
		//TODO Implement getTitle().
		assertEquals(title, quiz.getTitle());
	}

	public final void testSetTitle() {
		//TODO Implement setTitle().
		quiz.setTitle("New Title");
		assertEquals("New Title", quiz.getTitle());
	}

	public final void testGetQuestions() {
		//TODO Implement getQuestions().
		List<Question> questions = quiz.getQuestions();
		assertNull(questions);
	}

	public final void testSetQuestions() {
		//TODO Implement setQuestions().
		List<Question> questions2 = new ArrayList<Question>();
		questions2.add(createTestQuestion("3"));
		questions2.add(createTestQuestion("4"));
		quiz.setQuestions(questions2);
		assertEquals(questions2, quiz.getQuestions());
	}

	public final void testGetQuestion() {
		//TODO Implement getQuestion().
		quiz.setQuestions(questions);
		Question q = quiz.getQuestion(1);
		assertEquals(q2, q);
	}

	public final void testSetQuestion() {
		//TODO Implement setQuestion().
		quiz.setQuestions(questions);
		Question newQ = createTestQuestion("5");
		quiz.setQuestion(1, newQ);
		assertEquals(newQ, quiz.getQuestion(1));
	}

	public final void testAddQuestion() {
		//TODO Implement addQuestion().
		quiz.setQuestions(questions);
		quiz.addQuestion(createTestQuestion("6"));
		assertEquals(3, quiz.getQuestions().size());
	}

	public final void testRemoveQuestion() {
		//TODO Implement removeQuestion().
		quiz.setQuestions(questions);
		quiz.removeQuestion(1);
		assertEquals(1, quiz.getQuestions().size());
		assertEquals(q1, quiz.getQuestion(0));
	}

	public final void testEquals() {
		//TODO Implement equals().
		Quiz other = new Quiz(id, description, title);
		assertEquals(quiz, other);
		other.setId("different");
		assertFalse(quiz.equals(other));
	}
	
	public final void testSetActive() {
		quiz.setActive(true);
		assertTrue(quiz.isActive());
		quiz.setActive(false);
		assertFalse(quiz.isActive());
	}

}
