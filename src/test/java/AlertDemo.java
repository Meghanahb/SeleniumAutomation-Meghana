import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemo
{
    @Test
    public void alertOK() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        try {
            driver.get("https://demo.automationtesting.in/Alerts.html");
            driver.manage().window().maximize();
            driver.findElement(By.partialLinkText("Alert with O")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
            Thread.sleep(2000);
            Alert alert = driver.switchTo().alert();
            System.out.println("Message inside Alert is:" + alert.getText());
            Thread.sleep(2000);
            alert.accept();
        }
        finally
        {
            driver.close();
        }

    }
    @Test
    public void alerOKCancel() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        try
        {
                driver.get("https://demo.automationtesting.in/Alerts.html");
                driver.manage().window().maximize();
                driver.findElement(By.partialLinkText("Alert with OK & ")).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
                Alert alert=driver.switchTo().alert();
                Thread.sleep(2000);
                System.out.println("Message inside Alert Box:" +alert.getText());
                Thread.sleep(3000);
                alert.accept();
        }

        finally
        {
            driver.close();
        }
    }

    @Test
    public void alertWithInput()throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        try
        {
            driver.get("https://demo.automationtesting.in/Alerts.html");
            driver.manage().window().maximize();
            driver.findElement(By.linkText("Alert with Textbox")).click();
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@onclick='promptbox()'][@class='btn btn-info']")).click();
            //driver.findElement(By.linkText("click the button to demonstrate the prompt box")).click();
            Alert alert=driver.switchTo().alert();
            Thread.sleep(2000);
            alert.sendKeys("Hi Megha!");
            Thread.sleep(2000);
            alert.accept();
        }
        finally
        {
            driver.close();
        }
    }

}
