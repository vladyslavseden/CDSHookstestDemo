package Help.services.ui.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class CDSHooksSendbox {
    private Select dropdown = new Select($(By.className("Select__select___2Ko_o")));
    private List<WebElement> dd = dropdown.getOptions();
    static String sesionToken;

    public int checkNumberOfElements(){
        int result;
        result = dd.size();
        return result;
    }

    public boolean isServiceavalaible(String service){
        for (int i = 0; i < dd.size(); i++) {
            if(dd.get(i).toString() == service){
                return true;
            }
            else
                return false;
        }
        return false;

    }
    public String getSesionToken(){

        return sesionToken;
    }

}

