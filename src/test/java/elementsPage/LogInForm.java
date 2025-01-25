package elementsPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;

import static com.codeborne.selenide.Selenide.$;

public class LogInForm {
    @CacheLookup
    private final SelenideElement inputLoginField = $(By.xpath("//*[@id='loginusername']"));

    @CacheLookup
    private final SelenideElement nameLoginField = $(By.xpath("//*[@id='logInModal']/div/div/div[2]/form/div[1]/label"));

    @CacheLookup
    private final SelenideElement inputPasswordField = $(By.xpath("//*[@id='loginpassword']"));

    @CacheLookup
    private final SelenideElement namePasswordField = $(By.xpath("//*[@id='logInModal']/div/div/div[2]/form/div[2]/label"));

    @CacheLookup
    private final SelenideElement buttonLogIn = $(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]"));

    public SelenideElement getInputLoginField() {
        return inputLoginField;
    }

    public SelenideElement getNameLoginField() {
        return nameLoginField;
    }

    public SelenideElement getInputPasswordField() {
        return inputPasswordField;
    }

    public SelenideElement getNamePasswordField() {
        return namePasswordField;
    }

    public SelenideElement getButtonLogIn() {
        return buttonLogIn;
    }
}
