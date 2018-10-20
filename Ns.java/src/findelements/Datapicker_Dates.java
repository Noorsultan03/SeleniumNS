package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datapicker_Dates 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("dpt_date")).click();
		
		for (int i = 0; i <=2; i++) 
		{
			WebElement Current_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
			List<WebElement> clickable_links;
			clickable_links=Current_Month.findElements(By.tagName("a"));
			
			for (int j = 0; j < clickable_links.size(); j++) 
			{
				WebElement Each_link=clickable_links.get(j);
				Each_link.click();
				Thread.sleep(1000);
				
				driver.findElement(By.className("cal_openLink")).click();
				Thread.sleep(1000);
				
				Current_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
				clickable_links=Current_Month.findElements(By.tagName("a"));

			}
			
			driver.findElement(By.id("cal_showNextMonth")).click();
			Thread.sleep(2000);

			
		}
		

	}

}
