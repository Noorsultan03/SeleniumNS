package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Disabled 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		WebElement cal=driver.findElement(By.id("dpt_date"));
		cal.click();
		
		Thread.sleep(4000);
		WebElement Next_Button=driver.findElement(By.id("cal_showNextMonth"));
		Next_Button.click();
		Thread.sleep(2000);
		
		Next_Button.click();
		Thread.sleep(2000);
		
		Next_Button.click();
		Thread.sleep(2000);
		
		String Runtime_Class=Next_Button.getAttribute("class");
		
		if(Runtime_Class.contains("disabled"))
			System.err.println("Testpass :--> Element Disabled");
		else
			System.err.println("Testfail :--> Element Enabled");
		

	}

}
