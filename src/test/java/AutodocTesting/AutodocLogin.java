package AutodocTesting;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class AutodocLogin {

    public static void loginMainPage()  {


        $(By.cssSelector("#wrap_content > header > div > div.header__top > div.header__profile.logined.sigin_btn > a")).click(); // login header
     // $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass")).waitUntil(Condition.appear,30000);

        String expectedTittlePopup = "Anmelden";
        String textFromLoginPopup = $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass > div > div.title")).getText();  //get text
        assertEquals (textFromLoginPopup, expectedTittlePopup);

        $(By.cssSelector("#login_top_email")).setValue("i.sukhina@autodoc.eu"); //sprosit smisl $$  //email
        $(By.cssSelector("#login_top > div:nth-child(2) > input[type=password]:nth-child(1)")).setValue("2290fuck"); //pass

    //    $(By.cssSelector("#login_top > div.button > a")).click(); //submit

    }

    public static void openLoginPopupMainPage(){
        $(By.cssSelector("#wrap_content > header > div > div.header__top > div.header__profile.logined.sigin_btn > a")).click();
        String expectedTittlePopup = "Anmelden";
        String textFromLoginPopup = $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass > div > div.title")).getText();  //get text
        assertEquals (textFromLoginPopup, expectedTittlePopup);
    }

    public static void setEmailAuthorisationMainPopup(){
        $(By.cssSelector("#login_top_email")).setValue("i.sukhina@autodoc.eu");
    }

    public static void setPasswordAuthorisationMainPopup(){
        $(By.cssSelector("#login_top > div:nth-child(2) > input[type=password]:nth-child(1)")).setValue("2290fuck");
    }

    public  static  void submitButtonAuthorisation(){
        $(By.cssSelector("#login_top > div.button > a")).click();


    }

    public  static void  ass( ){

        $(By.cssSelector("#wrap_content > header > div > div.header__top > div.header__profile.logined.sigin_btn > a")).click();
        $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass")).waitUntil(Condition.appear,5000);
    }

    public static void pause(){
        $(By.cssSelector("#slick-slide00 > span > img")).waitWhile(Condition.appear,5000);
    }
//
}


