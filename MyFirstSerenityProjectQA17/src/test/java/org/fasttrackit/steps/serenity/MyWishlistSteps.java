package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.MyWishlistPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class MyWishlistSteps {
private ProductPage productPage;
private MyWishlistPage myWishlistPage;

    @Step
    public void clickOnAddToWishlist(){
        productPage.clickOnAddToWishlist();
}
    @Step
    public void checkIfAddedToWishlist (String text){
        Assert.assertTrue(myWishlistPage.checkAddedToWishlistText(text));
    }
}
