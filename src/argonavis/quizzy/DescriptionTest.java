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
public class DescriptionTest extends TestCase {

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(DescriptionTest.class);
	}
	
	String text = "Test Description";
	Description description = new Description(text);

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
	 * Constructor for DescriptionTest.
	 * @param arg0
	 */
	public DescriptionTest(String arg0) {
		super(arg0);
	}

	public final void testGetText() {
		//TODO Implement getText().
		assertEquals("Test Description", description.getText());
	}

	public final void testSetText() {
		//TODO Implement setText().
		description.setText("Bogus");
		assertEquals("Bogus", description.getText());
	}

	public final void testEquals() {
		//TODO Implement equals().
		Description other = new Description("Test Description");
		assertTrue(description.equals(other));
	}

}
