package AutodocTesting;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;

public class CookieClose {
    public static void cookieClose(){
        String cookiePopupExpectedTittle = "Diese Website verwendet Cookies";
        String cookiePopupActualTittle = $(By.cssSelector("#wrapper > div.popup-choose-cookies > div > div.popup-choose-cookies__title")).getText();
        assertEquals(cookiePopupExpectedTittle, cookiePopupActualTittle);
        $ (By.cssSelector("#\\32 ")).click();
    }
}
