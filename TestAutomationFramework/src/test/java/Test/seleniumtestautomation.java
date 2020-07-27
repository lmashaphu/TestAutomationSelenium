package Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.PageObjects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.TestPageObjects;

public class seleniumtestautomation {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// creating ExtentReports and attach report(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("testing google site","tesing if the url opens");
		
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver","/Users/lethabo.mashaphu/eclipse-workspace/TestAutomationFramework/Drivers/chromedriver/chromedriver");
		System.setProperty("webdriver.gecko.driver","/Users/lethabo.mashaphu/eclipse-workspace/TestAutomationFramework/Drivers/firefoxdriver/geckodriver");
		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.ilabquality.com/");
		test.pass("Navigated to Ilab.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageObjects.Careers_Link(driver).click();
		test.pass("suscesfully clicked careers page");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageObjects.SouthAfrica_Button_Link(driver).click();
		test.pass("suscesfully clicked souuth africa link");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageObjects.Job_Available_Link(driver).click();
		test.pass("suscesfully clicked first job stated");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageObjects.Apply_Online(driver).click();
		test.pass("suscesfully clicked apply online");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageObjects.Your_Name(driver).click();
		test.pass("suscesfully clicked name text box");
		PageObjects.Your_Name(driver).sendKeys("Lethabo");
		test.pass("suscesfully entered name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageObjects.Email_Adress(driver).click();
		test.pass("suscesfully clicked email address");
		PageObjects.Email_Adress(driver).sendKeys("automationAssessment@iLABQuality.com");
		test.pass("suscesfully entered email address");
		PageObjects.Phone(driver).click();
		test.pass("suscesfully clicked phone text box");
		PageObjects.Phone(driver).sendKeys("0835687859");
		test.pass("suscesfully entered phone");
		PageObjects.Send_Button(driver).click();
		test.pass("suscesfully clicked send button");
		driver.getPageSource().contains("You need to upload at least one file");
		test.pass("suscesfully verified text");
		driver.close();
		driver.quit();
		test.pass("Test completed");
		
		extent.flush();
		

	}

}
	


