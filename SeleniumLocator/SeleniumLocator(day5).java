package iamneo;

//import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        // assertTrue( true );
        WebDriverManager.chromedriver().setup(); // set up our driver for specific browser
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoblaze.com/"); // Browser command to open the website
        // driver.manage().window().minimize();
        // int n=driver.getPageSource().length();
        // System.out.print(n);
        // driver.findElement(By.className("gLFyf")).sendKeys("v");
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("MacBook air")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        // WebElement element;
        driver.findElement(By.linkText("Cart")).click();
        Thread.sleep(5000);
    
        driver.quit();


    }

}
