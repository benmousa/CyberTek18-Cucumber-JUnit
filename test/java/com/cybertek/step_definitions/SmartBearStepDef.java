package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearPage;
import com.cybertek.utillities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBearStepDef {
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void userIsLoggedIntoSmartBearTesterAccountAndOnOrderPage() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearPage smartBearPage = new SmartBearPage();

        smartBearPage.userName.sendKeys("Tester");
        smartBearPage.passWord.sendKeys("test");
        smartBearPage.loginButton.click();
        smartBearPage.orderOption.click();
    }

    @And("User fills out the form as followed")
    public void userFillsOutTheFormAsFollowed() {

    }

    @And("User selects FamilyAlbum from product dropdown")
    public void userSelectsFamilyAlbumFromProductDropdown() {
        SmartBearPage smartBearPage = new SmartBearPage();
        Select slt = new Select(smartBearPage.dropDown);
        slt.selectByIndex(1);
    }

    @And("User enters {int} to quantity")
    public void userEntersToQuantity(int num ) {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.quantity.clear();
        smartBearPage.quantity.sendKeys("4");
        smartBearPage.quantity.click();
    }

    @And("User enters John Wick to costumer name")
    public void userEntersJohnWickToCostumerName() {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.customerName.sendKeys("John Wick");
    }

    @And("User enters Kinzie Ave to street")
    public void userEntersKinzieAveToStreet() {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.streetAddress.sendKeys("Kinzie Ave");
    }

    @And("User enters Chicago to city")
    public void userEntersChicagoToCity() {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.cityName.sendKeys("Chicago");
    }

    @And("User enters IL to state")
    public void userEntersILToState() {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.stateName.sendKeys("IL");
    }

    @And("User enters {int}")
    public void userEnters(int arg0) {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.zipCode.sendKeys("60056");
    }

    @And("User selects Visa as card type")
    public void userSelectsVisaAsCardType() throws Exception {
        Thread.sleep(2000);
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.visaCard.click();
    }

    @And("User enters {int} to card number")
    public void userEntersToCardNumber(long num) throws Exception{
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.cardNumber.clear();
        smartBearPage.cardNumber.click();
        num = 1111222233334444l;
        Thread.sleep(2000);
        smartBearPage.cardNumber.sendKeys(num+"");
        Thread.sleep(2000);
    }

    /*
        @And("User enters {int}\\/{int} to expiration date")
    public void userEntersToExpirationDate(int arg0, int arg1) {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.expirationDate.sendKeys("12/22");
    }
     */


    @And("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String arg0) {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.expirationDate.sendKeys("12/22");

    }

    @And("User clicks process button")
    public void userClicksProcessButton() {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.processButton.click();
    }

    @Then("User verifies John Wick is in the list")
    public void userVerifiesJohnWickIsInTheList() {
        SmartBearPage smartBearPage = new SmartBearPage();

        String actualText = smartBearPage.newOrder.getText();
        String exceptedText = "New order has been successfully added.";

        Assert.assertTrue(actualText.equals(exceptedText));
    }


}
