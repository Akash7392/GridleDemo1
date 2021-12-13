package pageObject_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHRM {
    WebDriver driver;

    public LoginPageHRM(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(how= How.ID, using="txtUsername")
      private WebElement Useranme;
    @FindBy(how= How.ID,using = "txtPassword")
    private WebElement Passwords;
    @FindBy(how = How.ID, using = "btnLogin")
     private WebElement Submit;
    @FindBy(how = How.ID,using = "spanMessage")
    private WebElement loginValidationMessage ;

    public void login(String Username, String Password)
    {

       Useranme.sendKeys(Username);
       Passwords.sendKeys(Password);

    }
    public String getApplicationName()
    {
        System.out.println("in getApplicationName");
       return  driver.getTitle();

    }
     public void clickonwebelement()
     {
         Submit.click();
     }

     public void alertMessageValidation()
     {
        String sms =loginValidationMessage.getText();
         System.out.println(sms);

     }

}
