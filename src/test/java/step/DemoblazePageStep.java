package step;

import elementsPage.DemoblazePage;
import elementsPage.NavigatePanel;
import io.qameta.allure.Step;
import lombok.Value;


import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

@Value
public class DemoblazePageStep {

    DemoblazePage demoblazePage = new DemoblazePage();
    NavigatePanel navigatePanel = new NavigatePanel();

    @Step("Пользователь открыл стартовую страницу сайта'")
    public void openStartPage() {
        open("https://www.demoblaze.com/");
    }

    @Step("Пользователь кликает на кнопку 'Log in'")
    public void clickLogIn() {
        navigatePanel.getLogIn().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Log in"));
        navigatePanel.getLogIn().click();
    }

    @Step("Пользователь кликает на кнопку 'Log out' для выхода")
    public void clickLogOut() {
        sleep(2_000);
        navigatePanel.getLogOut().shouldBe(visible, Duration.ofSeconds(15)).shouldHave(text("Log out"));
        navigatePanel.getLogOut().click();
    }

    @Step("Пользователь кликает на кнопку 'Cart' переход в корзину")
    public void clickOnCart() {
        sleep(2_000);
        navigatePanel.getCart().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Cart".trim())).click();
        navigatePanel.getCart().click();
    }

    @Step("Появилось окно для ввода логина и пароля")
    public void checkWindowsLogIn() {
        demoblazePage.getWindowsLogIn().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Log in"));
        demoblazePage.getWindowsLogInTextLabel().shouldBe(visible, Duration.ofSeconds(5));
    }

    @Step("Пользователь залогинился")
    public void checkLogInUserName() {
        demoblazePage.getWelcomeName().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Welcome Петя"));
    }

    @Step("Проверка присутствия и названия блока CATEGORIES")
    public void checkLabelCategoryText() {
        demoblazePage.getLabelCategoryText().shouldBe(visible, Duration.ofSeconds(15)).shouldHave(text("CATEGORIES"));
    }

    @Step("Пользователь просматривает цену карточки монитора")
    public String checkCartMonitorAndGetPriceCard() {
        String price;
        sleep(5_000);
        demoblazePage.getCartMonitor().shouldBe(visible, Duration.ofSeconds(5));
        price = demoblazePage.getPriceMonitor().getText();
        demoblazePage.getPriceMonitor().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("$400".trim()));
        demoblazePage.getDescriptionMonitor().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("LED Cinema Display features a 27-inch glossy LED-backlit TFT \n" +
                                                                                                       "active-matrix LCD display with IPS technology and an optimum resolution \n" +
                                                                                                       "of 2560x1440. It has a 178 degree horizontal and vertical viewing angle,\n" +
                                                                                                       " a \"typical\" brightness of 375 cd/m2, contrast ratio of 1000:1, and a \n" +
                                                                                                       "12 ms response time.".trim()));
        return price;
    }

    @Step("Пользователь кликает на категорию Monitors")
    public void clickOnCategoryMonitor() {
        demoblazePage.getLabelTextCategoryMonitor().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Monitors".trim())).click();
        demoblazePage.getLabelTextCategoryMonitor().click();
    }

    @Step("Пользователь кликает по карточке (названию)")
    public void clickOnCardMonitor() {
        demoblazePage.getTitleMonitor().click();
    }
}
