package Help.services.ui.models;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

@Component
 public class HSPSLoginPage {
    public HSPCSandboxSelectionPage login(String userName, String pass){
        $(By.xpath("//*[@id=\"email-undefined-Email-61749\"]")).sendKeys(userName);
        $(By.xpath("//*[@id=\"password-undefined-Password-35167\"]")).sendKeys(pass);
        $(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div[1]/div/form/div[4]/button")).click();
        return page(HSPCSandboxSelectionPage.class);
    }
}
