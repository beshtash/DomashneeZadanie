import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestTheSite {
    private WebDriver driver;
    @BeforeTest
        public void setBaseURL() {
            System.setProperty("webdriver.chrome.driver", "/home/dastan/Downloads/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://yahoo.com");
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }
    @Test
    public void verifyHomePageTitle() {
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterTest
    public void endSessiion() {
        driver.quit();
    }

}
