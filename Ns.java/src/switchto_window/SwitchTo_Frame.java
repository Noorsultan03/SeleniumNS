package switchto_window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement Play_Btn=driver.findElement(By.cssSelector("button[class='ytp-large-play-button ytp-button']"));
		Play_Btn.click();
		
		driver.switchTo().defaultContent();
		WebElement Hotels=driver.findElement(By.xpath("//a[text()='HOTELS ']"));
		Hotels.click();
		
		WebElement Sign_in=driver.findElement(By.xpath("//button[text()='Sign in']"));
		Sign_in.click();
		Thread.sleep(5000);
		
		driver.switchTo().frame(1);
		WebElement Mobile_Num=driver.findElement(By.id("mobileNoInp"));
		Mobile_Num.clear();
		Mobile_Num.sendKeys("12346789");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		WebElement Close_Btn=driver.findElement(By.xpath("(//div[@title='close'])[3]"));
		Close_Btn.click();
		

	}

}
