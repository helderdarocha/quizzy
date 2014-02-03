/*
 * Created on 17/01/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy.ui;

import argonavis.quizzy.*;
import java.util.*;
import junit.framework.TestCase;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class QuizFacadeTest extends TestCase {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(QuizFacadeTest.class);
	}
	
	QuizFacade facade = new QuizFacade();
	String stdId = facade.createNewQuiz("Test Quiz", ""),
	       lastId;

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
	 * Constructor for QuizFacadeTest.
	 * @param arg0
	 */
	public QuizFacadeTest(String arg0) {
		super(arg0);
	}

	public final void testQuizFacade() {
		//TODO Implement QuizFacade().
	}

	/*
	 * Class under test for void createNewQuiz(String, String)
	 */
	public final void testCreateNewQuizStringString() {
		//TODO Implement createNewQuiz().
		String id = facade.createNewQuiz("New Quiz", "This is a new Quiz");
		Quiz added = facade.select(id);
		assertEquals(id, added.getId());
		assertEquals("New Quiz", added.getTitle());
		assertEquals("This is a new Quiz", added.getDescription().getText());
		lastId = id;
	}

	/*
	 * Class under test for void createNewQuiz(String)
	 */
	public final void testCreateNewQuizString() {
		//TODO Implement createNewQuiz().
		String id = facade.createNewQuiz("Other New Quiz");
		Quiz added = facade.select(id);
		assertEquals(id, added.getId());
		assertEquals("Other New Quiz", added.getTitle());
		assertEquals("", added.getDescription().getText());
		lastId = id;
	}

	public final void testPublish() {
		//TODO Implement publish().
		Quiz test = facade.select(stdId);
		facade.publish(stdId);
		assertTrue(test.isActive());
	}

	public final void testUnpublish() {
		//TODO Implement unpublish().
		Quiz test = facade.select(stdId);
		facade.unpublish(stdId);
		assertFalse(test.isActive());
	}

	public final void testSelect() {
		//TODO Implement select().
		Collection<Quiz> all = facade.select(false); // all quizzes
		//assertEquals(3, all.size()); // Singleton problem
	}

	public final void testEdit() {
		//TODO Implement edit().
	    facade.edit(stdId, null, null);
	    Quiz test = facade.select(stdId);
	    assertEquals("Test Quiz", test.getTitle());
		assertEquals("", test.getDescription().getText());
		
		facade.edit(stdId, "New Title", null);
	    test = facade.select(stdId);
	    assertEquals("New Title", test.getTitle());
		assertEquals("", test.getDescription().getText());
		
		facade.edit(stdId, null, "New Description");
	    test = facade.select(stdId);
	    assertEquals("New Title", test.getTitle());
		assertEquals("New Description", test.getDescription().getText());
		
		facade.edit(stdId, "Test Quiz", "New Test Description");
	    test = facade.select(stdId);
	    assertEquals("Test Quiz", test.getTitle());
		assertEquals("New Test Description", test.getDescription().getText());
	}

	public final void testRemove() {
		//TODO Implement remove().
		facade.remove(stdId);
		Quiz test = facade.select(stdId);
		assertNull(test);
	}

	public final void testGenerateId() {
		//TODO Implement generateId().
	}

	public final void testEquals() {
		//TODO Implement equals().
	}

}
