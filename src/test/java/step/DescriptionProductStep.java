package step;

import elementsPage.DescriptionProduct;
import io.qameta.allure.Step;
import lombok.Value;
import org.openqa.selenium.Alert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.switchTo;

@Value
public class DescriptionProductStep {

    DescriptionProduct descriptionProduct = new DescriptionProduct();

    @Step("Проверка выбранной карточки выбранного монитора")
    public void checkCartMonitor() {
        descriptionProduct.getProductStoreLabel().shouldBe(visible, Duration.ofSeconds(10));
        descriptionProduct.getTitleProductMonitor().shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Apple monitor 24".trim()));
        descriptionProduct.getPriceProductMonitor().shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("$400".trim()));
        descriptionProduct.getProductDescription().shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Product description".trim()));
        descriptionProduct.getDescription().shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("LED Cinema Display features a 27-inch glossy LED-backlit TFT \n" +
                                                                                                      "active-matrix LCD display with IPS technology and an optimum resolution \n" +
                                                                                                      "of 2560x1440. It has a 178 degree horizontal and vertical viewing angle,\n" +
                                                                                                      " a \"typical\" brightness of 375 cd/m2, contrast ratio of 1000:1, and a \n" +
                                                                                                      "12 ms response time.".trim()));
    }

    @Step("Пользователь кликает кнопку 'Add to cart' добавить в корзину")
    public void clickButtonAdd() {
        descriptionProduct.getButtonAddProductInBasket().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Add to cart".trim())).click();
        descriptionProduct.getButtonAddProductInBasket().click();
    }

    @Step("Пользователь подтверждает добавление продукта в корзину")
    public void confirmation() {
        Alert alert = switchTo().alert();
        alert.accept();
    }
}
