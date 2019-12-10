package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.SalePage;
import org.junit.Assert;

public class CartSteps {
    private HomePage homePage;
    private SalePage salePage;
    private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
    @Step
    public void clickSaleLink(){
        homePage.clickSaleLink();
    }
    @Step
    public void clickViewDetails(){
        salePage.clickViewDetails();
    }
    @Step
    public void selectProductCharacteristics(){
        productPage.clickColorOption();
        productPage.clickSizeOption();
    }
    @Step
    public void clickAddToCart(){
        productPage.clickAddToCart();
    }
    @Step
    public void checkAddedToCartText(String text){
        Assert.assertTrue(cartPage.checkAddedToCartText(text));
    }
}
