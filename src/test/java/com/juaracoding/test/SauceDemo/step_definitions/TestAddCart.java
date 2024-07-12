package com.juaracoding.test.SauceDemo.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.test.SauceDemo.pages.AddCart;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddCart {
	
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private AddCart inputPage = new AddCart();

   public TestAddCart() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   
    //Test Case 1	
   @Given("TC06_Berada Di Halaman Utama")
   public void tc06_masuk_ke_halaman_utama() {
   	extentTest.log(LogStatus.PASS, "User memasuki halaman home");
    }
    
    @When("TC07_Klik button add1")
    public void tc07_klik_button_add1() {
    	inputPage.clickBtnAdd1();
        extentTest.log(LogStatus.PASS, "User click button Add 1");
    }
    
    @When("TC08_Klik button add2")
    public void tc08_klik_button_add2() {
    	inputPage.clickBtnAdd2();
        extentTest.log(LogStatus.PASS, "User click button Add 2");
    }
    
    @When("TC09_Klik button add3")
    public void tc09_klik_button_add3() {
    	inputPage.clickBtnAdd3();
        extentTest.log(LogStatus.PASS, "User click button Add 3");
    }

    @When("TC10_Klik button keranjang")
    public void tc10_klik_button_keranjang() {
    	inputPage.clickBtnKeranjang();
        extentTest.log(LogStatus.PASS, "User click button Keranjang");
    }
    @Then("TC11_Validasi berhasil menambah item")
    public void tc11_validasi_berhasil_menambah_item() {
    	Assert.assertEquals(inputPage.getTxtRemove(), "Remove");
    	extentTest.log(LogStatus.PASS, "User Berhasil Menambahkan Item");

    }
    
}

