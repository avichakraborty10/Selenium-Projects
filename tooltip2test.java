package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip2test {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/tooltip.html";					
		System.setProperty("webdriver.gecko.driver","E:\\Selenium - Training\\Geko Driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();					
        String expectedTooltip = "What's new in 3.2";					
        driver.get(baseUrl);					
        driver.manage().window().maximize();		
        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
      
        Actions builder = new Actions (driver);	// a new person capa perform magic with RM				
        builder.clickAndHold().moveToElement(download);					
        builder.moveToElement(download).build().perform(); 	
        
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip = toolTipElement.getText();
System.out.println("The Tool Tip :  "+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();

	}

}
