package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;

public class Mouse_Hover 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
	
		//Enable MouseInterface class controls on browser
		Mouse mouse=((HasInputDevices)driver).getMouse();
		
		//Identify Target
		WebElement Products=driver.findElement(By.linkText("Products"));
		//Get element coordinate using locatable class
		Coordinates Products_Co=((Locatable)Products).getCoordinates();
		mouse.mouseMove(Products_Co);
		Thread.sleep(5000);
		
		//Identify Target
		WebElement Loan=driver.findElement(By.linkText("Loans"));
		//Get element coordinate using locatable class
		Coordinates Loan_Co=((Locatable)Loan).getCoordinates(); 
		mouse.mouseMove(Loan_Co);
		Thread.sleep(5000);
		
		WebElement  Personal_Loan=driver.findElement(By.linkText("Personal Loan"));
		Coordinates Personal_Loan_co=((Locatable)Personal_Loan).getCoordinates();
		
		mouse.click(Personal_Loan_co);
		
		driver.close();

	}

}
