package fb_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_class 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		/*dr1iver.findElement(By.id("email")).clear();
		/driver.findElement(By.id("email")).sendKeys("laskdnks");
		/driver.findElement(By.id("pass")).clear();
		/driver.findElement(By.id("pass")).sendKeys("ansdjj");
		*/
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.xpath("//a[@data-pid='23']")).click();
	}

}
