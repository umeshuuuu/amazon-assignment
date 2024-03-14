package Assignment3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignmentno3 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test1() throws Exception
	{
		Thread.sleep(10000);
		
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
		String actualtitle = driver.getTitle();
		String expectedtitle="amazon.in:mobiles";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("tittle is same");
		}
		else
		{
			System.out.println("title is different");
		}
 
		String parentwindow = driver.getWindowHandle();
	
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();

        System.out.println(parentwindow);
        Set<String> allwindowhandle = driver.getWindowHandles();
        for (String handle : allwindowhandle) {
            System.out.println(handle);
            if (!handle.equalsIgnoreCase(parentwindow)) {
                driver.switchTo().window(handle);
                driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
                
            }
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
        //driver.switchTo().window(parentwindow);
	
	
}
}
