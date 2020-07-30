package com.cybertek.pages;

import com.cybertek.utillities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[contains(@name,'user')]")
    public WebElement userName;

    @FindBy(xpath = "//input[contains(@name,'pass')]")
    public WebElement passWord;

    @FindBy(xpath = "//input[contains(@type,'submit')]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[contains(@href,'Process')]")
    public WebElement orderOption;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement dropDown;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement quantity;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement customerName;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement streetAddress;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement cityName;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement stateName;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipCode;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaCard;

    @FindBy(xpath = "//input[contains(@id,'TextBox6')]")
    public WebElement cardNumber;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//*[@id=\\\"ctl00_MainContent_fmwOrder\\\"]/tbody/tr/td/div/strong\"")
    public WebElement newOrder;








}
