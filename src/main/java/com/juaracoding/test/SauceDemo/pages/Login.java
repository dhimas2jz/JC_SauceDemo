package com.juaracoding.test.SauceDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.test.SauceDemo.drivers.DriverSingleton;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(xpath = "//input[@id='user-name']")
   WebElement username;

   @FindBy(xpath = "//input[@id='password']")
   WebElement password;

   @FindBy(xpath = "//input[@id='login-button']")
   WebElement btnLogin;
    
   String txtProducts = "Products";
    
   @FindBy(xpath = "//div[@class='error-message-container error']")
    WebElement txtUsernameIsRequired;
   
   @FindBy(xpath = "//div[@class='login_logo']")
    WebElement txtDashboard;

    public void usernameA(String username){
        this.username.sendKeys(username);
    }
    public void passwordA(String password){
        this.password.sendKeys(password);
    }
    public void clickBtnLogin(){
        btnLogin.click();
    }
    public String getTxtProducts(){
        return "Products";
    }
    public String getTxtInvalidCredentials(){
        return txtUsernameIsRequired.getText();
    }
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
    
}
