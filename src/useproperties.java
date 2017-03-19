import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class useproperties {

	@BeforeMethod
	public void settingproperty()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe"); 


System.out.println("this is just testing addition of lines")

System.out.println("this is just testing addition of lines")

System.out.println("this is just testing addition of lines")
	}
	
	@Test 
	public void testuseofproperties() throws IOException
	{
		WebDriver driver; 
		
		Properties testprop = new Properties();
		FileInputStream reader= new FileInputStream("C:\\Users\\bnanda\\workspace2504\\DealingwithFiles\\src\\object.properties");
		testprop.load(reader);
		
		
		String browser = testprop.getProperty("Browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
	//		settingproperty();
			
			driver=new ChromeDriver();
			driver.get(testprop.getProperty("URL"));
			
		}
		
		
		
		
	}
}
