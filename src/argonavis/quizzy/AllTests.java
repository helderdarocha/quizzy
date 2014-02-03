package argonavis.quizzy;

import junit.framework.*;

public class AllTests {
	public static Test suite() {
		TestSuite testSuite = new TestSuite("argonavis.quizzy");
		testSuite.addTestSuite(OptionTest.class);
		testSuite.addTestSuite(AnswerTest.class);
		testSuite.addTestSuite(DescriptionTest.class);
		testSuite.addTestSuite(QuestionTest.class);
		testSuite.addTestSuite(QuizTest.class);
		testSuite.addTestSuite(SingleOptionAnswerTest.class);
		
		testSuite.addTest(argonavis.quizzy.ui.AllTests.suite());
		testSuite.addTest(argonavis.quizzy.db.AllTests.suite());
		return testSuite;
	}
}