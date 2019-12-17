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
        Assert.assertTrue(cartPage.checkAddedToCartText(text)); }
    @Step
    public void clickEmptyCart(){ cartPage.clickEmptyCart(); }
    @Step
    public void checkIfCartIsEmpty(String text){Assert.assertTrue(cartPage.checkEmptyCartMsg(text)); }
    @Step
    public void clickContinueShopping(){ cartPage.clickContinueShopping(); }
    @Step
    public void checkNameOfLastProductAdded(String text){Assert.assertTrue(cartPage.checkNameOfPreviouslyAdded(text)); }
    @Step
    public void clickEditButton(){ cartPage.clickEditButton(); }
    @Step
    public void clickHomepageLogo(){cartPage.clickHomepageLogo();}
    @Step
    public void clickCartButton(){homePage.clickCartButton();}
    @Step
    public void clickViewShoppingCart() {homePage.clickViewCartLink();}
    @Step
    public void checkShoppingCartMsg(String text){Assert.assertTrue(cartPage.checkIfShoppingCartMsgIsDisplayed(text));}
    @Step
    public void setDiscountCode(String text){cartPage.setDiscountField(text);}
    @Step
    public void clickApplyLink() {cartPage.clickApplyButton();}
    @Step
    public void checkDiscountCode (String text){Assert.assertTrue(cartPage.checkIfDiscountCodeIsInvalid(text));}
    @Step
    public void addProductToCart(){
        navigateToHomepage();
        clickSaleLink();
        clickViewDetails();
        selectProductCharacteristics();
        clickAddToCart();
    }
}
