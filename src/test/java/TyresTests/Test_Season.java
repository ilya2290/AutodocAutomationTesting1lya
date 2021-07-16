package TyresTests;

import AutodocTesting.CookieClose;
import AutodocTesting.TyresMainPage.TyresSelector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class Test_Season {

    @Before
    public void siteOpen() {
        open("https://www.autodoc.de/reifen");
        CookieClose cookie = new CookieClose();
        cookie.cookieClose();
    }

    @After
    public void testLogs() {
        System.out.println("Test passed");
    }

    @Test
    public void selectorSeasonTest() {
        TyresSelector selector = new TyresSelector();
//        selector.getSelectorsFormValues();
//        selector.getCurrentBreiteValues();
 //           selector.getBreiteSizes();

    }
}
