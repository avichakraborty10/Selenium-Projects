package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium - Training\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
		driver.get("https://www.facebook.com/");//Asking to open a URL
		driver.manage().window().maximize();//asking to maximize the page
		String actualTitle = "";//taking variable
		//String expectedTitle = "Welcome";// variable
		//String xz ="";
		actualTitle = driver.getTitle();// Bring title of page
		//xz= driver.getCurrentUrl();
		driver.findElement(By.id("email")).sendKeys("beingavi4@gmail.com");//enter Uid
		driver.findElement(By.id("pass")).sendKeys("Liverpool7!");//enter pwd
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[3]/label/input")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[3]/label/input"));
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[2]/div/div/div/div/div[3]/label/input")).submit();

		}

		}