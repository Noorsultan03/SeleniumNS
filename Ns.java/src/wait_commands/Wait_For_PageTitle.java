package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_PageTitle 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.titleIs("Gmail"));
		System.out.println("Title verified");
		
		WebElement Create_Account_button=driver.findElement(By.xpath("//span[text()='Create account']"));
		Create_Account_button.click();
		
		wait.until(ExpectedConditions.titleContains("Create your Google Account"));
		System.out.println("Create google account title verified");

	}

}
