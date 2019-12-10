package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyWishlistPage extends PageObject {
    @FindBy(css = ".success-msg span")
    private WebElementFacade addedToWishlist;

    public boolean checkAddedToWishlistText(String text){
        return addedToWishlist.containsOnlyText(text);
    }
}
