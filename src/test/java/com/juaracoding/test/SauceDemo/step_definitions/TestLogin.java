package com.juaracoding.test.SauceDemo.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.test.SauceDemo.pages.Login;
import com.juaracoding.test.SauceDemo.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Login loginPage = new Login();

   public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //Test Case 1	
   @Given("TC01_Berada Di Halaman Login")
    public void Isi_username() {
    	driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User masuk Web login saucedemo");
    }
    @When("TC02_Isi username")
    public void isi_username() {
    	 loginPage.usernameA("standard_user");
         extentTest.log(LogStatus.PASS, "User isi username benar");
    }
    @When("TC03_Isi password")
    public void isi_password() {
    	 loginPage.passwordA("secret_sauce");
         extentTest.log(LogStatus.PASS, "User isi password benar");
    }
    @When("TC04_Klik button login")
    public void klik_button_login() {
    	loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }
    @Then("TC05_Validasi masuk ke halaman utama")
    public void masuk_ke_halaman_utama() {
    	Assert.assertEquals(loginPage.getTxtProducts(), "Products");
    	extentTest.log(LogStatus.PASS, "User Mendapatkan Informasi Products");
    }
}

