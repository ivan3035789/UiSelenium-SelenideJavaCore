package testWeb;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import step.BasketStep;
import step.DemoblazePageStep;
import step.DescriptionProductStep;
import step.LoginFormStep;

import static com.codeborne.selenide.Selenide.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoblazePageTest {

    private final DemoblazePageStep demoblazePageStep = new DemoblazePageStep();
    private final LoginFormStep loginFormStep = new LoginFormStep();
    private final DescriptionProductStep descriptionProductStep = new DescriptionProductStep();
    private final BasketStep basketStep = new BasketStep();

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("allureSelenide", new AllureSelenide());
        SelenideLogger.addListener("allureSelenide", new AllureSelenide()
                .screenshots(false)
                .savePageSource(true));
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allureSelenide");
    }

    @BeforeEach
    public void setUpAll() {
        demoblazePageStep.openStartPage();
        sleep(5_000);
        demoblazePageStep.clickLogIn();
        demoblazePageStep.checkWindowsLogIn();
        loginFormStep.inputLogin();
        loginFormStep.inputPassword();
        loginFormStep.clickButtonLogIn();
        demoblazePageStep.checkLogInUserName();
    }

    @AfterEach
    public void timeOut() {
        basketStep.deletingEntireBucket();
        demoblazePageStep.clickLogOut();
        clearBrowserCookies();
        closeWebDriver();
    }

    @Order(1)
    @DisplayName("в этом тесте мы проверяем что цена на карточке и в корзине одинаковая")
    @Test
    void priceShouldBeSame() {
        demoblazePageStep.checkLabelCategoryText();
        demoblazePageStep.clickOnCategoryMonitor();
        int priceBasked = Integer.parseInt(demoblazePageStep.checkCartMonitorAndGetPriceCard()
                .replace("$", "").trim());

        demoblazePageStep.clickOnCardMonitor();
        descriptionProductStep.checkCartMonitor();
        descriptionProductStep.clickButtonAdd();
        descriptionProductStep.confirmation();
        demoblazePageStep.clickOnCart();
        basketStep.checkTitleBacked();
        basketStep.checkTitleColumnAndProduct();
        int priceCard = Integer.parseInt(basketStep.checkAndGetPriceBasket());
        basketStep.deleteProduct();

        basketStep.priceComparison(priceCard, priceBasked);
    }
}
