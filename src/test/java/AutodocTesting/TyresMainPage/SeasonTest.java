package AutodocTesting.TyresMainPage;

import AutodocTesting.CookieClose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class SeasonTest {

    @Before
    public void siteOpen(){
        open("https://www.autodoc.de/reifen");
    }

    @After
    public void testLogs(){
        System.out.println("Test passed");
    }

    @Test
    public void selectorSeasonTest() throws InterruptedException {
        CookieClose cookie = new CookieClose();
        TyresSelector selector = new TyresSelector();
        cookie.cookieClose();
        //selector.currentSeason();
        //selector.changeSeason();
        //selector.getSelectorFormSize();
        selector.getSelectorsFormValues();
        Thread.sleep(4000);
    }
}
