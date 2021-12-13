package stepDefinition_Tester;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import stepDefinition_TesterImplementation.StepDefinition_TesterImplementation;

public class StepDefinition_Tester {

    StepDefinition_TesterImplementation wm= new StepDefinition_TesterImplementation();
    @Given("Launch the chrome browser")
    public void launch_the_chrome_browser() {
         wm.LaunchBrowser();
    }

    @Given("We are here")
    public void We_are_here() {
       wm.testsecondfeature();
    }

    @When("Navigate to any app and get the title")
    public void navigate_to_any_app_and_get_the_title() {
         wm.launchingHeroku();
    }

    @Given("to launch browser {string} with webdriver manager with parameter")
    public void to_launch_browser_with_webdriver_manager_with_parameter(String BrowserNmae) {
     wm.ParameterizedManager(BrowserNmae);
    }


}
