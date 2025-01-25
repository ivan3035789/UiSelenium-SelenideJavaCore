package elementsPage;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;

import static com.codeborne.selenide.Selenide.$;

@Data
public class NavigatePanel {

    @CacheLookup
    private final SelenideElement logIn = $(By.xpath("//*[@id='login2']"));

    @CacheLookup
    private final SelenideElement logOut = $(By.xpath("//*[@id='logout2']"));

    @CacheLookup
    private final SelenideElement cart = $(By.xpath("//*[@id='navbarExample']/ul/li[4]/a"));

    public SelenideElement getLogIn() {
        return logIn;
    }

    public SelenideElement getLogOut() {
        return logOut;
    }

    public SelenideElement getCart() {
        return cart;
    }
}
