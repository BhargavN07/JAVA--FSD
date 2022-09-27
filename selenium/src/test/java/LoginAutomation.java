import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginAutomation {
@Test
public void login() {
System.setProperty("webdriver.chrome.driver","C:/Users/Bhargav/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.browserstack.com/users/sign_in");
WebElement username=driver.findElement(By.id("user_email_Login"));
WebElement password=driver.findElement(By.id("user_password"));
WebElement login=driver.findElement(By.name("commit"));
username.sendKeys("abc@gmail.com");
password.sendKeys("1234546");
login.click();
String actualUrl="https://live.browserstack.com/dashboard";
String expectedUrl= driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,actualUrl);
}
}