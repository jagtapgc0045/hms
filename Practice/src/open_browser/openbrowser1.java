package open_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser1
{
	public static void main (String[]args)
	{
		//provide the path of driver
		//parameter1:name of driver
		//parameter2:path of driver
		System.setProperty("webdriver.chro", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		//create the object of chrome driver to open it
		ChromeDriver driver=new ChromeDriver();
		
	}

}
