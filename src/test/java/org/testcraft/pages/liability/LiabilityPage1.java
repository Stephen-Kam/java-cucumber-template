package org.testcraft.pages.liability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LiabilityPage1 extends BasePage {

    public LiabilityPage1(WebDriver driver) {
        super(driver);
        url = "/liability";
        heading = "Does the business manufacture liable drinks from a production site they operate?";
    }

    private WebElement radioYes() {
        return driver.findElement(By.id("isLiable-true"));
    }

    private WebElement radioNo() {
        return driver.findElement(By.id("isLiable-false"));
    }

    public void selectRadioOption(String option) {
        switch (option) {
            case "Yes":
                radioYes().click();
                clickContinue();
                break;
            case "No":
                radioNo().click();
                clickContinue();
                break;


        }
    }

}
