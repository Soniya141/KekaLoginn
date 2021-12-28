package Kekalogin.Kekalogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class keka {
	WebDriver driver;
@Test
		public void login() throws InterruptedException  
		{
			System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/Automation/Chromedriver/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		
		
			driver.get("https://www.keka.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		WebElement login=driver.findElement(By.xpath("//a[contains(text(),'login')]"));
			login.click();
			WebElement Emailid=driver.findElement(By.xpath("//input[@id=\'email\']"));
			Emailid.sendKeys("soniya.raichandani@knoldus.com");
			WebElement Login2=driver.findElement(By.xpath("//button[@class=\'btn login-from-btn\']"));
			Login2.click();
			WebElement LoginwithGoogle=driver.findElement(By.xpath("//button[@class=\'btn btn-danger btn-login btn-google-login\']"));
			LoginwithGoogle.click();
			WebElement Next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			Next.click();
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("maysonia14@");
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Next')]")));
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		
			
			WebElement hover = driver.findElement(By.xpath("//a[@class='nav-link']//span[text()='Me']"));
		
			wait.until(ExpectedConditions.visibilityOf(hover));
			
			Actions action = new Actions(driver);

//Action act = action.build();

			action.moveToElement(hover).perform();
			WebElement attendance= driver.findElement(By.xpath("//span[text()='Attendance']"));
			wait.until(ExpectedConditions.visibilityOf(attendance));
			attendance.click();
			Thread.sleep(3000);
			WebElement Webclockin= driver.findElement(By.xpath("//a[text()='Web Clock-In']"));
			wait.until(ExpectedConditions.visibilityOf(Webclockin));
			Webclockin.click();
			Thread.sleep(32400000);
			WebElement Webclockout= driver.findElement(By.xpath("//button[@class='btn btn-danger mb-8']"));
			wait.until(ExpectedConditions.visibilityOf(Webclockout));
			Webclockout.click();
			
		}
}

	


