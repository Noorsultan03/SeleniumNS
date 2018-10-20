package robot_Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Copy_Text_From_Clipboard 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="What are the benefits of a credit card?\r\n" + 
				"Be it booking a car ride or a movie ticket, purchasing expensive gadgets or a "
				+ "cool fashion accessory, shopping online or at a neighbourhood store, "
				+ "recharging your mobile or settling the utility bill, a credit card is one "
				+ "of the most convenient methods of payments.";
		
		StringSelection stext=new StringSelection(text);
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(stext, stext);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(4000);
				
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_ENTER);

	}

}
