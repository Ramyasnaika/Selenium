package javaprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Actions a = new Actions(driver);
				driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
				Thread.sleep(5000);
				driver.manage().window().maximize();
				
				WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
				driver.switchTo().frame(fr);
				Thread.sleep(2000);
				
				WebElement dr = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
				WebElement dp = driver.findElement(By.xpath("//div[@id='trash']"));
				a.dragAndDrop(dr, dp).perform();
			}

		
	}


