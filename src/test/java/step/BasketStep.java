package step;

import elementsPage.Basket;
import elementsPage.DescriptionProduct;
import io.qameta.allure.Step;
import lombok.Value;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

@Value
public class BasketStep {

    Basket basket = new Basket();
    DescriptionProduct descriptionProduct = new DescriptionProduct();

    @Step("Пользователь в корзине")
    public void checkTitleBacked() {
        basket.getTitle().shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Products".trim()));
    }

    @Step("Сравнение названия выбранного товара")
    public void checkTitleColumnAndProduct() {
        basket.getTotalColumn().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Title".trim()));
        basket.getTitleProduct().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Apple monitor 24".trim()));
    }

    @Step("Цена продукта товара в корзине")
    public String checkAndGetPriceBasket() {
        String price;
        price = basket.getPriceProduct().getText();
        basket.getPriceProduct().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("400".trim()));
        basket.getTitleProduct().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Apple monitor 24".trim()));
        return price;
    }

    @Step("Пользователь удаляет продукт из корзины")
    public void deleteProduct() {
        basket.getDeleteButton().shouldBe(visible, Duration.ofSeconds(5)).shouldHave(text("Delete".trim()));
        basket.getDeleteButton().click();
    }

    @Step("Пользователь удаляет продукт из корзины")
    public void priceComparison(int priceCard, int priceBasked) {
        Assertions.assertEquals(priceCard, priceBasked);
    }

    public void deletingEntireBucket() throws RuntimeException {
        int totalPrice = Integer.parseInt(basket.getTotalPrice().getText());
        while (totalPrice != 0) {
            if (basket.getTotalPrice().getText().isEmpty()) {
                break;
            } else {
                sleep(3_000);
                if (basket.getTotalPrice().getText().isEmpty()) {
                    break;
                } else {
                    totalPrice = Integer.parseInt(basket.getTotalPrice().getText());
                    basket.getDeleteButton().click();

                }
            }
        }
    }
}
