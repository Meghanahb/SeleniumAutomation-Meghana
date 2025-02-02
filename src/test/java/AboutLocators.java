import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AboutLocators
{
    @Test
  public void openBrowser()
  {
      //SoftAssert soft=new SoftAssert();
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.google.com/");
        try
        {
            //driver.get("https://www.collegepravesh.com/engineering-colleges/nie-mysore/");
            driver.navigate().to("https://www.collegepravesh.com/engineering-colleges/nie-mysore/");
            driver.manage().window().maximize();
            String expectedresult="The National Institute of Engineering, Mysore";
            String actualresult= driver.findElement(By.linkText("The National Institute of Engineering, Mysore")).getText();


            String expWtsApplink="Follow us on WhatsApp";
            String actWtsAppLink= driver.findElement(By.linkText("Follow us on WhatsApp")).getText();


            System.out.println("Execution started");
            Assert.assertEquals(expectedresult,actualresult);
            System.out.println("Mid point of execution");
            Assert.assertEquals(expWtsApplink,actWtsAppLink);
            System.out.println("Execution completed");

        }
        finally
        {
            //soft.assertAll();
            driver.close();
        }
  }

  @Test
  public void locators() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.collegepravesh.com/engineering-colleges/nie-mysore/");
      driver.manage().window().maximize();
      String linkloc=driver.findElement(By.linkText("News")).getText();
      System.out.println(linkloc);

      String partialLoc=driver.findElement(By.partialLinkText("New")).getText();
      System.out.println("Partial Link Test:" +partialLoc);
      //driver.close();


      driver.findElement(By.linkText("Colleges")).click();
      Thread.sleep(2000);
      String idloc=driver.findElement(By.id("cf-title")).getText();
      System.out.println(idloc);

  }
  @Test
  public void elements() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://github.com/login");
      String actulRes = driver.findElement(By.xpath("//*[contains(text(),'Username or email address')]")).getText();
      System.out.println(actulRes);

      driver.findElement(By.xpath("//input[@name='login']")).sendKeys("QA test");
      driver.manage().window().maximize();
      Thread.sleep(2000);

      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pwd");
      Thread.sleep(2000);

      driver.findElement(By.name("commit")).click();
      Thread.sleep(2000);
      //driver.findElement()

      driver.close();

  }


      @Test
      public void findElementS()
      {

          System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("https://github.com/login");
          List<WebElement> anchortags=driver.findElements(By.tagName("a"));
          for(WebElement eles:anchortags)
          {
              String linktxt=eles.getText();
              System.out.println(linktxt);
          }

      }
}
