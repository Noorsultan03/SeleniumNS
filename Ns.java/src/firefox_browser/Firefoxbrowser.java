package firefox_browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("https://google.com");
		firefox.close();
		
		
	}

}
