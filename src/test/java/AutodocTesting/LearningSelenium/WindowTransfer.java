package AutodocTesting.LearningSelenium;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.*;

public class WindowTransfer {

    @Test
    public void windowTest() throws InterruptedException {
        open("https://www.youtube.com/");
        Thread.sleep(3000);
        $(By.cssSelector("#logo-icon")).click();
        executeJavaScript("window.open('https://www.youtube.com/feed/explore')");
        Thread.sleep(3000);
        Selenide.switchTo().window(1);// Свитч ту 1, наверно первая вкладка имеет индекс 0
        $(By.cssSelector("#endpoint > tp-yt-paper-item > yt-formatted-string")).click();
        Thread.sleep(5000);
        Selenide.switchTo().window(0);
        //$(By.id("search")).setValue("pantera domination"); //странно но сент валуе не работает
        $(By.id("search")).sendKeys("pantera domination");
        $(By.id("search")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
}
