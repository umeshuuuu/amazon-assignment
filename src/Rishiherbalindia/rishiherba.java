package Rishiherbalindia;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rishiherba {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
		
	}
	@BeforeTest
	public void url()
	{
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("umeshudayan1084@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Umesh@123");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
	driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button"));
	Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Umesh@123");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
	

	}
	@Test
	public void test2() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth booster");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[2]/div/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
       driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
       Thread.sleep(2000);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,450)", "");
       Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
js.executeScript("window.scrollBy(0,450)", "");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
js.executeScript("window.scrollBy(0,1500)", "");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
js.executeScript("window.scrollBy(0,2500)", "");
Thread.sleep(2500);



	}
@Test
	public void test3() throws Exception
	{
		WebElement year = driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File SCRN = year.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(SCRN,new File("./Screenshot//elementscrnshot3.png"));
	}
@Test
public void test4() {
    driver.get("https://rishiherbalindia.linker.store/");
    List<WebElement> li = driver.findElements(By.tagName("a"));
    for (WebElement s : li) {
        String link = s.getAttribute("href");
        verify(link);
    }
}

public void verify(String link) {
    try {
        URL url = new URL(link);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.connect();
        if (con.getResponseCode() == 200) {
            System.out.println("Valid: " + link);
        } else if (con.getResponseCode() == 404) {
            System.out.println("Broken Link: " + link);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
@Test
public void test5() {
    String url = "https://rishiherbalindia.linker.store/";
    verify1(url);
}

public void verify1(String url) {
    try {
        URL linkUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int responseCode = connection.getResponseCode();
        System.out.println(url + " - Response Code: " + responseCode);
        connection.disconnect();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}

}