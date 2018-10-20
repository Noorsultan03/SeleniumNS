package framework_Testng;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Screen_Capture 
{
  WebDriver driver;
  
  

  @BeforeClass
  public void beforeTest() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.hdfcbank.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws AWTException, IOException, InterruptedException 
  {
	  DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
	  Date d=new Date();
	  String time=df.format(d);
	  System.out.println(time);

	  Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
	  Robot robot=new Robot();
	  BufferedImage img=robot.createScreenCapture(new Rectangle(size));
	  File path = new File("C:\\Users\\user\\Downloads\\Selenium Automation Notes\\screen.jpg");
	  ImageIO.write(img, "JPG", path);
	  Thread.sleep(5000);
  }
  
  @Test(priority=1)
  public void Click_credit_card_Loan_EMI() 
  {
	  WebElement Credit_Loan_emi=driver.findElement(By.linkText("Credit Card Loan EMI Calculator"));
	  Credit_Loan_emi.click();
  }
  
  @Test(priority=2)
  public void Personal_Loan_Emi() 
  {
	  WebElement Personal_Emi=driver.findElement(By.linkText("Personal Loan EMI Calculator"));
	  Personal_Emi.click();
  }
  
  @Test(priority=3)
  public void Car_Loan_Emi() 
  {
	  WebElement Car_Loan_emi=driver.findElement(By.linkText("Car Loan EMI Calculator"));
	  Car_Loan_emi.click();
  }
	  

}
