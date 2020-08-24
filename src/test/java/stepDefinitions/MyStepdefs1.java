package stepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyStepdefs1 {
    WebDriver driver;


    @Given("^I navigate to blueskycitadelform site$")
    //@Given("I navigate to blueskycitadelform site")
    public void i_navigate_to_blueskycitadelform_site()  {
        //STEP 2: set your system path
        System.setProperty("webdriver.gecko.driver", "C:\\BlueSky\\gecko\\geckodriver.exe");

        //STEP 3: Instantiate your firefox driver
        driver = new FirefoxDriver();

        //STEP 4: Navigate to url
        driver.get("http://blueskycitadel.com/");
    }
}
