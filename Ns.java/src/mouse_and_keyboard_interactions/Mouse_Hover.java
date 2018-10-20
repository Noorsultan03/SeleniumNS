package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		WebElement Products_Menu=driver.findElement(By.linkText("Products"));
		
		Actions action=new Actions(driver);
		action.moveToElement(Products_Menu).perform();
		Thread.sleep(5000);
		
		WebElement Cards_Menu=driver.findElement(By.linkText("Cards"));
		action.moveToElement(Cards_Menu).build().perform();
		Thread.sleep(5000);
		
		WebElement Credit_card=driver.findElement(By.linkText("Credit Cards"));
		action.click(Credit_card).perform();
		

	}

}
