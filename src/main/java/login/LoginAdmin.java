package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAdmin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://lc-fe-admin.antino.ca/");
		driver.manage().window().maximize();
		
		//Testcase:1 (verify browser  title)
		
		String title=driver.getTitle();
		if(title.equals("LionCharge | Admin")) {
			System.out.println("Title of the website :Test Passed");
		}else {
			System.out.println("Title Of the website: Test Failed");
		}
		
		//Testcase: 2 ( Verify the login side image)
		
		WebElement imageEle=driver.findElement(By.tagName("img"));
		String altTag=imageEle.getAttribute("alt");
		
		if(altTag.equals("loginImage")) {
			System.out.println("Login Image: Test Passed");
		}else {
			System.out.println("Login Image: Test Failed");
		}
		
		//Testcase: 3 (Verify the login with wrong credential )
		
//			WebElement usernameField = driver.findElement (By.cssSelector("input[name='username']"));
//			usernameField.sendKeys("admin1");
//	        WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
//	        passwordField.sendKeys("Admin@20231");
//	        WebElement loginButton = driver.findElement(By.tagName("button"));
//	        loginButton.click();
//	        Thread.sleep(10000);
//	        Boolean verifyNewPagElement = driver.findElement(By.cssSelector("div>h1[class='Navbar__left__heading']")).isDisplayed();
//	        if(verifyNewPagElement) {
//	        System.out.println("Login positive testcase: success");
//	        }
//	        else {
//				System.out.println("Error" );
//			}
	
		//Testcase : 4 (Verify the login with right credential)
	        			
			WebElement usernameField1 = driver.findElement (By.cssSelector("input[name='username']"));
			usernameField1.sendKeys("admin");
			WebElement passwordField1 = driver.findElement(By.cssSelector("input[name='password']"));
			passwordField1.sendKeys("Admin@2023");
			WebElement loginButton1 = driver.findElement(By.tagName("button"));
			loginButton1.click();
			Thread.sleep(15000);
			Boolean validationMessage= driver.findElement(By.cssSelector("span[class='Input__validation__message']")).isDisplayed();
			if(validationMessage) {
				System.out.println("validation message passed successfully");
			}else {
				System.out.println("validation message Faild");
			}
			
		//Testcase : 5 (verify the error message while login when user name is wrong)
//			WebElement usernameField2 = driver.findElement (By.cssSelector("input[name='username']"));
//			usernameField2.sendKeys("admin1");
//			WebElement passwordField2 = driver.findElement(By.cssSelector("input[name='password']"));
//			passwordField2.sendKeys("Admin@2023");
//			WebElement loginButton2 = driver.findElement(By.tagName("button"));
//			loginButton2.click();
//			Thread.sleep(10000);
//			String expMessage= driver.findElement(By.cssSelector("span[class='Input__validation__message']")).getText();
//			System.out.println("expMessage"+expMessage);
//			String actualMessage = "user with admin1 not found";
//			if(expMessage.equals(actualMessage)) {
//				System.out.println("Validation message passed successfully");
//			}else {
//				System.out.println("Validation message Faild");
//			}
			
			//Testcase : 5 (verify the error message while login when password is wrong)
//			WebElement usernameField3 = driver.findElement (By.cssSelector("input[name='username']"));
//			usernameField3.sendKeys("admin");
//			WebElement passwordField3 = driver.findElement(By.cssSelector("input[name='password']"));
//			passwordField3.sendKeys("Admin@20231");
//			WebElement loginButton3 = driver.findElement(By.tagName("button"));
//			loginButton3.click();
//			Thread.sleep(10000);
//			String expMessage= driver.findElement(By.cssSelector("span[class='Input__validation__message']")).getText();
//			System.out.println("expMessage"+expMessage);
//			String actualMessage = "user with admin1 not found";
//			if(expMessage.equals(actualMessage)) {
//				System.out.println("Validation message passed successfully");
//			}else {
//				System.out.println("Validation message Faild");
//			}
			
		
		driver.close();
	}

}

