package dropdownAutomate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestedDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//target the textbox
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		// target the all suggested options
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@role='option']"));
		
		System.out.println(options.size());
		
		for(WebElement item:options) {
			if(item.getText().equals("selenium")) {
				item.click();
				break;
			}
		}
	}

}
