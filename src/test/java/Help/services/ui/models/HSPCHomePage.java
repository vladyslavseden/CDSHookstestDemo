package Help.services.ui.models;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HSPCHomePage {
    public CDSHooksSendbox openCDSHooksSendobox(String menubtn,String  lunchScenario){

        if ($(By.xpath("//*[contains(text(), "+ menubtn +")]")).isDisplayed()) {
            $(By.xpath("//*[contains(text(), "+ menubtn +")]")).click();
        }

        if ($(By.xpath("//*[contains(text(), "+ lunchScenario +")]")).isDisplayed()) {
            $(By.xpath("//*[contains(text(), "+ lunchScenario +")]/descendant::button")).click();
        }

        return page(CDSHooksSendbox.class);
    }
}
