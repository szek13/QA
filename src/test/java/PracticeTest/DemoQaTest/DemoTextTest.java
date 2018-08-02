package PracticeTest.DemoQaTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PracticeTest.BaseTest;
import PracticeTest.DemoQaPages.Constants;
import PracticeTest.DemoQaPages.HomePage;

public class DemoTextTest extends BaseTest{
	
HomePage home = new HomePage();
	
	@BeforeClass
	public void openHomePage() {
		driver.navigate().to(Constants.BASE_URL);
	}
	
	@Test
	public void demoTextIsDisplayed() {
		
		Assert.assertEquals(home.demoButton(),"https://demoqa.com/tabs/");
	}

}
