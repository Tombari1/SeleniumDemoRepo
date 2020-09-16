package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class MyCommandStepdefs { WebDriver driver;

    @Given("^I navigate to Blueskycitadelform website$")
    public void iNavigateToBlueskycitadelformWebsite() {
        System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.get("https://blueskycitadel.com");
    }

    @And("^I refresh the home page$")
    public void iRefreshTheHomePage() {
        driver.navigate().refresh();

    }

    @And("^I get the url title$")
    public void iGetTheUrlTitle() { String urlTitle = driver.getTitle();
    System.out.println(urlTitle);
    }

    @And("^I get the page url itself$")
    public void iGetThePageUrlItself() {String urlLink = driver.getCurrentUrl();
    System.out.println(urlLink);
    }

    @And("^I get the page source$")
    public void iGetThePageSource() { String pageSource = driver.getPageSource();
    System.out.println(pageSource);
    }

    @And("^I get the window handle$")
    public void iGetTheWindowHandle() { String windowHanddle = driver.getWindowHandle();
    System.out.println(windowHanddle);
    }

    @When("^I click on automation Testing Form$")
    public void iClickOnAutomationTestingForm() {
        driver.findElement(By.linkText("Automation Testing Form"));
    }

    @And("^I get the form page Title$")
    public void iGetTheFormPageTitle() {String formPageTitle = driver.findElement(By.className("entry-title")).getText();
    System.out.println(formPageTitle);
    }

    @And("^I get the attribute of an Element$")
    public void iGetTheAttributeOfAnElement() {
        String elementAtrbute = driver.findElement(By.className("entry-title")).getAttribute("class");
        System.out.println(elementAtrbute);
    }

    @And("^I type the Password$")
    public void iTypeThePassword() {
        driver.findElement(By.id("nf-field-144")).sendKeys("mypassword");
    }

    @And("^I clear the password$")
    public void iClearThePassword() {
        driver.findElement(By.id("nf-field-144")).clear();
    }

    @Then("^I navigate back to the Previous page$")
    public void iNavigateBackToThePreviousPage() { driver.navigate().back();
    }

    @And("^I navigate to the next Page using the forward button$")
    public void iNavigateToTheNextPageUsingTheForwardButton() {driver.navigate().forward();
    }

    @And("^I click on the Submit button$")
    public void iClickOnTheSubmitButton() {driver.findElement(By.id("nf-field-133")).click();
    }

    @And("^the password error Message is displayed$")
    public void thePasswordErrorMessageIsDisplayed() {
       // printing out the error message that is displayed
        String errorMessage = driver.findElement(By.className("nf-error-msg nf-error-required-error")).getText();
       //confirming if the error message "This is a required field." is  displayed or not
       Boolean isItDisplayed = driver.findElement(By.className("nf-error-msg nf-error-required-error")).isDisplayed();
        System.out.println(isItDisplayed);
    }


    @And("^I close my Window$")
    public void iCloseMyWindow() {
        driver.quit();
    }
}
