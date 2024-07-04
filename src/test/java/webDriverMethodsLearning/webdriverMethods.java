package webDriverMethodsLearning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("OrangeHRM,Inc")).click();
		Set<String> windowID =driver.getWindowHandles();
		System.out.println(windowID);
	}

}
