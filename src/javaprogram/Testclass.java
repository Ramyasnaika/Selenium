package javaprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass 
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
				Thread.sleep(2000);
				WebElement bz = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
				bz.click();
				Thread.sleep(2000);
				WebElement pe = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
				pe.sendKeys("Ramya");
				WebElement ps = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
				ps.click();
				Thread.sleep(2000);
				WebElement eb = driver.findElement(By.xpath("(//button[@type=\"button\"])[8]"));
				eb.click();
				Thread.sleep(2000);
				WebElement dl = driver.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[1]"));
				dl.click();
				Thread.sleep(5000);
				WebElement dc = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]"));
				dc.click();
				//driver.quit();
				
		}
	
}


