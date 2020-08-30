package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandsOnProject1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium - Training\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();//Invoke browser
		String expectedTitle = "Capgemini: Consulting, Technology, Digital Transformation Services";
		driver.get("https://www.capgemini.com/");//Asking to open a URL
		driver.manage().window().maximize();//asking to maximize the page
		Thread.sleep(5000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
		driver.findElement(By.id("macs_cookies_accept_all")).click();
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/nav/div/ul[1]/li[1]/a")).click();//going to services
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section[3]/div/div[3]/div/a")).click();//showing all
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[7]/div/div[1]/div[3]/div/a")).click();//amazonconnect
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/nav/div/ul[1]/li[6]/a")).click();//careers
		//driver.findElement(By.id("macs_cookies_accept_all")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/header[2]/div[2]/div/div/div/div/form/div/div/input")).sendKeys("Selenium");
		driver.findElement(By.xpath("/html/body/header[2]/div[2]/div/div/div/div/form/div/button/span")).click();
		driver.findElement(By.xpath("/html/body/header[2]/div[2]/div/div/div/div/form/div[2]/div[1]/div/fieldset/div/span/span[1]/span/ul/li/input")).sendKeys("India");;
		driver.findElement(By.xpath("/html/body/header[2]/div[2]/div/div/div/div/form/div[2]/div[1]/div/fieldset/div/span/span[1]/span/ul")).submit();
		//driver.findElement(By.xpath("//*[@id=\"select2-ity2-result-51d0-india\"]")).click();
		driver.quit();

		}
}
