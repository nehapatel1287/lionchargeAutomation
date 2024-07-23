package dropdownAutomate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapSelectDropdown {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	
	//Select the single option from bootstrap dropdown
	driver.findElement(By.xpath("//button[conains(@class,'multiselect']")).click();
	
	//Select single option
	driver.findElement(By.xpath("//input[@value='java']")).click();
	
	//select all the option
	List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	System.out.println("number of options" + options.size());
	
	// printing option from the dropdown
	
//	for(WebElement op : options) {
//		System.out.println(op.getText());
//	}
	
	//select multiple options
	for(WebElement op : options) {
		if(op.getText().equals("Java") || op.getText().equals("Python")) {
			op.click();
		}
	}
	}

}
