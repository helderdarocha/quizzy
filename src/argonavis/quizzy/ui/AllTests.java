/*
 * Created on 17/01/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package argonavis.quizzy.ui;

import junit.framework.*;

/**
 * @author Helder da Rocha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AllTests {
	public static Test suite() {
		TestSuite testSuite = new TestSuite("argonavis.quizzy.ui");
		testSuite.addTestSuite(QuestionFacadeTest.class);
		testSuite.addTestSuite(QuizFacadeTest.class);
		return testSuite;
	}
}