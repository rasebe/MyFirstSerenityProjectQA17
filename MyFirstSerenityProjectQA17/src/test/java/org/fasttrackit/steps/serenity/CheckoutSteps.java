package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.junit.Assert;

public class CheckoutSteps {
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Step
    public void clickProceedToCheckout(){
        cartPage.clickProceedToCheckout();
    }
    @Step
    public void enterCredentials(String email, String pass){
        checkoutPage.setEmailField(email);
        checkoutPage.setPassField(pass);
    }
    @Step
    public void clickLogin(){
        checkoutPage.clickLogin();
    }
    @Step
    public void checkBillingInfoText(String text){
        Assert.assertTrue(checkoutPage.checkBillingInfoText(text));
    }
}
