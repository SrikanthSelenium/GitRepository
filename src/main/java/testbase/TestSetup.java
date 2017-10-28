package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSetup {
	
	public static WebDriver d;
	
	public static void setup(String url)
	{
		driverSetup(url);
		
	}
	
	public static void driverSetup(String url)
	{
		d=new FirefoxDriver();
		urlsetup(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void urlsetup(String url)
	{
		d.get(url);
	}

}
