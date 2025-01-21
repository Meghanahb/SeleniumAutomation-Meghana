import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AssignmentA
{
        @Test
        public void displayAllA()
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            try
            {
                driver.get("https://nie.ac.in/");
                driver.manage().window().maximize();

                System.out.println("Total Links present in Single Web Page");
                List<WebElement> anchrlinks = driver.findElements(By.tagName("a"));
                for(WebElement links: anchrlinks)
                {
                    String linkname= links.getText();
                    //System.out.println(linkname);
                    System.out.println(links +" "+linkname);
                }
            }

            finally
            {
                driver.close();
            }

        }

}
