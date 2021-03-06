package setuptest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class TestClass extends SetupClass {
		
	//	public WebDriver d;
//		driver committed
		SetupClass setclass;
		
		@BeforeSuite
		@Parameters({"browser","url"})
		public void setUp(String browser,String url)
		{
			SetupClass.browserSetup(browser, url);
		}
		
		@Test
		public void login() throws InterruptedException
		{
			LoginTestPage ltp = new LoginTestPage(d);
			ltp.login();
			// line uploaded to git now
		}
		
		@AfterSuite
		public void tearDown()
		{
			d.quit();
		}

		
}
