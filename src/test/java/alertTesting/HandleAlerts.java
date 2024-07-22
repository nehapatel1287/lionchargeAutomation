package alertTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//1.Normal alert with OK button
		driver.findElement(By.xpath(""));
		Thread.sleep(5000);
		Alert myalertAlert =driver.switchTo().alert();
		System.out.println(myalertAlert.getText());
		myalertAlert.accept();
		
		//2.Confirmation Alert with OK and cancel button
		driver.findElement(By.xpath(""));
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); //close alert using OK button
		driver.switchTo().alert().dismiss(); //close the alre using cancel button
		
		//prompt alert -Input box
		
		driver.findElement(By.xpath(""));
		Thread.sleep(5000);
		Alert myalert =driver.switchTo().alert();
		myalert.sendKeys("welcome");
		myalert.accept();
		
	}

}
