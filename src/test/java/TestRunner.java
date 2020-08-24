import cucumber.api.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",

        glue = {"stepDefinitions"},

        tags = {"~@Ignore"}
        )

public class TestRunner {

}
