package step;

import doMain.User;
import elementsPage.LogInForm;
import io.qameta.allure.Step;
import lombok.Value;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

@Value
public class LoginFormStep {

    LogInForm logInForm = new LogInForm();
    User user = new User();

    @Step("Пользователь вводит имя")
    public void inputLogin() {
        logInForm.getNameLoginField().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Username:".trim()));
        logInForm.getInputLoginField().append(user.getName().trim());
    }

    @Step("Пользователь вводит пароль")
    public void inputPassword() {
        logInForm.getNamePasswordField().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Password:".trim()));
        logInForm.getInputPasswordField().append(user.getPassword().trim());
    }

    @Step("Пользователь кликает на кнопку 'Log In'")
    public void clickButtonLogIn() {
        logInForm.getButtonLogIn().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Log in".trim()));
        logInForm.getButtonLogIn().click();
    }
}
