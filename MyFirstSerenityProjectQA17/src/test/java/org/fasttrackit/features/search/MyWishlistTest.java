package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.MyWishlistSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyWishlistTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private MyWishlistSteps myWishlistSteps;

    @Test
    public void addToWishlistTest(){
        loginSteps.login("ralucasebeni@gmail.com", "123456");
        cartSteps.clickSaleLink();
        cartSteps.clickViewDetails();
        myWishlistSteps.clickOnAddToWishlist();
        myWishlistSteps.checkIfAddedToWishlist("Racer Back Maxi Dress has been added to your wishlist. Click here to continue shopping.");
    }
}
