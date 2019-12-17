package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchResultsSteps {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void searchForProduct(String text){
        homePage.fillSearchField(text);
        homePage.clickSearchButton();
    }
    @Step
    public void sortByRelevance(){
        searchResultsPage.selectFromDropdown("Relevance");
    }
    @Step
    public void sortByPrice(){
        searchResultsPage.selectFromDropdown("Price");
    }
    @Step
    public void sortByName(){
        searchResultsPage.selectFromDropdown("Name");
    }
    @Step
    public void checkPriceAscending(){
        searchResultsPage.checkProductsPrices();
    }
}
