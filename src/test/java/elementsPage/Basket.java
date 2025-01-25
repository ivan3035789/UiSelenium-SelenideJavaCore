package elementsPage;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;

import static com.codeborne.selenide.Selenide.$;

@Data
public class Basket {

    @CacheLookup
    private final SelenideElement title = $(By.xpath("//*[@id='page-wrapper']/div/div[1]/h2"));

    @CacheLookup
    private final SelenideElement titleProduct = $(By.xpath("//*[@id='tbodyid']/tr/td[2]"));

    @CacheLookup
    private final SelenideElement priceProduct = $(By.xpath("//*[@id='tbodyid']/tr/td[3]"));

    @CacheLookup
    private final SelenideElement totalPrice = $(By.xpath("//*[@id='totalp']"));

    @CacheLookup
    private final SelenideElement totalColumn = $(By.xpath("//*[@id='page-wrapper']/div/div[1]/div/table/thead/tr/th[2]"));

    @CacheLookup
    private final SelenideElement priceColumn = $(By.xpath("//*[@id='page-wrapper']/div/div[1]/div/table/thead/tr/th[3]"));

    @CacheLookup
    private final SelenideElement deleteButton = $(By.xpath("//*[@id='tbodyid']/tr/td[4]/a"));


    public SelenideElement getTitle() {
        return title;
    }

    public SelenideElement getTitleProduct() {
        return titleProduct;
    }

    public SelenideElement getPriceProduct() {
        return priceProduct;
    }

    public SelenideElement getTotalPrice() {
        return totalPrice;
    }

    public SelenideElement getTotalColumn() {
        return totalColumn;
    }

    public SelenideElement getPriceColumn() {
        return priceColumn;
    }

    public SelenideElement getDeleteButton() {
        return deleteButton;
    }
}

