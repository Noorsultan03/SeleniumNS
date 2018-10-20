package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_By 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/car-loan-emi-calculator");
		driver.manage().window().maximize();
		
		WebElement Price_Slider=driver.findElement(By.xpath("//*[@id=\"js-rangeslider-0\"]/div[2]"));
		int objx=Price_Slider.getLocation().getX();
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(Price_Slider,objx , 450).build().perform();

	}

}
