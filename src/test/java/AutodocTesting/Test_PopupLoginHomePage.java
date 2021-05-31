package AutodocTesting;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class Test_PopupLoginHomePage {

    @Test
    public void testAuthorise() {
       open("https://www.autodoc.de/");
       Selenide.clearBrowserCookies();
        CookieClose.cookieClose();
        AutodocLogin.LoginPopup();
        AutodocLogin.setEmailAuthorisationMainPopup();
        AutodocLogin.setPasswordAuthorisationMainPopup();
        AutodocLogin.submitButtonAuthorisation();

    }
}



