
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class capstone {

WebDriver driver;

@Test()
public void testOnChromeWithBrowserStackUrl()
{
System.setProperty("webdriver.chrome.driver", "C:/Users/Bhargav/Downloads/chromedriver_win32/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("file:///C:/Users/Bhargav/OneDrive/Desktop/HTML/cars%20website/index.html");
driver.manage().window().maximize();
System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());

}

@Test()
public void testOnChromeWithBrowserStackSignUp()
{
System.setProperty("webdriver.gecko.driver", "C:/Users/Bhargav/Downloads/geckodriver-v0.31.0-win64/geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("file:///C:/Users/Bhargav/OneDrive/Desktop/HTML/cars%20website/index.html");
driver.manage().window().maximize();
driver.findElement(By.id("user_full_name")).sendKeys("<name>");
driver.findElement(By.id("user_email_login")).sendKeys("<9445372447>");
driver.findElement(By.id("user_password")).sendKeys("<N.Bhargav7>");
System.out.println("this is the test related to FireFox browserstack login"+ " " +Thread.currentThread().getId());

}

@AfterClass
public void close()
{
driver.quit();
}
}