package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor_Highlight_Element 
{


	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor JS=((JavascriptExecutor)driver);
		
		WebElement text=driver.findElement(By.xpath("//div[@class='_5iyx']"));
		JS.executeScript("arguments[0].style.backgroundColor = '#00FF00'", text);
		
		JS.executeScript("arguments[0].style.outline = 'red solid 2px'",text);
		Thread.sleep(5000);


	}

}
