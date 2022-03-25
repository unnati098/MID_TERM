package more_ways;

import java.util.Iterator; 
import java.util.Set; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle_Demo { 
	@Test
public  void fhgf() throws Exception {


System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();

//taking the current window
String windowHandler = driver.getWindowHandles().iterator().next();

//code to open new window
WebElement openWindow = driver.findElement(By.xpath("//button[@id='openwindow']"));
openWindow.click();
Thread.sleep(1000);

//redirecting back to previous window from the new window 
driver.switchTo().window(windowHandler);
Thread.sleep(1000);

//again click on the new tab from the first window
WebElement openNewTab = driver.findElement(By.xpath("//a[@id='opentab']"));
openNewTab.click();
Thread.sleep(1000);
//redirecting back to first window from new window
driver.switchTo().window(windowHandler);
//taking the current window
String windowHandler1 = driver.getWindowHandles().iterator().next();

//code to open new window
WebElement openWindow1 = driver.findElement(By.xpath("//button[@id='openwindow']"));
openWindow1.click();
Thread.sleep(1000);

//redirecting back to previous window from the new window 
driver.switchTo().window(windowHandler1);
Thread.sleep(1000);

//again click on the new tab from the first window
WebElement openNewTab1 = driver.findElement(By.xpath("//a[@id='opentab']"));
openNewTab1.click();
Thread.sleep(1000);
//redirecting back to first window from new window
driver.switchTo().window(windowHandler1);
}
}