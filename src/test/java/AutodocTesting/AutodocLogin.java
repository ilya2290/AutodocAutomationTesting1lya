package AutodocTesting;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class AutodocLogin {

    public void openLoginPopup() {
        $(new By.ByXPath("/html/body/div[1]/header/div/div[1]/div[2]/a")).click();
        $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass")).waitUntil(Condition.appear, 5000);
        String expectedTittlePopup = "Anmelden";
        Configuration.timeout = 5000;
        String actualTittlePopup = ($("body > div.autodoc_login_popup.popup_login.pass > div > div.title")).getText();
        assertEquals(expectedTittlePopup, actualTittlePopup);
    }

    public void setEmail() {
        $(By.cssSelector("#login_top_email")).setValue("i.sukhina@autodoc.eu");
    }

    public void setPassword() {
        $(By.cssSelector("#login_top > div:nth-child(2) > input[type=password]:nth-child(1)")).setValue("2290fuck");
    }

    public void submitButton() {
        $(By.cssSelector("#login_top > div.button > a")).click();
    }

    public void ass() {
        $(By.cssSelector("#wrap_content > header > div > div.header__top > div.header__profile.logined.sigin_btn > a")).click();
        $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass")).waitUntil(Condition.appear, 5000);
    }

    public void pause() {
        $(By.cssSelector("#slick-slide00 > span > img")).waitWhile(Condition.appear, 10000);
    }

    public void showPassword(){
        $(By.cssSelector("#pass-button")).doubleClick();
        Configuration.timeout =3000;
    }

    public void rememberSession(){
        $(By.cssSelector("#login_top > div.check.remember > label")).click();
    }

    public void forgetPassword(){
        String recoveryEmail = "vasyav371@gmail.com";
        String successTittle ="Vielen Dank!";
        $(By.cssSelector("#login_top > a")).click();
        $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass.recovery")).waitUntil(Condition.appear,2000);
        $(By.cssSelector("#recovery-email")).setValue(recoveryEmail);
        $(By.cssSelector("body > div.autodoc_login_popup.popup_login.pass.recovery > div.rs_pass.pass-recovery > a.senden.submit")).click();
        $(By.cssSelector("#popup_update")).waitUntil(Condition.appear,3000);
        String actualSuccessTittle = $(By.cssSelector("#popup_update > div.popup_inner > div.popup_top > h3")).getText();
        assertEquals(successTittle,actualSuccessTittle);
        $(By.cssSelector("#popup_update > div.popup_inner > div.popup_content > div.buttons > div > a")).click();
    }

}


