//*******************Assignement2- Feb-1st-------------------------------
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ButtonVErification
{
    @Test
    public void isDisplayed()
    {
            SoftAssert soft=new SoftAssert();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            try
            {
            driver.get("https://askomdch.com/account/");
            driver.manage().window().maximize();

            WebElement registerbtn = driver.findElement(By.xpath("//button[@name='register']"));
            System.out.println("Register Button is Displayed:" + registerbtn.isDisplayed());
            //Assert.assertTrue(registerbtn.isDisplayed())
                soft.assertTrue(registerbtn.isDisplayed());
            }
        finally
        {
            System.out.println("Finally isDisplayed Testcase Pass");
            soft.assertAll();
            driver.close();

        }
    }

    @Test
    public void isEnabled()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SoftAssert soft =new SoftAssert();
        try
        {
            driver.get("https://askomdch.com/account/");
            driver.manage().window().maximize();
            WebElement registerbtn = driver.findElement(By.xpath("//button[@name='register']"));
            System.out.println("Register Button is Enabled:" +registerbtn.isEnabled());
            //Assert.assertTrue(registerbtn.isEnabled());
            soft.assertTrue(registerbtn.isEnabled());

        }

        finally
        {
            soft.assertAll();
            System.out.println("Finally isEnabled Testcase Passed");
            driver.close();
        }
    }
    @Test
    public  void isSelected()
    {
        SoftAssert soft=new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try
        {
            driver.get("https://askomdch.com/account/");
            driver.manage().window().maximize();
            WebElement remembermeCB=driver.findElement(By.xpath("//input[@id='rememberme']"));
            remembermeCB.click();
            System.out.println("Remember CheckBox is Selected:" +remembermeCB.isSelected());
            soft.assertTrue(remembermeCB.isSelected());

        }
        finally
        {
            soft.assertAll();
            System.out.println("Finally isSelected TestCase Pass");
            driver.close();
        }
    }
}
