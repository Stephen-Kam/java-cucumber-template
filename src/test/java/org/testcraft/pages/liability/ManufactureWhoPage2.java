package org.testcraft.pages.liability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManufactureWhoPage2 extends BasePage {

    public ManufactureWhoPage2(WebDriver driver){
        super(driver);
        url = "/manufacture-who";
        heading = "Who does the business manufacture liable drinks for?";
    }

    private WebElement selectManufactureOwn(){
        return driver.findElement(By.id("ownBrands"));
    }

    private WebElement selectManufactureOthers(){
        return driver.findElement(By.id("customers"));
    }

    public void selectManufactureOptions(Integer option) {
        switch (option){
            case 1: selectManufactureOwn().click();
            clickContinue();
            break;
            case 2: selectManufactureOthers().click();
            clickContinue();
            break;
            case 3: selectManufactureOwn().click();
            selectManufactureOthers().click();
            clickContinue();
            break;
        }
    }

}
