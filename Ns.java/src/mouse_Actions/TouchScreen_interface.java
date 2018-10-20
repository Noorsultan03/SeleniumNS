package mouse_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.interactions.internal.Coordinates;

public class TouchScreen_interface {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://sampledomain.com/");
		driver.manage().window().maximize();
		
		
		//Enable touchactions on mobile interface
		
		TouchScreen touch=((HasTouchScreen)driver).getTouch();
		
		//Identity location of element
		WebElement Element=driver.findElement(By.id("xyz"));
		//get elemnet coordinates
		Coordinates obj_co=((Locatable)Element).getCoordinates();
		touch.singleTap(obj_co);
		
		

	}

}
