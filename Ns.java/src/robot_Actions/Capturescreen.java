package robot_Actions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturescreen 
{

	public static void main(String[] args) throws AWTException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		Robot robot=new Robot();
		BufferedImage img=robot.createScreenCapture(new Rectangle(size));
		File path = new File("C:\\Users\\user\\Downloads\\Selenium Automation Notes\\screen.jpg");
		ImageIO.write(img, "JPG", path);

		

	}

}
