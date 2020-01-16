package Help.services.ui.drivers;

import com.codeborne.selenide.Configuration;

public class DriverManager {

    public static void initBrowser(String browser){
        switch (browser){
            case "IE":
                initIE();
                break;
            case "ChromeHeadless":
                initHeadlessChrome();
                break;
            case "Chrome":
                initChrome();
                break;
            default: initChrome();
        }
        Configuration.timeout = 5000;
        Configuration.startMaximized = true;
    }

    private static void initHeadlessChrome(){
        Configuration.browser = "HeadlessChromeDriver";
    }

    private static void initIE(){
        Configuration.browser = "IEDriver";
    }

    private static void initChrome(){
        Configuration.browser = "chrome";
    }
}
