package SeleniumTraining.SeleniumTraining;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String baseUrl = "https://www.redbus.in";					
		System.setProperty("webdriver.chrome.driver","E:\\Selenium - Training\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
        driver.get(baseUrl);
        Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        //hovering
        String expectedTooltip = "redBus Bus Hire";
        WebElement redbushire = driver.findElement(By.xpath("//*[@id=\"redBus Bus Hire\"]"));
        String actualTooltip = redbushire.getAttribute("title");
        System.out.println("The TOOL TIP is : "+actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");	
        }
        Thread.sleep(5000);
        //Alert alert = driver.switchTo().alert();
        WebElement FromCity = driver.findElement(By.xpath("//*[@id=\"src\"]"));
        FromCity.sendKeys("Bangalore");
        Thread.sleep(2000);
        FromCity.sendKeys(Keys.ENTER);
        WebElement ToCity = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
        ToCity.sendKeys("Hyderabad");
        Thread.sleep(2000);
        ToCity.sendKeys(Keys.ENTER);
        WebElement Calender = driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/span"));
        Calender.click();
        WebElement Date = driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[7]/td[5]"));
		Date.click();
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"search_btn\"]"));
		Search.click();
		Thread.sleep(5000);
		WebElement LoginPicker = driver.findElement(By.xpath("//*[@id=\"sign-in-icon-down\"]"));
		LoginPicker.click();
		Thread.sleep(2000);
		WebElement SignUp = driver.findElement(By.xpath("//*[@id=\"signInLink\"]"));
		SignUp.click();
		Thread.sleep(4000);
		//String parentWinHandle = driver.getWindowHandle();
		//System.out.println("Parent window handle: " + parentWinHandle);
		/*WebElement NewWindow = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div"));
		driver.switchTo().window(NewWindow);
		WebElement MobileNo = driver.findElement(By.id("mobileNoInp"));;
		MobileNo.sendKeys("6289109845");
		WebElement Robot = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]"));
		Robot.click();*/
		WebElement Facebook = driver.findElement(By.id("newFbId"));
		Facebook.click();
		//WebElement RedBusImage = driver.findElement(By.cssSelector(".redbus-logo"));
		//RedBusImage.click();
		//driver.quit();

	}

}
