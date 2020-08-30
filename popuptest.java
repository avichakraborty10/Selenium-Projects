package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuptest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium - Training\\Chrome Drivers\\chromedriver_win32\\chromedriver.exe"); //Setting path of Chrome driver
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");			
		
	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert mes
System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
       // alert.accept();		
        Thread.sleep(5000);
        // Dismiss alert
        alert.dismiss();
        Thread.sleep(2000);
        driver.close();

	}

}
