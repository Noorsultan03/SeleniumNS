package xpath_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Element_Outertext 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).clear();
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).sendKeys("software testing");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Automation Testing']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Selenium']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Cucumber']")).click();

	}

}
