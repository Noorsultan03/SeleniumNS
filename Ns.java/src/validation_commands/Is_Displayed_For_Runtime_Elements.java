package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_For_Runtime_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		WebElement More_Options=driver.findElement(By.xpath("//a[@id='MoreOptionsLink']"));
		More_Options.click();
		Thread.sleep(5000);
		
		WebElement travel_class=driver.findElement(By.xpath("//*[@id='Class']"));
		WebElement airlines=driver.findElement(By.xpath("//input[@name='airline']"));
		
		if(travel_class.isDisplayed() && airlines.isDisplayed())
			System.err.println("Testpass :--> Both elements is visible at web page");
		else
			System.err.println("Testfail :--> Both elements is hidden at web page");
		
		More_Options.click();
		Thread.sleep(5000);
		
		if(!travel_class.isDisplayed() && !airlines.isDisplayed())
			System.err.println("Testpass :--> Both elements is hidden at web page");
		else
			System.err.println("Testpass :--> Both elements is visible at web page");
		
	}

}
