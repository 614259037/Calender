import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CalenderTest {

	@Test
    void TC_1001_Calender() {
        WebDriver driver = null;
        String browser = "chrome";
        if(browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jame\\Desktop\\New folder (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        }
        driver.get("http://localhost/Testunit/formCalender.php");
        driver.manage().window().setSize(new Dimension(1280, 883));
        driver.findElement(By.id("Day")).click();
        {
          WebElement dropdown = driver.findElement(By.id("Day"));
          dropdown.findElement(By.xpath("//option[. = '3']")).click();
        }
        driver.findElement(By.id("Day")).click();
        driver.findElement(By.id("Month")).click();
        {
          WebElement dropdown = driver.findElement(By.id("Month"));
          dropdown.findElement(By.xpath("//option[. = 'February']")).click();
        }
        driver.findElement(By.id("Month")).click();
        driver.findElement(By.cssSelector("input")).click();
        String result = driver.findElement(By.id("res")).getText();
        assertEquals("Wednesday",result);
        driver.close();
    }
	@Test
    void TC_1002_Calender() {
        WebDriver driver = null;
        String browser = "chrome";
        if(browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jame\\Desktop\\New folder (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        }
        driver.get("http://localhost/Testunit/formCalender.php");
        driver.manage().window().setSize(new Dimension(1280, 883));
        driver.findElement(By.id("Day")).click();
        {
          WebElement dropdown = driver.findElement(By.id("Day"));
          dropdown.findElement(By.xpath("//option[. = '15']")).click();
        }
        driver.findElement(By.id("Day")).click();
        driver.findElement(By.id("Month")).click();
        {
          WebElement dropdown = driver.findElement(By.id("Month"));
          dropdown.findElement(By.xpath("//option[. = 'January']")).click();
        }
        driver.findElement(By.id("Month")).click();
        driver.findElement(By.cssSelector("input")).click();
        String result = driver.findElement(By.id("res")).getText();
        assertEquals("Friday",result);
        driver.close();
    }
	@Test
    void TC_1003_Calender() {
        WebDriver driver = null;
        String browser = "chrome";
        if(browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jame\\Desktop\\New folder (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        }
        driver.get("http://localhost/Testunit/formCalender.php");
        driver.manage().window().setSize(new Dimension(1280, 883));
        driver.findElement(By.id("Day")).click();
        {
          WebElement dropdown = driver.findElement(By.id("Day"));
          dropdown.findElement(By.xpath("//option[. = '20']")).click();
        }
        driver.findElement(By.id("Day")).click();
        driver.findElement(By.id("Month")).click();
        {
          WebElement dropdown = driver.findElement(By.id("Month"));
          dropdown.findElement(By.xpath("//option[. = 'April']")).click();
        }
        driver.findElement(By.id("Month")).click();
        driver.findElement(By.cssSelector("input")).click();
        String result = driver.findElement(By.id("res")).getText();
        assertEquals("Tuesday",result);
        driver.close();
    }
	

}
