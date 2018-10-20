package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Options 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/credit-card/Index.aspx?");
		driver.manage().window().maximize();
		
		WebElement employee_type=driver.findElement(By.id("ddlEmpType"));
		
		List<WebElement> All_options=employee_type.findElements(By.tagName("option"));
		
		int Option_count=All_options.size();
		
		for (int i = 0; i < Option_count; i++) 
		{
			WebElement Each_option=All_options.get(i);
			Each_option.click();
			Thread.sleep(5000);
			
			WebElement Company_eb=driver.findElement(By.id("txtCompany"));
			if (Company_eb.isDisplayed()) 
			{
				System.out.println("Company visible at this option => "+Each_option.getText());
			}
			else
			{
				System.out.println("Company Invisible at this option => "+Each_option.getText());

			}
		}

	}

}
