package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CartSteps cartSteps;
    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void checkoutTest(){
        cartSteps.navigateToHomepage();
        cartSteps.clickSaleLink();
        cartSteps.clickViewDetails();
        cartSteps.selectProductCharacteristics();
        cartSteps.clickAddToCart();
        checkoutSteps.clickProceedToCheckout();
        checkoutSteps.enterCredentials("ralucasebeni@gmail.com", "123456");
        checkoutSteps.clickLogin();
        checkoutSteps.checkBillingInfoText("BILLING INFORMATION");
    }
}
