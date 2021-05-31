package AutodocTesting;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class AutodocLogin {

    public static void LoginPopup()  {
       $(new By.ByXPath("/html/body/div[1]/header/div/div[1]/div[2]/a")).click();
       $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass")).waitUntil(Condition.appear, 5000);
        String expectedTittlePopup = "Anmelden";
        Configuration.timeout= 5000;
        String actualTittlePopup = ($("body > div.autodoc_login_popup.popup_login.pass > div > div.title")).getText();
        assertEquals(expectedTittlePopup, actualTittlePopup);
    }

    public static void setEmailAuthorisationMainPopup() {
        $(By.cssSelector("#login_top_email")).setValue("i.sukhina@autodoc.eu");
    }

    public static void setPasswordAuthorisationMainPopup() {
        $(By.cssSelector("#login_top > div:nth-child(2) > input[type=password]:nth-child(1)")).setValue("2290fuck");
    }

    public static void submitButtonAuthorisation() {
        $(By.cssSelector("#login_top > div.button > a")).click();
    }

    public static void ass() {
        $(By.cssSelector("#wrap_content > header > div > div.header__top > div.header__profile.logined.sigin_btn > a")).click();
        $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass")).waitUntil(Condition.appear, 5000);
    }

    public static void pause() {
        $(By.cssSelector("#slick-slide00 > span > img")).waitWhile(Condition.appear, 10000);
    }

}


