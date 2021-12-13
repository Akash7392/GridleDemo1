package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"C:\\Users\\Akash\\IdeaProjects\\AllConceptwith Cucumber\\src\\test\\resources\\FeaturesFiles\\WebDriverManager.feature"},
        glue="C:\\Users\\Akash\\IdeaProjects\\AllConceptwith Cucumber\\src\\test\\java\\stepDefinition_TesterImplementation",
         tags = "@aks"

)
public class TestRunnermain {




}
