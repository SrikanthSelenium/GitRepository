package setuptest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SetupClass {
	
	public static WebDriver d;
	
	
	public static void browserSetup(String browser,String url)
	{
		if(browser.equals("firefox"))
		{
			d=new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			d=new ChromeDriver(options);
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	
		}
		else if  (browser.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver","F:\\Selenium\\Java_Practice\\seleniumprj\\Drivers and jars\\IEDriverServer.exe");
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);	
		}
		setUrl(url);
		
		}
	public static void setUrl(String url)
	{
		d.get(url);
	}
	
	

}
