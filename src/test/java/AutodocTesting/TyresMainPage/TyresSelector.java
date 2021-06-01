package AutodocTesting.TyresMainPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import java.util.ArrayList;
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
}


