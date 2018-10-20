package fb_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Creating_an_account 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_j")).clear();
		driver.findElement(By.id("u_0_j")).sendKeys("vcbgsj123");
		driver.findElement(By.id("u_0_l")).clear();
		driver.findElement(By.id("u_0_l")).sendKeys("ndhu");
		driver.findElement(By.id("u_0_o")).clear();
		driver.findElement(By.id("u_0_o")).sendKeys("254685");
		driver.findElement(By.id("u_0_v")).clear();
		driver.findElement(By.id("u_0_v")).sendKeys("byj25sj");
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("20");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Nov");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2009");
		driver.findElement(By.id("u_0_a")).click();
		driver.findElement(By.id("u_0_11")).click();


	}

}
