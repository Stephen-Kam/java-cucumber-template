package org.testcraft.pages.liability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LiabilityStartPage extends BasePage {

    public LiabilityStartPage(WebDriver driver){
        super(driver);
        url = "/intro";
        heading = "Soft Drinks Industry Levy";
    }

    public void startNow(){
        driver.findElement(By.cssSelector("a[href='/soft-drinks-industry-levy-liability-tool/liability']")).click();
    }
}
