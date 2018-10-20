package verification_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Element_Text 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		WebElement signin_email_eb=driver.findElement(By.id("identifierId"));
		signin_email_eb.clear();
		signin_email_eb.sendKeys("snhdj@outlook.com",Keys.ENTER);
		
		Thread.sleep(4000);
		WebElement err_loca1=driver.findElement(By.cssSelector("div[class='dEOOab RxsGPe']>div"));
		String Act_err1=err_loca1.getText();
		
		WebElement err_loca2=driver.findElement(By.className("ck6P8"));
		String Act_err2=err_loca2.getText();
		
		String Exp_err1="Couldn't find your Google Account";
		String Exp_err2="If you've signed in to Google products like YouTube, try again with that email";
		
		if(Act_err1.isEmpty())   
		{
			
			//Verify Expected and actual error
			if(Act_err1.equals(Exp_err1))
				System.out.println("As expected Error msg displayed on invalid domain address");
			else
				System.err.println("Testfail expected error msg not located at webapge");
		}
		else
			System.err.println("Error msg not visible at webpage");
		
		if(Act_err2.isEmpty())  
		{
			
			//Verify Expected and actual error
			if(Act_err2.equals(Exp_err2))
				System.out.println("As expected Error msg displayed on invalid domain address");
			else
				System.err.println("Testfail expected error msg not located at webapge");
		}
		else
			System.err.println("Error msg not visible at webpage");


		
		

	}

}
