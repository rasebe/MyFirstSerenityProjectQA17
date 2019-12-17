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
    public void addToCartTest(){
      cartSteps.navigateToHomepage();
      cartSteps.clickSaleLink();
      cartSteps.clickViewDetails();
      cartSteps.selectProductCharacteristics();
      cartSteps.clickAddToCart();
      cartSteps.checkAddedToCartText("Racer Back Maxi Dress was added to your shopping cart.");
    }
    @Test
    public void emptyCartTest(){
        cartSteps.addProductToCart();
        cartSteps.clickEmptyCart();
        cartSteps.checkIfCartIsEmpty("SHOPPING CART IS EMPTY");
    }
    @Test
    public void continueShoppingFromCartTest(){
        cartSteps.addProductToCart();
        cartSteps.clickContinueShopping();
        cartSteps.checkNameOfLastProductAdded("RACER BACK MAXI DRESS");
    }
    @Test
    public void editFromCartTest(){
        cartSteps.addProductToCart();
        cartSteps.clickEditButton();
        cartSteps.checkNameOfLastProductAdded("RACER BACK MAXI DRESS");
    }
    @Test
    public void viewShoppingCartTest(){
        cartSteps.addProductToCart();
        cartSteps.clickHomepageLogo();
        cartSteps.clickCartButton();
        cartSteps.clickViewShoppingCart();
        cartSteps.checkShoppingCartMsg("SHOPPING CART");
    }
    @Test
    public void invalidDiscountCodeTest(){
        cartSteps.addProductToCart();
        cartSteps.setDiscountCode("qwerty");
        cartSteps.clickApplyLink();
        cartSteps.checkDiscountCode("Coupon code \"qwerty\" is not valid.");
    }
}
