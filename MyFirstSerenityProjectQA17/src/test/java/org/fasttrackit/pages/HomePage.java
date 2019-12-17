package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css="a[href*='/customer/account'] .label")
    private WebElementFacade accountLink;

    @FindBy(css="a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css="a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(id="search")
    private WebElementFacade searchField;

    @FindBy(css="#search_mini_form > div.input-box > button")
    private WebElementFacade searchButton;

    @FindBy(css=".level0[href*='sale.html']")
    private WebElementFacade saleLink;

    @FindBy(css=".skip-link.skip-cart .label")
    private WebElementFacade cartButton;

    @FindBy(css=".cart-link")
    private WebElementFacade viewShoppingCartLink;

    public void clickAccountLink() {
        clickOn(accountLink);
    }
    public void clickOnLoginLink() {
        clickOn(loginLink);
    }
    public void clickRegisterLink() {
        clickOn(registerLink);
    }
    public void fillSearchField(String search){
        typeInto(searchField, search);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }
    public void clickSaleLink() {
        clickOn(saleLink);
    }
    public void clickCartButton() {
        clickOn(cartButton);
    }
    public void clickViewCartLink() {
        clickOn(viewShoppingCartLink);
    }
}
