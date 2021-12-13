package locaators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
          static WebDriver d;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        d=new ChromeDriver();
         d.get("https://www.google.co.in/");
       List<WebElement> l= d.findElements(By.tagName("a"));
        System.out.println(l.size());

        System.out.println("#########");

        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i).getAttribute("href"));
        }
        System.out.println("#########");
     d.quit();

    }

}
