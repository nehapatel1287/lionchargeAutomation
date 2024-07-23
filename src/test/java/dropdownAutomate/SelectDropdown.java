package dropdownAutomate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpContryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select(drpContryEle);
		
		drpCountry.selectByVisibleText("France");
		drpCountry.selectByValue("japan");
		drpCountry.selectByIndex(2);
		
		//capture the all the options from the dropdown
		
		List<WebElement> options = drpCountry.getOptions();
		System.out.println(options.size());
		for(WebElement opt:options) {
			System.out.println(opt.getText());
					}
		
		
	}

}
