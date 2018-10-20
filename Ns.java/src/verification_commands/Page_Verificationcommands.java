package verification_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verificationcommands 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Get Runtime page title
		String runtime_page_title=driver.getTitle();
		System.out.println("Runtime page title is -->"+runtime_page_title);
		
		//Get RuntimeUrl 
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Runtime url is -->"+Runtime_url);
		
		//Get Runtime Window ID
		String Runtime_win_ID=driver.getWindowHandle();
		System.out.println("Runtime window ID is -->"+Runtime_win_ID);
		
		//Get pageSource
		String Runtime_page_Source=driver.getPageSource();
		System.out.println("Runtimme Page Source is -->"+Runtime_page_Source);

	}

}
