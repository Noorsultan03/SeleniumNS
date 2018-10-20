package switchto_window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Alert 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		WebElement search_button=driver.findElement(By.cssSelector("input[class='w70 blueBtn f13']"));
		search_button.click();
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		String alertmsg=alert.getText();
		System.out.println(alertmsg);
		
		
		alert.accept();
		

	}

}
