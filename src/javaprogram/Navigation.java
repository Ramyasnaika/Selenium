package javaprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation 
{

	public static void main(String[] args) throws InterruptedException
	{
						System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
						Thread.sleep(5000);
						WebElement un = driver.findElement(By.xpath("//input[@name=\"username\"]"));
						un.sendKeys("Admin");
						WebElement pw = driver.findElement(By.xpath("//input[@name=\"password\"]"));
						pw.sendKeys("admin123");
						WebElement lb = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
						lb.click();
						Thread.sleep(5000);
						driver.navigate().back();
						Thread.sleep(5000);
						driver.navigate().forward();
						Thread.sleep(5000);
						driver.navigate().refresh();
	}

		
}


