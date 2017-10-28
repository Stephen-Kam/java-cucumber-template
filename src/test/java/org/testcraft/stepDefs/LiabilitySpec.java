package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testcraft.pages.liability.BrandsProducedPage3;
import org.testcraft.pages.liability.LiabilityPage1;
import org.testcraft.pages.liability.LiabilityStartPage;
import org.testcraft.pages.liability.ManufactureWhoPage2;

public class LiabilitySpec {

    private LiabilityStartPage liabilityStartPage;
    private LiabilityPage1 liabilityPage;
    private ManufactureWhoPage2 manufactureWhoPage;
    private BrandsProducedPage3 brandsProducedPage;

    public LiabilitySpec() {
        WebDriver driver = Hooks.driver;
        liabilityStartPage = new LiabilityStartPage(driver);
        liabilityPage = new LiabilityPage1(driver);
        manufactureWhoPage = new ManufactureWhoPage2(driver);
        brandsProducedPage = new BrandsProducedPage3(driver);
    }


    @Given("^the user is at the start of the liability tool$")
    public void the_user_is_at_the_start_of_the_liability_tool() throws Throwable {
        liabilityStartPage.navigateTo();
        liabilityStartPage.on();
    }

    @Given("^they start the liability process$")
    public void they_start_the_liability_process() throws Throwable {
        liabilityStartPage.startNow();
        liabilityPage.on();
    }

    @When("^the user indicates that they are liable for drinks they manufacture from a production site they operate$")
    public void the_user_indicates_that_they_are_liable_for_drinks_they_manufacture_from_a_production_site_they_operate() throws Throwable {
        liabilityPage.selectRadioOption("Yes");
        manufactureWhoPage.on();
    }

    @When("^they indicate that they manufacture liable drinks for their own brands$")
    public void they_indicate_that_they_manufacture_liable_drinks_for_their_own_brands() throws Throwable {
        manufactureWhoPage.selectManufactureOptions(1);
        brandsProducedPage.on();
    }

    @When("^the user enters in how much liable drink they manufacture for their own brands: (\\d+)$")
    public void the_user_enters_in_how_much_liable_drink_they_manufacture_for_their_own_brands(int arg1) throws Throwable {
        //TODO
    }

    @When("^the user indicates that they do not commission contract packers$")
    public void the_user_indicates_that_they_do_not_commission_contract_packers() throws Throwable {
        //TODO
    }

    @When("^the user indicates that they do not import liable drinks into the UK$")
    public void the_user_indicates_that_they_do_not_import_liable_drinks_into_the_UK() throws Throwable {
        //TODO
    }

    @Then("^the check your answers page will be visible$")
    public void the_check_your_answers_page_will_be_visible() throws Throwable {
        //TODO
    }

    @Then("^the user's entered values will be correct$")
    public void the_user_s_entered_values_will_be_correct() throws Throwable {
        //TODO
    }

    @When("^the user continues$")
    public void the_user_continues() throws Throwable {
        //TODO
    }

    @Then("^the correct response will be displayed: \"([^\"]*)\"$")
    public void the_correct_response_will_be_displayed(String outcome) throws Throwable {
        //TODO
    }



}
