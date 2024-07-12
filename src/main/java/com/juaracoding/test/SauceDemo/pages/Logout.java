package com.juaracoding.test.SauceDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.test.SauceDemo.drivers.DriverSingleton;

public class Logout {
    private WebDriver driver;

    public Logout() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
   WebElement btnBurger;
   
   @FindBy(xpath = "//a[@id='logout_sidebar_link']")
   WebElement btnLogout;
   
   //String txtRemove = "Remove";
   
   //TAU BATASAN
   
    public void clickBtnBurger(){
        btnBurger.click();
    }
    	
    public void clickBtnLogout(){
        btnLogout.click();
    }
    
    public String getTxtLogin(){
        return "Login";
    }

}
