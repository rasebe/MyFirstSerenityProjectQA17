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
}
