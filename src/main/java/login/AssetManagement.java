package login;

import java.util.List;

import javax.swing.text.html.parser.DTD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssetManagement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://lc-fe-admin.antino.ca/");
		driver.manage().window().maximize();
		//Login as a admin
		WebElement usernameField = driver.findElement (By.cssSelector("input[name='username']"));
		usernameField.sendKeys("admin");
        WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
        passwordField.sendKeys("Admin@2023");
        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();
        //verify dashboard page
        Thread.sleep(10000);
        Boolean verifyNewPagElement = driver.findElement(By.cssSelector("div>h1[class='Navbar__left__heading']")).isDisplayed();
        if(verifyNewPagElement) {
        System.out.println("Login positive testcase: success");
        }
        else {
			System.out.println("Error" );
		}
        
       //Testcase1:Verify Asset Management navigation and page title
        
        WebElement assetManagmentBoolean=driver.findElement(By.cssSelector("a[href='/dashboard/asset-management']"));
        assetManagmentBoolean.click();
        
        String pageTitle= driver.findElement(By.className("Navbar__left__icon")).getText();
        System.out.println(pageTitle);
        if(pageTitle.equals("Asset Management")) {
        	System.out.println("pass");
        	        }else {
        	        	System.out.println("fail");
        	        }
        
        // Testcase2:verify table heading
        
        List <WebElement> table = driver.findElements(By.cssSelector("div[class=\"ag-header-row ag-header-row-column\"]>div"));
        System.out.println(table.size());
        for(int i=0; i<table.size();i++) {
        	WebElement cell= table.get(i);
        	String cellText= cell.getText();
        	System.out.println(cellText);
        }
        
        // Testcase3:Verify add but is clickable or not
        
        WebElement addButton= driver.findElement(By.xpath("//*[@class='button  button__primary ']"));
        addButton.click();
        
        String addAssetMangmentHeading = driver.findElement(By.className("Navbar__left__heading")).getText();
        if(addAssetMangmentHeading.equals("Create Station")) {
        	System.out.println("Add asset mangement page open: pass");
        }
        else {
        	System.out.println("Add asset mangement page open: fail");

        }
        
        //Testcase4:create a station and verify the successful message
        
        String stationNameText = "HudaMetro Station";
        WebElement stationName= driver.findElement(By.id("station_name"));
        stationName.sendKeys(stationNameText);
        
        
        WebElement latitude= driver.findElement(By.id("latitude"));
        latitude.sendKeys("55");
        
        WebElement longitude= driver.findElement(By.id("longitude"));
        longitude.sendKeys("55.55");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        
        //Date picker for date
        
        String month ="July";
        String date ="15";
        WebElement datepickBox = driver.findElement(By.cssSelector("input[placeholder='dd/mm/yyyy']"));
        js.executeScript("arguments[0].scrollIntoView(true);", datepickBox);
        datepickBox.click();
        
        //select the month from the calendar
        while (true) {
			String currentMonth=driver.findElement(By.xpath("//span[@class='nice-dates-navigation_current']")).getText();
			if(currentMonth.equals(month)) {
				break;
			}
			driver.findElement(By.xpath("//a[@class='nice-dates-navigation_next']")).click();
		}
        List<WebElement> allDates = driver.findElements(By.xpath("//span[@class='nice-dates-day']//span[@class='nice-dates-day_date']"));
       
		for(WebElement dt:allDates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
		WebElement support_person_name= driver.findElement(By.id("support_person_name"));
		support_person_name.sendKeys("Support");
		
		WebElement support_person_number= driver.findElement(By.id("support_person_number"));
		support_person_number.sendKeys("9283746578");
		
		WebElement support_person_email= driver.findElement(By.id("support_person_email"));
		support_person_email.sendKeys("Support@gmail.com");
		
		WebElement business_name= driver.findElement(By.id("business_name"));
		business_name.sendKeys("Support");
		
		WebElement load_balncing_toggle= driver.findElement(By.cssSelector("label[for='checkbox- is_load_balancing']"));
		js.executeScript("arguments[0].scrollIntoView(true);", load_balncing_toggle);
		load_balncing_toggle.click();
		
		WebElement available_load= driver.findElement(By.id("available_load"));
		available_load.sendKeys("30");
		
		WebElement billing_name= driver.findElement(By.cssSelector("input[name=\"billing_name\"]"));
		billing_name.sendKeys("Support");
		
		WebElement business_type= driver.findElement(By.xpath("//*[text()='Select business type']"));
		business_type.click();
		
		driver.findElement(By.xpath("//*[text()='Individual']")).click();
		
		WebElement gstIN= driver.findElement(By.cssSelector("input[placeholder='Enter GST IN']"));
		js.executeScript("arguments[0].scrollIntoView(true);", gstIN);
		gstIN.sendKeys("22AAAAA0000A1Z5");
		
		WebElement pan = driver.findElement(By.cssSelector("input[placeholder='Enter PAN ID']"));
		pan.sendKeys("ABCTY1234D");
		
		WebElement address1 = driver.findElement(By.xpath("//input[@placeholder='Enter address line 1']"));
		address1.sendKeys("ABCTY1234D");
		
		WebElement address2 = driver.findElement(By.xpath("//input[@placeholder='Enter address line 2']"));
		address2.sendKeys("ABCTY1234D");
		
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Enter pin code']"));
		pincode.sendKeys("122018");
		
		WebElement city = driver.findElement(By.xpath("//input[@placeholder='Enter city name']"));
		city.sendKeys("Gurugram");
		
		WebElement state = driver.findElement(By.xpath("//button[normalize-space()='Select state']"));
		js.executeScript("arguments[0].scrollIntoView(true);", state);
		state.click();
		
		driver.findElement(By.xpath("//*[text()='Arunachal Pradesh']")).click();
		
		WebElement create_station_button = driver.findElement(By.cssSelector("button[type='submit']"));
		js.executeScript("arguments[0].scrollIntoView(true);", create_station_button);
		create_station_button.click();
		
		String alert_el = driver.findElement(By.className("MuiAlert-message.css-1xsto0d")).getText();
		js.executeScript("arguments[0].scrollIntoView(true);", alert_el);
		System.out.println("submit successfully");
		if(alert_el.contains("Charging Station Created Successfully")) {
		System.out.println("submit successfully");
		}else {
			System.out.println("submisstion failed");
		}
		
		
		//Testcase5: verify the added Station name
		
		List<WebElement>  tableData = driver.findElements(By.xpath("//*[@role=\"row\"]/div[@role=\"gridcell\"]/div/u"));
		System.out.println("table data"+tableData);
		Thread.sleep(3000);
		for(WebElement td:tableData) {
			if(td.getText().equals(stationNameText)) {
				System.out.println("Data is present"+stationNameText);
				break;
			}else {
				System.out.println("Data not fount");
			}
		}
		
        driver.close();
	}

}
