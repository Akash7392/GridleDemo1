package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"C:\\Users\\Akash\\IdeaProjects\\AllConceptwith Cucumber\\src\\test\\resources\\FeaturesFiles\\LoginPageHRM.feature",
                 "C:\\Users\\Akash\\IdeaProjects\\AllConceptwith Cucumber\\src\\test\\resources\\FeaturesFiles\\AdminNewInHRM.feature"},


        glue="C:\\Users\\Akash\\IdeaProjects\\AllConceptwith Cucumber\\src\\test\\java\\stepDefinition_Tester\\StepDefHRM.java",
         tags = ("@AKASH or @A")

)
public class TestRunnermain {

}
