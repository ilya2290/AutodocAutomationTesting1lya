package AutodocTesting;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Test_PopupLoginHomePage {

    @Before
    public void siteOpen(){
        open("https://www.autodoc.de/");
    }

    @Test
    public void testAuthorise() {
        Selenide.clearBrowserCookies();
        CookieClose cookie = new CookieClose();
        cookie.cookieClose();
        AutodocLogin testLogin = new AutodocLogin();
        testLogin.openLoginPopup();
        testLogin.setEmail();
        testLogin.setPassword();
        testLogin.showPassword();
        testLogin.submitButton();
    }


    @Test // Может быть нужно как класс или вложенный класс
    public void forgetPasswordTest() {
        Selenide.clearBrowserCookies();
        AutodocLogin testLogin = new AutodocLogin();
        CookieClose cookie = new CookieClose();
        cookie.cookieClose();
        testLogin.openLoginPopup();
        testLogin.forgetPassword();
    }

    @After
    public void afterLog(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        System.out.println("Test Finished");
    }

}



