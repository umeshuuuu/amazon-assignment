package Amazon_xpath;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
	ChromeDriver driver;
	@Before
	public void before() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("MOBILE",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-tools']//a[4]")).click();
		driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("umeshudayan123",Keys.ENTER);
		driver.navigate().back();
		driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='nav-xshop-container']/div[1]/a[7]")).click();
        driver.findElement(By.xpath("//*[@id='nav-main']/div[1]")).click();
	}

}
