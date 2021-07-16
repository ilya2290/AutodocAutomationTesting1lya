package AutodocTesting.TyresMainPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class TyresSelector {


    public void seasonDropDownOpen() {
        $(By.cssSelector("#form_Season")).click();
    }

    public void currentSeason() {
        String currentSeason;
        currentSeason = $(By.cssSelector("#form_Season")).getSelectedValue();
        System.out.println("Current Season is: " + currentSeason);
    }

    public void changeSeason() throws InterruptedException {
        $(By.cssSelector("#form_Season")).selectOptionByValue("0");
        TimeUnit.SECONDS.sleep(1);
        $(By.cssSelector("#form_Season")).selectOptionByValue("allwetter");
        TimeUnit.SECONDS.sleep(1);
        $(By.cssSelector("#form_Season")).selectOptionByValue("winter");
        TimeUnit.SECONDS.sleep(1);
        $(By.cssSelector("#form_Season")).selectOptionByValue("sommer");
        TimeUnit.SECONDS.sleep(1);
    }

    public void getSelectorFormSize() {
        System.out.println($(By.cssSelector("#form_Season")).getSize());
    }

    public void getSelectorsFormValues() {
        ArrayList<String> seasonValues = new ArrayList<>();
        $(By.cssSelector("#form_Season")).selectOptionByValue("0");
        seasonValues.add($(By.cssSelector("#form_Season")).getSelectedValue());
        $(By.cssSelector("#form_Season")).selectOptionByValue("allwetter");
        seasonValues.add($(By.cssSelector("#form_Season")).getSelectedValue());
        $(By.cssSelector("#form_Season")).selectOptionByValue("winter");
        seasonValues.add($(By.cssSelector("#form_Season")).getSelectedValue());
        $(By.cssSelector("#form_Season")).selectOptionByValue("sommer");
        seasonValues.add($(By.cssSelector("#form_Season")).getSelectedValue());

        for (String s : seasonValues) {
            System.out.println(s);
        }


    }

    public void getCurrentBreiteValues() {
        System.out.println($(By.cssSelector("#form_Width")).getSelectedValue());

    }
/*
    public void getBreiteSizes() { //??? НЕ ЗНАЮ КАК
        //ПОЛУЧИЛ КОЛИЧЕСТВО!!!
        String ass2 = $(By.cssSelector("#form_Width")).getText();
        SelenideElement breiteSelector = $(By.cssSelector("#form_Width"));

        List<WebElement> list = breiteSelector.findElements(By.tagName("option"));
        breiteSelector.findElements(By.tagName("option"));
        List<WebElement> list2 = new ArrayList<>();
       list2.addAll(breiteSelector.findElements(By.tagName("option")));

        int count = list.size();
        System.out.println(count);
        for (WebElement i : list) {
            System.out.println(list);
        }
            String ass;
    ass = $(By.xpath("//*[@id=\"form_Width\"]/option[1]")).getText(); // Годится
        System.out.println(ass);
    }
    */
}

