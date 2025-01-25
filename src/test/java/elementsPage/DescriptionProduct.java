package elementsPage;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;

import static com.codeborne.selenide.Selenide.$;

@Data
public class DescriptionProduct {
    @CacheLookup
    private final SelenideElement productStoreLabel = $(By.xpath("//*[@id='nava']"));

    @CacheLookup
    private final SelenideElement productDescription = $(By.xpath("//*[@id='more-information']/strong"));

    @CacheLookup
    private final SelenideElement description = $(By.xpath("//*[@id='more-information']/p"));

    @CacheLookup
    private final SelenideElement titleProductMonitor = $(By.xpath("//*[@id='tbodyid']/h2"));

    @CacheLookup
    private final SelenideElement priceProductMonitor = $(By.xpath("//*[@id='tbodyid']/h3"));

    @CacheLookup
    private final SelenideElement buttonAddProductInBasket = $(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));

    public SelenideElement getProductStoreLabel() {
        return productStoreLabel;
    }

    public SelenideElement getTitleProductMonitor() {
        return titleProductMonitor;
    }

    public SelenideElement getPriceProductMonitor() {
        return priceProductMonitor;
    }

    public SelenideElement getButtonAddProductInBasket() {
        return buttonAddProductInBasket;
    }

    public SelenideElement getProductDescription() {
        return productDescription;
    }

    public SelenideElement getDescription() {
        return description;
    }
}
