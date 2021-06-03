package AutodocTesting.TyresMainPage;

import AutodocTesting.CookieClose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class SeasonTest {

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
        selector.getSelectorsFormValues();
    }
}
