package com.testinium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Unit test for simple App.
 */
public class HepsiEmlak {
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");

        driver =new ChromeDriver(options);
        wait = new WebDriverWait(driver, 40,600);
        driver.get("https://www.google.com.tr/");
        driver.navigate().to("https://www.hepsiemlak.com/");
    }


    @Test
    public void hepsiEmlakCase1()  {
       //case1
      clickElement(By.xpath("//a/span[text()='Satılık']"));
      clickElement(By.xpath("//span[@class='he-icon cookie-policy__close he-icon--close']"));
      clickElement(By.cssSelector("section[class='filter-item-wrap loc locationCitySec']"));
      clickElement(By.xpath("//span[text()='İzmir']"));
      clickElement(By.xpath("//span[contains(text(),'İlçe Seçiniz')]"));
      scrollDownToElement(By.xpath("//span[text()='Bornova']"));
      clickElement(By.xpath("//span[text()='Bornova']"));
      clickElement(By.xpath("//input[@class='floating-input priceMin']"));
      sendKeys(By.xpath("//input[@class='floating-input priceMin']"), "100000");
      clickElement(By.xpath("//input[@class='floating-input priceMax']"));
      sendKeys(By.xpath("//input[@class='floating-input priceMax']"), "2000000");
      clickElement(By.xpath("//label[@for='category1']"));
      scrollDownToElementAndClick(By.xpath("//div[contains(text(),'Bina Yaşı Seçiniz')]"));
      scrollDownToElementAndClick(By.xpath("//label//span[contains(text(),'Sıfır Bina')]"));
      clickElement(By.cssSelector("a[class='btn btn-red btn-large']"));

    }
    @Test
    public void hepsiEmlakCase2() {

        //case2
        clickElement(By.xpath("//img[@src='/_nuxt/img/kiralik.1504d39.svg']"));
        clickElement(By.xpath("//span[@class='he-icon cookie-policy__close he-icon--close']"));
        clickElement(By.xpath("//span[contains(text(),'İl Seçiniz')]"));
        clickElement(By.xpath("//span[contains(text(),'Ankara')]"));
        clickElement(By.xpath("//span[contains(text(),'İlçe Seçiniz')]"));
        scrollDownToElementAndClick(By.xpath("//span[text()='Çankaya']"));
        //clickElement( By.xpath("//span[text()='Çankaya']"));
        clickElement(By.xpath("//div[contains(text(),'Oda Seçiniz')]"));
        scrollDownToElementAndClick(By.xpath("//input[@class='md-switch-input']"));
        clickElement(By.xpath("//a[@class='btn btn-red btn-large']"));
        clickElement(By.id("41876-3676"));
        clickElement(By.xpath("//button[@class='owner-phone-numbers-button btn btn-red btn-large']"));
    }

    public  WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void  clickElement(By by) {
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element))
                .click();
    }
    public void sendKeys(By by, CharSequence text){
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element))
                .sendKeys(text);
    }

    public void scrollDownToElement(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDownToElementAndClick(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }


    @After
    public  void teardown() {
    driver.quit();
    }
}
