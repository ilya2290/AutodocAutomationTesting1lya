package AutodocTesting.TyresMainPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;

public class SEOBlock { //Сделать мб как внутренний класс так как он нигде не встречается

    public void getSEOTittle() {
        String seoTittle = "NÜTZLICHE ARTIKEL ÜBER REIFEN VON AUTODOC";
        assertEquals(seoTittle, $(By.cssSelector("#content > div.most-popular > div.most-popular__heading")).getText());
    }

    public void getQuantity() {
//
//        SelenideElement element = $(By.className("slick-list draggable")).waitUntil(Condition.appear,5);
//        List<WebElement> list = (List<WebElement>) element.findElement(By.tagName(("class")));
//        int count = list.size();
//        System.out.println(count);

    }

    public void scrollItems() throws InterruptedException {

        $(By.cssSelector("#slick-slide-control01")).click();
        Thread.sleep(1000);
        $(By.cssSelector("#slick-slide-control02")).click();
        Thread.sleep(1000);
        $(By.cssSelector("#slick-slide-control03")).click();
        Thread.sleep(1000);
    }

    public void getItems(){
        List<WebElement> array = new ArrayList<>();
        array = $(By.cssSelector("#content > div.most-popular > div.most-popular__row.js-most-popular.slick-initialized.slick-slider.slick-dotted > div > div"))
                .findElements(By.tagName("a"));

        for (int i=0;i<array.toArray().length;i++){
            if (array.get(i).getText().isBlank())
                System.out.println("huy");

            else {
                System.out.println(array.get(i).getText());
            };
        }
    }
}


