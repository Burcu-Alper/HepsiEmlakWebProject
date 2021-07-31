package com.testinium.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        //driver.get("https://www.google.com.tr/");
        driver.navigate().to("https://www.hepsiemlak.com/");
    }
    public static WebDriver getDriver() {
        return driver;
    }
    @After
    public  void teardown() {
     driver.quit();
    }
}
