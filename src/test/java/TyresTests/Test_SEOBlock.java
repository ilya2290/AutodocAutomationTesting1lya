package TyresTests;

import AutodocTesting.CookieClose;
import AutodocTesting.TyresMainPage.SEOBlock;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Test_SEOBlock {


    @Before
    public void siteOpen(){
        open("https://www.autodoc.de/reifen");
        Selenide.clearBrowserCookies();
        CookieClose cookie = new CookieClose();
        cookie.cookieClose();
    }

    @After
    public void afterLog(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        System.out.println("Test Finished");
    }

    @Test
    public void SEOBlockTest() throws InterruptedException {

        SEOBlock seo = new SEOBlock();
        //seo.getSEOTittle();
        //seo.scrollItems();
        //seo.getItems();
    }


}
