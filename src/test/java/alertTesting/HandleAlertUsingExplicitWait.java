package alertTesting;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(10) );
		driver.get("");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(""));
		Alert myalert =mywait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
	}

}
