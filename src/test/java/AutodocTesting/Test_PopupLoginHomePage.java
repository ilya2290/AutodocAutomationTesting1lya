package AutodocTesting;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class Test_PopupLoginHomePage {

    @Test
    public void testAuthorise() {

        open("https://www.autodoc.de/");
        Selenide.clearBrowserCookies();
       //AutodocLogin.pause();
        CookieClose.cookieClose();
        AutodocLogin.openLoginPopupMainPage();
        AutodocLogin.setEmailAuthorisationMainPopup();
        AutodocLogin.setPasswordAuthorisationMainPopup();
        AutodocLogin.submitButtonAuthorisation();



        PopupDiscountBanner.closePopupDiscountBanner();
    }
}



