package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CheckoutPage extends PageObject {
    @FindBy(id="login-email")
    private WebElementFacade loginEmailField;

    @FindBy (id="login-password")
    private WebElementFacade loginPassField;

    @FindBy (css=".button[onclick='onepageLogin(this)'] span>span")
    private WebElementFacade loginButton;

    @FindBy (css = "li.section.allow.active h2")
    private WebElementFacade billingInformation;

    public void setEmailField(String email){
        typeInto(loginEmailField, email);
    }
    public void setPassField(String pass){
        typeInto(loginPassField, pass);
    }
    public void clickLogin(){
        clickOn(loginButton);
    }
    public boolean checkBillingInfoText(String text){
        return billingInformation.containsOnlyText(text);
    }
}
