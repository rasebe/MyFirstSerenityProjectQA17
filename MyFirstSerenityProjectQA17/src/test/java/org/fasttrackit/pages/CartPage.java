package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {
    @FindBy(css = ".success-msg span")
    private WebElementFacade addedToShoppingCartMsg;

    public boolean checkAddedToCartText(String text){
        return addedToShoppingCartMsg.containsOnlyText(text);
    }
    @FindBy(css=".checkout-types.top [title='Proceed to Checkout'] span>span")
    private WebElementFacade proceedToCheckoutButton;

    public void clickProceedToCheckout(){
        clickOn(proceedToCheckoutButton);
    }

    @FindBy(css = "#empty_cart_button > span > span")
    private WebElementFacade emptyCartButton;

    public void clickEmptyCart(){
        clickOn(emptyCartButton);
    }

    @FindBy(css = ".page-title h1")
    private WebElementFacade shoppingCartIsEmptyMsg;

    public boolean checkEmptyCartMsg(String text){
        return shoppingCartIsEmptyMsg.containsOnlyText(text);
    }
    @FindBy(css = "button[title='Continue Shopping'] span>span")
    private WebElementFacade continueShoppingButton;

    public void clickContinueShopping(){
        clickOn(continueShoppingButton);
    }

    @FindBy(css = ".product-name span")
    private WebElementFacade backToPreviouslyAddedProduct;

    public boolean checkNameOfPreviouslyAdded(String text){
        return backToPreviouslyAddedProduct.containsOnlyText(text);
    }
    @FindBy(css = ".product-cart-actions a")
    private WebElementFacade editFromCartButton;

    public void clickEditButton(){
        clickOn(editFromCartButton);
    }

    @FindBy(css = ".large")
    private WebElementFacade homepageLogo;

    public void clickHomepageLogo(){
        clickOn(homepageLogo);
    }

    @FindBy(css = ".page-title h1")
    private WebElementFacade shoppingCartMsg;

    public boolean checkIfShoppingCartMsgIsDisplayed(String text){
        return shoppingCartMsg.containsOnlyText(text);
    }
    @FindBy(css = "#coupon_code")
    private WebElementFacade discountCodesField;

    public void setDiscountField(String discountCode){
        typeInto(discountCodesField, discountCode);
    }

    @FindBy(css = "button[title='Apply'] span>span")
    private WebElementFacade applyButton;

    public void clickApplyButton(){
        clickOn(applyButton);
    }

    @FindBy(css = ".error-msg span")
    private WebElementFacade errorMsgInvalidDiscountCode;

    public boolean checkIfDiscountCodeIsInvalid(String text){
        return errorMsgInvalidDiscountCode.containsOnlyText(text);
    }
}
