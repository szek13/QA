package PracticeTest.DemoQaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PracticeTest.BasePage;

public class HomePage extends BasePage{
	
	
	public WebElement homeBar() {
		WebElement element = driver.findElement(By.id("breadcrumbs"));
		return element;
	}
	
	public WebElement siteNavigation() {
		WebElement navigation = driver.findElement(By.id("site_navigation"));
		return navigation;
	}
	
	public String demoButton() {
		driver.findElement(By.xpath(".//*[@id='menu-item-66']/a")).click();
		driver.findElement(By.xpath(".//*[@id='menu-item-153']/a")).click();
		return driver.getCurrentUrl();
	}

}
