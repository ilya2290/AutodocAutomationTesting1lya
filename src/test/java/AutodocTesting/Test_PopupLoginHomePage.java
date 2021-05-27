package AutodocTesting;

import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class Test_PopupLoginHomePage {

    @Test
    public void testAuthorise() {
        //Selenide.clearBrowserCookies();
        open("https://www.autodoc.de/");

        AutodocLogin.pause(); //тут нужно увеличивать задержку если падает
        CookieClose.cookieClose();
        AutodocLogin.openLoginPopupMainPage();
        AutodocLogin.setEmailAuthorisationMainPopup();
        AutodocLogin.setPasswordAuthorisationMainPopup();
        AutodocLogin.submitButtonAuthorisation();



        PopupDiscountBanner.closePopupDiscountBanner();
    }
}



