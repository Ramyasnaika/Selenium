package javaprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{

				System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(5000);
				
				WebElement un = driver.findElement(By.xpath("//input[@placeholder='Username']"));
				un.sendKeys("Admin");
				WebElement pw = driver.findElement(By.xpath("//input[@name=\"password\"]"));
				pw.sendKeys("admin123");
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File ds = new File("C:\\photo.png");
				FileUtils.copyFile(src,ds);
				WebElement lb = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
				lb.click();

	}

		
}


