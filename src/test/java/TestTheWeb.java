import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestTheWeb {

    @Test
    public void testTheWeb() {
        System.setProperty("webdriver.chrome.driver", "/home/dastan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://yahoo.com");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        WebElement searchBox = driver.findElement(By.name("p"));
        WebElement searchButton = driver.findElement(By.id("ybar-search"));

        searchBox.sendKeys("News");
        searchButton.click();
        Assert.assertEquals(searchBox.getAttribute("value"), "News");

    }
}
