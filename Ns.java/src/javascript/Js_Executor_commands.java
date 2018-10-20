package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * when to use javascript executor:----->
		 * 
		 * 
		 * Because of cross domain policies browsers enforce your 
		 * script execution may fail unexpectedly and without 
		 * adequate error messaging. mostly happend when trying to access 
		 * another frame. 
		 * 
		 * Note:--> 
		 *  Most times when troubleshooting failure it's 
		 *  best to view the browser's console after 
		 *  executing the WebDriver request.
		 *  
		 *  
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Run javascript on Automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//type text into editbox using javascript executor
		js.executeScript("document.getElementById('u_0_j').value='Arjun'");
		js.executeScript("document.getElementById('u_0_l').value='vijay'");
		
		
		//Target Element with webdriver
		WebElement Email_editbox=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		js.executeScript("arguments[0].value='arjunvijay@gmail.com'",Email_editbox);
		
	
		//Select Dropdown using javascript..  [Write Dropdown optionv value property]
		js.executeScript("document.getElementById('day').value='25'");
		js.executeScript("document.getElementById('month').value='5'");
		js.executeScript("document.getElementById('year').value='1990'");
		
		
		//Radio button to select
		WebElement male_Radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
		js.executeScript("arguments[0].checked='true'",male_Radio_btn);
		Thread.sleep(4000);
		
		
		
		//Female Radio button
		WebElement female_Radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		js.executeScript("arguments[0].click()",female_Radio_btn);
		
		
	}

}
