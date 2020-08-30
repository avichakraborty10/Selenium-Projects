package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfiletest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium - Training\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        Thread.sleep(3000);
        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\being\\OneDrive\\Desktop\\metalmusic.txt");
        //uploadElement.sendKeys("C:\Users\being\OneDrive\Desktop\metalmusic.txt");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
        Alert alert = driver.switchTo().alert();
        // click the "UploadFile" button
        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        driver.quit();

	}

}
