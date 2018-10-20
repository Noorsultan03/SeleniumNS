package switchto_window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_Trip 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(5);
		Thread.sleep(5000);
		WebElement Bell=driver.findElement(By.xpath("iframe[@name='webpush-bubble']/html/body/div"));
		Bell.click();
		

	}

}
