package testCarHome;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.Given;
import org.openqa.selenium.chrome.ChromeOptions;

import static constants.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class BeforeTest {
    private final static String url = "https://onliner.by";
    @Given("Открываем сайт url")
    public void openWebSite(String url)   {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        Configuration.timeout = IMPLICIT_WAIT;
        Selenide.open(url);

    }
}