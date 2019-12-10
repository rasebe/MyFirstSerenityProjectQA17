package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Managed (uniqueSession = true)
    private WebDriver driver;

    @Steps
    CartSteps cartSteps;

    @Test
    public void cartTest(){
      cartSteps.navigateToHomepage();
      cartSteps.clickSaleLink();
      cartSteps.clickViewDetails();
      cartSteps.selectProductCharacteristics();
      cartSteps.clickAddToCart();
      cartSteps.checkAddedToCartText("Racer Back Maxi Dress was added to your shopping cart.");
    }
}
