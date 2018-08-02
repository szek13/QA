package PracticeTest.DemoQaTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PracticeTest.BaseTest;
import PracticeTest.DemoQaPages.Constants;
import PracticeTest.DemoQaPages.HomePage;
import junit.framework.Assert;

public class HomePageTest extends BaseTest{
	
	HomePage home = new HomePage();
	
	@BeforeClass
	public void openHomePage() {
		driver.navigate().to(Constants.BASE_URL);
	}
	
	@Test
	public void checHomePage() {
		WebElement string = home.homeBar();
		Assert.assertTrue(string != null);
	}
	
	@Test
	public void checknavBar() {
		WebElement string1 = home.siteNavigation();
		Assert.assertTrue(string1 != null);
	}
}
