package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.interactions.internal.Coordinates;


public class TouchActions {

	public static void main(String[] args) 
	{
		//Keyboard interface class
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		//Enable Touch controls on automation browser
		TouchScreen touch=((HasTouchScreen)driver).getTouch();
		
		//Duplicate element
		WebElement Element=driver.findElement(By.xpath("//input"));
		//Get Coordinate for element
		Coordinates Ele_co=((Locatable)Element).getCoordinates();
		
		
		touch.doubleTap(Ele_co);
		touch.singleTap(Ele_co);
		touch.longPress(Ele_co);
		
		
		/*
		 * Tocuh action
		 * https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/interactions/touch/TouchActions.html
		 */
		
		
		
	}

}
