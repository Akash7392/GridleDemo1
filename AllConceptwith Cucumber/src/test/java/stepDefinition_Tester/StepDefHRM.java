package stepDefinition_Tester;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObject_HRM.AdminCreation;
import pageObject_HRM.LoginPageHRM;

public class StepDefHRM {
     WebDriver driver;
     LoginPageHRM  lp;
    AdminCreation ac;

    @Given("Open OrangeHRM Application on {string} and {string} browser")
    public void open_orange_hrm_application_on_and_browser(String BrowserNmae, String url) {
        if(BrowserNmae.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            lp=new LoginPageHRM(driver);
        }
        else
        {
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();
            lp=new LoginPageHRM(driver);

        }
    }


    @Then("logout from appliction")
    public void logout_from_appliction() {
        driver.quit();
    }
    @Then("Validate application name")
    public void validate_application_name() {

       // Assert.assertEquals("OrangeHRM",lp.getApplicationName());
        Assert.assertTrue(lp.getApplicationName().equals("OrangeHRM"));

    }

    @When("Enter the credentials {string} and {string}")
    public void enter_the_credentials_and(String UserName, String Password) {
         lp.login(UserName,Password);

    }
    @Then("Validate user is able to login")
    public void validate_user_is_able_to_login() {
        lp.clickonwebelement();
    }
    @Then("Validate user id getting correct alert message")
    public void validate_user_id_getting_correct_alert_message() {
        lp.alertMessageValidation();
    }

    @Then("Navigate to admin menu and select")
    public void navigate_to_admin_menu_and_select() {
        ac =new AdminCreation(driver);
        ac.adminmenuselection();
    }
    @Then("Select User role and status from dropdown")
    public void select_user_role_and_status_from_dropdown() {
        ac.StatusAnduserRoleDropdown();

    }
    @Then("Enter personal  details {string} and {string} and {string} and {string}")
    public void enter_personal_details_and_and_and(String EmpName, String username, String password, String ConfirmPassword) {
     ac.customerDetails(EmpName,username,password,ConfirmPassword);
    }
    @Then("svae the details")
    public void svae_the_details() {
         ac.setSaveButton();
    }

    @Then("Add new user")
    public void add_new_user() {
       ac.addnewUser();
    }

}
