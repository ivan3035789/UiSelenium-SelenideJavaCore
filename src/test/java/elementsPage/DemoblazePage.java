package elementsPage;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;

import static com.codeborne.selenide.Selenide.*;

@Data
public class DemoblazePage {

    @CacheLookup
    private final SelenideElement labelCategoryText = $(By.xpath("//*[@id='cat']"));

    @CacheLookup
    private final SelenideElement welcomeName = $(By.xpath("//*[@id='nameofuser']"));

    @CacheLookup
    private final SelenideElement labelTextCategoryMonitor = $(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));

    @CacheLookup
    private final SelenideElement cartMonitor = $(By.xpath("//*[@id='tbodyid']/div[1]/div/div"));

    @CacheLookup
    private final SelenideElement titleMonitor = $(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a"));

    @CacheLookup
    private final SelenideElement priceMonitor = $(By.xpath("//*[@id='tbodyid']/div[1]/div/div/h5"));

    @CacheLookup
    private final SelenideElement descriptionMonitor = $(By.xpath("//*[@id='article']"));

    @CacheLookup
    private final SelenideElement windowsLogIn = $(By.xpath("//*[@id='logInModal']/div/div"));

    @CacheLookup
    private final SelenideElement windowsLogInTextLabel = $(By.xpath("//*[@id='logInModal']/div/div/div[1]"));

    public SelenideElement getLabelCategoryText() {
        return labelCategoryText;
    }

    public SelenideElement getWelcomeName() {
        return welcomeName;
    }

    public SelenideElement getLabelTextCategoryMonitor() {
        return labelTextCategoryMonitor;
    }

    public SelenideElement getCartMonitor() {
        return cartMonitor;
    }

    public SelenideElement getTitleMonitor() {
        return titleMonitor;
    }

    public SelenideElement getPriceMonitor() {
        return priceMonitor;
    }

    public SelenideElement getWindowsLogIn() {
        return windowsLogIn;
    }

    public SelenideElement getWindowsLogInTextLabel() {
        return windowsLogInTextLabel;
    }

    public SelenideElement getDescriptionMonitor() {
        return descriptionMonitor;
    }
}