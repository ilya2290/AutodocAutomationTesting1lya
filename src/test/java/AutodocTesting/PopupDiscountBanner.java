package AutodocTesting;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PopupDiscountBanner {

    public static void closePopupDiscountBanner(){
        $(By.cssSelector("#wrapper > div.popup-leaving-users > div.popup-leaving-users__slider.js-popup-leaving-users.popup-leaving-users__slider--right.slick-initialized.slick-slider > div > div > span > img")).waitUntil(Condition.appear,30000);
        $(By.cssSelector("#wrapper > div.popup-leaving-users > div.popup-leaving-users__close")).click();
    }
}
