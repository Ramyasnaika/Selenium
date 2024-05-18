package javaprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{

	public static void main(String[] args) throws InterruptedException
	{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Alerts.html");
				Thread.sleep(5000);
				WebElement lb = driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
				lb.click();
				Alert a = driver.switchTo().alert();
				a.accept();
				Thread.sleep(5000);
				WebElement dm = driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
				dm.click();
				Thread.sleep(5000);
				WebElement cl = driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']"));
				cl.click();
				Alert d = driver.switchTo().alert();
				d.dismiss();
				Thread.sleep(5000);
				WebElement tb = driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
				tb.click();
				Thread.sleep(5000);
				WebElement tx = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
				tx.click();
				
	}

		

}


