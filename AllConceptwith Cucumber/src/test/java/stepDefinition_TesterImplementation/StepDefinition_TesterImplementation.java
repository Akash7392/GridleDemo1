package stepDefinition_TesterImplementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StepDefinition_TesterImplementation {
    WebDriver d;
   public void LaunchBrowser()
   {
    WebDriverManager.chromedriver().setup();
       System.out.println("-----------hey files---------------");


   }

   public void testsecondfeature()
   {
       System.out.println("-----hey i am from second feature------------");
   }

   public void launchingHeroku()
   {
       d= new ChromeDriver();
       d.get("https://www.heroku.com");
       d.manage().window().maximize();
       System.out.println(d.getTitle());
   }

   public void ParameterizedManager(String BrowserNmae)
   {
      if(BrowserNmae.equalsIgnoreCase("Chrome"))
      {
          WebDriverManager.chromedriver().setup();
          d= new ChromeDriver();
          d.get("https://www.heroku.com");
          d.manage().window().maximize();
          System.out.println(d.getTitle());}
      else
      {
          WebDriverManager.edgedriver().setup();
          d= new EdgeDriver();
          d.get("https://www.heroku.com");
          d.manage().window().maximize();
          System.out.println(d.getTitle());
      }
   }

}
