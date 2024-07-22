package checkboxFlow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningCheckbox {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//1. Select specific checkbox
		//driver.findElement(By.xpath("")).click();
		
		//2. Select all the chackboxes
		List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@class='formdata' and @type=checkbox]"));
//		for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
		
		for(WebElement checkbox : checkboxes) {
			checkbox.click();
			}
		
		//3. Select last 3 or 2 check boxes
		//total no of checkboxes- how many checkboxes want to select=index
		//7-3=4(starting index
		for(int i=4;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
			}
		
		//4/ Select first 3 0r 2 check boxes
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
		
		//5. Unselect checkboxed if they are selected
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			checkboxes.get(i).click();
		}
		
		
	}

}
