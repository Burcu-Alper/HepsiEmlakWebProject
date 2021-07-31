package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.testinium.constants.ConstantsPage.*;

public class PageLog extends BasePage {


    public PageLog(WebDriver driver) {

        super(driver);
    }

    //case1
    public void clickSatilik() {
        clickElement(SATILIK_TIKLA);
    }

    public void closeCookies() {
        clickElement(COOKIES_KAPAT);
    }

    public void clickIlSec() {
        clickElement(IL_SEC_TIKLA);
    }

    public void chooseIzmir() {
        clickElement(IZMIR_SEC);
    }

    public void clickIlceSec() {
        clickElement(ILCE_SEC_TIKLA);
    }

    public void chooseBornova() {
        scrollDownToElement(BORNOVA_SEC);
    }

    public void minPrice(String value) {
        clickElement(EN_AZ_FIYAT);
        sendKeys(EN_AZ_FIYAT, value);
    }

    public void maxPrice(String value) {
        clickElement(EN_COK_FIYAT);
        sendKeys(EN_COK_FIYAT, value);
    }

    public void clickCategoryIsyeri() {
        clickElement(KATEGORI_SEC);
    }

    public void clickBinaYas() {
        scrollDownToElementAndClick(BINA_YAS_TIKLA);
    }

    public void chooseSifirBina() {
        scrollDownToElementAndClick(SIFIR_BINA_SEC);
    }

    public void clickAraButon() {
        clickElement(ARA_BUTONU_TIKLA);
    }


    //case2

    public void clickKiralik() {
        clickElement(KIRALIK_TIKLA);
    }

    public void closeCookies2() {
        clickElement(COOKIES_KAPAT2);
    }

    public void clickIlSec2() {
        clickElement(IL_SEC_TIKLA2);
    }

    public void chooseAnkara() {
        clickElement(ANKARA_SEC);
    }

    public void clickIlceSec2() {
        clickElement(ILCE_SEC_TIKLA2);
    }

    public void clickCankaya() {
        scrollDownToElementAndClick(CANKAYA_SEC);
    }

    public void chooseOda() {
        clickElement(ODA_SEC);
    }

    public void clickSiteİçi() {
        scrollDownToElementAndClick(SITE_ICI_SEC);
    }

    public void clickAraButon2() {
        clickElement(ARA_BUTONU_TIKLA2);
    }

    public void clickThirdList() {
        clickElement(THIRDLIST_TIKLA);
    }

    public void clickShowPhoneNumber(){
        clickElement(TELEFON_GOSTER_TIKLA);
    }
}