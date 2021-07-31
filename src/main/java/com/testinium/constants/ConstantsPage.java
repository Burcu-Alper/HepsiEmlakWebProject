package com.testinium.constants;

import com.testinium.page.PageLog;
import org.openqa.selenium.By;

public class ConstantsPage {
    //case1
    public static final By SATILIK_TIKLA = By.xpath("//a/span[text()='Satılık']");
    public static final By COOKIES_KAPAT = By.xpath("//span[@class='he-icon cookie-policy__close he-icon--close']");
    public static final By IL_SEC_TIKLA = By.cssSelector("section[class='filter-item-wrap loc locationCitySec']");
    public static final By IZMIR_SEC = By.xpath("//span[text()='İzmir']");
    public static final By ILCE_SEC_TIKLA = By.xpath("//span[contains(text(),'İlçe Seçiniz')]");
    public static final By BORNOVA_SEC = By.xpath("//span[text()='Bornova']");
    public static final By EN_AZ_FIYAT = By.xpath("//input[@class='floating-input priceMin']");
    public static final By EN_COK_FIYAT = By.xpath("//input[@class='floating-input priceMax']");
    public static final By KATEGORI_SEC = By.xpath("//input[@class='floating-input priceMax']");
    public static final By BINA_YAS_TIKLA = By.xpath("//div[contains(text(),'Bina Yaşı Seçiniz')]");
    public static final By SIFIR_BINA_SEC = By.xpath("//label//span[contains(text(),'Sıfır Bina')]");
    public static final By ARA_BUTONU_TIKLA = By.xpath("//a[@class='btn btn-red btn-large']");

    //case2
    public static final By KIRALIK_TIKLA = By.xpath("//img[@src='/_nuxt/img/kiralik.1504d39.svg']");
    public static final By COOKIES_KAPAT2 = By.xpath("//span[@class='he-icon cookie-policy__close he-icon--close']") ;
    public static final By IL_SEC_TIKLA2 = By.xpath("//span[contains(text(),'İl Seçiniz')]");
    public static final By ANKARA_SEC = By.xpath("//span[contains(text(),'Ankara')]");
    public static final By ILCE_SEC_TIKLA2 = By.xpath("//span[contains(text(),'İlçe Seçiniz')]");
    public static final By CANKAYA_SEC = By.xpath("//span[text()='Çankaya']");
    public static final By ODA_SEC = By.xpath("//div[contains(text(),'Oda Seçiniz')]");
    public static final By SITE_ICI_SEC = By.xpath("//input[@class='md-switch-input']");
    public static final By ARA_BUTONU_TIKLA2 = By.xpath("//a[@class='btn btn-red btn-large']");
    public static final By THIRDLIST_TIKLA = By.id("41876-3676");
    public static final By TELEFON_GOSTER_TIKLA= By.xpath("//button[@class='owner-phone-numbers-button btn btn-red btn-large']");





}
