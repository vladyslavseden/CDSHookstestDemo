package Help.services.ui.models;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class HSPCSandboxSelectionPage {


    public HSPCHomePage performSendboxSelection(String environment){
        $(By.xpath("//*[contains(text(), "+ environment +")]")).click();
        return page(HSPCHomePage.class);
    }

}
