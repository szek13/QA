package PracticeTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends BasePage{
	
	@BeforeClass
	public void openBrowser() {
		initSetup();
	}
	
	@AfterClass
	public void closebrowser() {
		tearDown();
	}

}
