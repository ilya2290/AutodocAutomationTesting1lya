package Learning;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class DnDLearn {

    @Test
    public void test() throws InterruptedException {
        open("https://crossbrowsertesting.github.io/drag-and-drop");

       //Вывод текста с драг + дроп
        String text1;
        String text2;
        text1 = $(By.id("draggable")).getText();
        text2 = $(By.id("droppable")).getText();
        System.out.println(text1);
        System.out.println(text2);

        Thread.sleep(1000);
        try {
            $(By.id("draggable")).dragAndDropTo($(By.id("droppable")));
            Thread.sleep(5000);
        }

        catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        finally {
            System.out.println("Test has done");
        }

        // Рабочая часть ДнД
        SelenideElement element = $(By.id("draggable"));
        SelenideElement element2 =$(By.id("droppable"));
        actions().
                moveToElement(element).
                clickAndHold().
                moveToElement(element2).
                release().
                build().
                perform();
        Thread.sleep(5000);

    }
}
