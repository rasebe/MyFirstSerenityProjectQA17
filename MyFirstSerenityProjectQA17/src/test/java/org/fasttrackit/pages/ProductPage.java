package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {
    @FindBy(css="img[alt='Purple']")
    private WebElementFacade colorOption;

    @FindBy(css="#swatch80 span:first-child")
    private WebElementFacade sizeOption;

    @FindBy(css=".add-to-cart-buttons span>span")
    private WebElementFacade addToCartButton;

    @FindBy(css=".link-wishlist")
    private WebElementFacade addToWishlistLink;

    public void clickColorOption(){
        clickOn(colorOption);
    }
    public void clickSizeOption(){
        clickOn(sizeOption);
    }
    public void clickAddToCart(){
        clickOn(addToCartButton);
    }
    public void clickOnAddToWishlist(){
        clickOn(addToWishlistLink);
    }
}
