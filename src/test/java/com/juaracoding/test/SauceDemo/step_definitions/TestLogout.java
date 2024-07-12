package com.juaracoding.test.SauceDemo.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.test.SauceDemo.pages.Logout;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogout {
	
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Logout logoutPage = new Logout();

   public TestLogout() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   
    //Test Case 1	
   @Given("TC12_Berada Di Halaman Keranjang")
   public void tc12_masuk_ke_halaman_keranjang() {
   	extentTest.log(LogStatus.PASS, "User memasuki halaman keranjang");
    }
    
    @When("TC13_Klik button Burger")
    public void tc13_klik_button_burger() {
    	logoutPage.clickBtnBurger();
        extentTest.log(LogStatus.PASS, "User click button Burger");
    }
    
    @When("TC14_Klik button Logout")
    public void tc14_klik_button_logout() {
    	logoutPage.clickBtnLogout();
        extentTest.log(LogStatus.PASS, "User click button Logout");
    }
    
    @Then("TC15_Validasi berhasil logout")
    public void tc15_validasi_berhasil_logout() {
    	Assert.assertEquals(logoutPage.getTxtLogin(), "Login");
    	extentTest.log(LogStatus.PASS, "User Berhasil Logout");

    }
 }
