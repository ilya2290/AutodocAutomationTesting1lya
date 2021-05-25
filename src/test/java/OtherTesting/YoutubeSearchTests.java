package OtherTesting;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static junit.framework.TestCase.assertEquals;

public class YoutubeSearchTests {


    @Test
    public void searchField(){

        open ("https://www.youtube.com/");
     /*
       WebDriver driver = new ChromeDriver();
        String tittle = "YouTube";
        String actualTittle = driver.getTitle();
        Configuration.timeout = 5000;
        assertEquals(tittle,actualTittle);
    */

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement searchField = driver.findElement(By.name("search_query"));
        searchField.click();
       searchField.sendKeys("Fine line cars");
        //searchField.submit();

        //$(new By.ByCssSelector("#search")).setValue("Fine line cars");


    }

}
