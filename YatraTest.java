package SeleniumTraining.SeleniumTraining;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YatraTest {
	public String s = System.setProperty("webdriver.chrome.driver","E:\\Selenium - Training\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe");					
    public WebDriver driver = new ChromeDriver();
	String username = "beingavi4@gmail.com"; // Change to your username and passwrod
	String password = "Liverpool7!";
	
	// This method is to navigate yatra URL
		@BeforeClass
		public void init() throws AWTException, InterruptedException {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.navigate().to("https://www.yatra.com");
			Thread.sleep(7000);
			Robot robot = new Robot();
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
		}
		
	// To log in yatra
		@Test
		public void login() throws InterruptedException {
			Actions builder = new Actions(driver);
			WebElement MyAccount = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/div/ul/li[1]/a"));
			WebElement SignIn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div[2]/div/ul/li[1]/div/div/div[2]/div[1]/ul/li[2]/a[1]"));
			builder.moveToElement(MyAccount);
			Thread.sleep(3000);
			builder.moveToElement(SignIn);
			builder.click().build().perform();
			/*WebElement SignIn = driver.findElement(By.xpath("//*[@id=\"signInBtn\"]n"));
			action.moveToElement(MyAccount).perform();
			action.moveToElement(SignIn).click().perform();			
			//driver.findElement(By.cssSelector(".fk-input.login-form-input.user-pwd")).sendKeys(password);
			//driver.findElement(By.cssSelector(".submit-btn.login-btn.btn")).click();*/
		}
		
	//Book a flight
		@Test
		public void bookflight() throws InterruptedException, AWTException {
			WebElement OriginCity = driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]"));
			WebElement DestinationCity = driver.findElement(By.xpath("//*[@id=\"BE_flight_arrival_city\"]"));
			WebElement DepartureDate = driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_date\"]"));
			WebElement SearchFlights = driver.findElement(By.id("BE_flight_flsearch_btn"));
			OriginCity.click();
			Thread.sleep(3000);
			OriginCity.sendKeys("ccu");
			Thread.sleep(3000);	
			OriginCity.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			//DestinationCity.click();
			DestinationCity.sendKeys("hyd");
			Thread.sleep(3000);
			DestinationCity.sendKeys(Keys.ENTER);
			DepartureDate.click();
			driver.findElement(By.xpath("//*[@id=\"12/09/2020\"]")).click();
			SearchFlights.click();
			Robot robot = new Robot();
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"CCUHYDAI52620200912_GALDOM\"]/div/div[1]/div[4]/div/div[2]/button")).click();
			Thread.sleep(3000);
			Robot robot1 = new Robot();
			robot1.delay(5000);
			robot1.keyPress(KeyEvent.VK_TAB);
			robot1.keyPress(KeyEvent.VK_ENTER);
			WebElement emailid = driver.findElement(By.id("additionalContactEmail"));
			emailid.sendKeys("beingavi4@gmail.com");
			WebElement PhoneNo = driver.findElement(By.id("additionalContactMobile"));
			PhoneNo.sendKeys("8184964512");
			//driver.findElement(By.xpath("//*[@id=\"traveller-dom\"]/form/div[1]/div[1]/div/article/div[4]/div/div/label[1]/span/i")).click();
			Select Title = new Select(driver.findElement(By.xpath("//*[@id=\"title0\"]")));
			Title.selectByVisibleText("Mr.");
			WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"travellerf0\"]"));
			FirstName.sendKeys("Avi");
			WebElement LastName = driver.findElement(By.xpath("//*[@id=\"travellerl0\"]"));
			LastName.sendKeys("Chakraborty");
			driver.findElement(By.cssSelector("#traveller-dom > form > div.box.insurance-box.ng-scope > div.box-content.clearfix.hide-under-overlay > div:nth-child(2) > div.clearfix.chk-insur.pr > label > span.ui-checkbox > i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"gtm_saveflightreview\"]")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"popupdata\"]/div/div[4]/input[2]"));
			
					
		}
		
		
  }

