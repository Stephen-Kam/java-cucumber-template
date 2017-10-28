package org.testcraft.pages.liability;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testcraft.util.Configuration;

public class BasePage {

    WebDriver driver;
    private Configuration configuration = new Configuration();
    String url = "";
    String heading = "";

    BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.navigate().to(configuration.url + url);
    }

    public void on() {
        Assert.assertTrue("Correct page was not loaded. " + driver.getCurrentUrl() + " was loaded instead", driver.findElement(By.cssSelector("h1")).getText().equals(heading));
    }

    void clickContinue() {
        driver.findElement(By.xpath(".//*[contains(text(),'Continue')]")).click();
    }

}


