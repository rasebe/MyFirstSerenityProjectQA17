package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.DashboardPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {
    private DashboardPage dashboardPage;
    private HomePage homePage;
    private RegisterPage registerPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
    @Step
    public void goToRegister(){
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }
    @Step
    public void enterInfoToCreateAccount(String firstName, String lastName, String email, String password, String confirmation){
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(email);
        registerPage.setPasswordField(password);
        registerPage.setConfirmationPasswordField(confirmation);
    }
    @Step
    public void clickRegister(){
        registerPage.clickRegister();
    }
    @Step
    public void checkIfRegistered (String text){
        Assert.assertTrue(dashboardPage.checkMyDashboardText(text));
    }
    @Step
    public void register (String firstName, String lastName, String email, String password, String confirmation){
        navigateToHomepage();
        goToRegister();
        enterInfoToCreateAccount(firstName, lastName, email, password, confirmation);
        clickRegister();
    }
}
