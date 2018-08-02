package PracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PracticeTest.DemoQaPages.Constants;

public class BasePage {
	
	public static WebDriver driver;
	public static WebDriver wait;
	
	Constants cons = new Constants();
	
	public void initSetup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(Constants.BASE_URL);
		driver.manage().window().maximize();
	}
	
	public void tearDown() {
		driver.close();
		if(driver.equals(null)) {
			driver.quit();
		}
	}

}
