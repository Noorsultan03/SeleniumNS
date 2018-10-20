package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_URL 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		
		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.urlContains("signin"));
		System.out.println("url verified");
		
		
		//Identify create account
		WebElement Create_Account_link=driver.findElement(By.xpath("//span[text()='Create account']"));
		Create_Account_link.click();
		
		
		//Wait until expected partial title presented
		wait.until(ExpectedConditions.urlContains("signup"));
		System.out.println("Create Account gmail url verified");


	}

}
