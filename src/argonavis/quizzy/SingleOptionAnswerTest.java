/*
 * Created on 13/01/2005
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
public class SingleOptionAnswerTest extends TestCase {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(SingleOptionAnswerTest.class);
	}
	
	SingleOptionAnswer object;
	List<Option> fixtureList = new ArrayList<Option>();

	/*
	 * @see TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		object = new SingleOptionAnswer();
		fixtureList.add(new Option("Option 1", object));
		fixtureList.add(new Option("Option 2", object));
		object.setOptions(fixtureList);
	}

	/*
	 * @see TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		object = null;
	}

	/**
	 * Constructor for SingleOptionAnswerTest.
	 * @param arg0
	 */
	public SingleOptionAnswerTest(String arg0) {
		super(arg0);
	}

	public final void testSetOptions() {
		//TODO Implement setOptions().
		List<Option> localList = new ArrayList<Option>();
		localList.add(new Option("Option 3", object));
		localList.add(new Option("Option 4", object));
		object.setOptions(localList);
		assertEquals(localList, object.getOptions());
	}

	public final void testGetOptions() {
		//TODO Implement getOptions().
		assertEquals(fixtureList, object.getOptions());
	}

	public final void testGetOption() {
		//TODO Implement getOption().
		assertEquals(fixtureList.get(1), object.getOption(1));
	}

	public final void testSetOption() {
		//TODO Implement setOption().
		Option option = new Option("Option 5", object);
		object.setOption(1, option);
		assertEquals(object.getOption(1), option);
	}

	public final void testAddOption() {
		//TODO Implement addOption().
		Option option = new Option("Option 6", object);
		object.addOption(option);
		assertEquals(object.getOption(2), option);
	}

	public final void testRemoveOption() {
		//TODO Implement removeOption().
		object.removeOption(1);
		assertEquals(1, object.getOptions().size());
	}

	public final void testSetCorrect() {
		//TODO Implement setCorrect().
		object.setCorrectOption(object.getOption(1));
		assertTrue(object.getOption(1).isCorrect());
		assertEquals(object.getCorrectOption(), object.getOption(1));
	}

	public final void testGetCorrect() {
		//TODO Implement getCorrect().
		assertNull(object.getCorrectOption());
		object.setCorrectOption(object.getOption(1));
		assertNotNull(object.getCorrectOption());
		assertEquals(object.getCorrectOption(), object.getOption(1));
	}

	public final void testEquals() {
		//TODO Implement equals().
		SingleOptionAnswer other = new SingleOptionAnswer();
		assertFalse(object.equals(other));
		other.setOptions(fixtureList);
		assertEquals(object, other);
	}

}
