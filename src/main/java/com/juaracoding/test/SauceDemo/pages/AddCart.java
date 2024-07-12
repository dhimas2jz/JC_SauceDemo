package com.juaracoding.test.SauceDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.test.SauceDemo.drivers.DriverSingleton;

public class AddCart {
    private WebDriver driver;

    public AddCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
   WebElement btnAdd1;
   
   @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
   WebElement btnAdd2;
   
   @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
   WebElement btnAdd3;
   
   @FindBy(xpath = "//span[@class='shopping_cart_badge']")
   WebElement btnKeranjang;
   
   //String txtRemove = "Remove";
   
   //TAU BATASAN
   
    public void clickBtnAdd1(){
        btnAdd1.click();
    }
    	
    public void clickBtnAdd2(){
        btnAdd2.click();
    }
    
    public void clickBtnAdd3(){
        btnAdd3.click();
    }
    
    public void clickBtnKeranjang(){
        btnKeranjang.click();
    }
    
    public String getTxtRemove(){
        return "Remove";
    }
}
