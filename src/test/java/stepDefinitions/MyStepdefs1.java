package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class MyStepdefs1 {

    WebDriver driver;

    @Given("^I launch giftrete website$")
    //Step 1: @Given("I navigate to Giftrete site")
    public void iLaunchGiftreteWebsite() {

        //STEP 2: set your system path
        System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");

        //STEP 3: Instantiate your firefox driver
        driver = new FirefoxDriver();

        //STEP 4: Navigate to url
        driver.get("http://giftrete.com/");
    }

    @And("^I click on community$")
    public void iClickOnCommunity() {
        driver.findElement(By.linkText("Community")).click();
    }

    @When("^I click the CAPTCHA Box$")
    public void iClickTheCAPTCHABox() {
    }

    @And("^I choose matching images as desplayed$")
    public void iChooseMatchingImagesAsDesplayed() {
    }

    @Then("^I click on sign-up/create community button$")
    public void iClickOnSignUpCreateCommunityButton() {
        driver.findElement(By.id("btn_register")).click();
    }

    @And("^I enter community name$")
    public void iEnterCommunityName() {
    }

    @When("^I click on public$")
    public void iClickOnPublic() {
    }

    @And("^I select education from the category drop-down menu$")
    public void iSelectEducationFromTheCategoryDropDownMenu() {
    }

    @And("^I enter Location address$")
    public void iEnterLocationAddress() {
    }

    @And("^I enter community website$")
    public void iEnterCommunityWebsite() {
    }

    @Then("^I click on Browse to upload image$")
    public void iClickOnBrowseToUploadImage() {
    }

    @And("^I click on create community$")
    public void iClickOnCreateCommunity() {
        driver.findElement(By.linkText("Create Community")).click();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String Password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mypassword");
    }

    @And("^I confirm password \"([^\"]*)\"$")
    public void iConfirmPassword(String ConfirmedPassword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("confirm_password")).sendKeys("mypassword");
    }

    @And("^I enter first name\"([^\"]*)\"$")
    public void iEnterFirstName(String FirstName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Tombari");
    }

    @And("^I enter Last name\"([^\"]*)\"$")
    public void iEnterLastName(String LastName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Ganago");
    }

    @And("^I enter email address\"([^\"]*)\"$")
    public void iEnterEmailAddress(String Email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tomneco92@yahoo.co");
    }

    @And("^I enter phone number$")
    public void iEnterPhoneNumber() {
        driver.findElement(By.cssSelector(".selected-flag")).click();
        driver.findElement(By.id("mobile")).click();
        driver.findElement(By.id("mobile")).sendKeys("07578393652");
    }

    @Then("^I confirm an Error message \"([^\"]*)\"$")
    public void iConfirmAnErrorMessage(String ErrorMessage) throws Throwable {
        // Write code here that turns the phrase above into concrete actions


//      driver.findElement(By.id("dng_id_t")).getText();  //will return text

//      Assert.assertTrue(driver.findElement(By.id("dng_id_t")).isDisplayed());     //will return a boolean

        //ASSERTION: this means that if the message is truly displayed, then the browser will quit
        Boolean Message = driver.findElement(By.id("dng_id_t")).isDisplayed();   //will return a boolean
        Assert.assertTrue(Message, "image file name cannot be empty! please select a valid image file");
        if (Message = true)
            driver.quit();

    }

    @Then("^I quit the browser$")
    public void iQuitTheBrowser() {
        driver.quit();
    }
}


