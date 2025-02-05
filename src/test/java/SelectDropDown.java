import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

import java.util.ArrayList;

public class SelectDropDown
{
    @Test
    public void SelectDropDown()throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\FirstProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        try {


            driver.get("https://demo.automationtesting.in/Register.html");
            driver.manage().window().maximize();
            WebElement month = driver.findElement(By.xpath("//select[@type='text'][@placeholder='Month']"));
            Select drpdown = new Select(month);
            //drpdown.selectByIndex(1);
            //drpdown.selectByVisibleText("March");
            drpdown.selectByValue("April");
            Thread.sleep(2000);
            //driver.close();


            List expectedlist = new ArrayList<>();
            expectedlist.add("Month");
            expectedlist.add("January");
            expectedlist.add("February");
            expectedlist.add("March");
            expectedlist.add("April");
            expectedlist.add("May");
            expectedlist.add("June");
            expectedlist.add("July");
            expectedlist.add("August");
            expectedlist.add("September");
            expectedlist.add("October");
            expectedlist.add("November");
            expectedlist.add("December");
            System.out.println("Expected List:" + expectedlist);
            System.out.println("Expected List size:" + expectedlist.size());

            List<String> actualList = new ArrayList<>();

            List<WebElement> option = drpdown.getOptions();
            System.out.println("Actual List size:" + option.size());
        /*for(int i=0;i<option.size();i++)
        {
            System.out.println(option.get(i).getText());
        }*/

            for (WebElement drpList : option) {
                actualList.add(drpList.getText());
            }

            System.out.println("ActualList Items:" + actualList);

            Assert.assertEquals(expectedlist, actualList);
        }
        finally
        {

            driver.close();
        }

    }
}
