package clear_trip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Air_ticket_booking 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/?gclid=EAIaIQobChMIi8GD_Nmr3QIVlomPCh2FVQI6EAAYASAAEgIXpfD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("hyd");
		Thread.sleep(6000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("mum");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Mumbai, IN - Chatrapati Shivaji Airport (BOM)")).click();
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.linkText("22")).click();
		driver.findElement(By.id("SearchBtn")).click();
		driver.close();

	}

}
