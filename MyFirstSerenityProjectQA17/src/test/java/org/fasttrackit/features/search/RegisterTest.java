package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validRegisterTest(){
        String email = RandomStringUtils.randomAlphanumeric(7) + "@testFastTrackIt.com";
        registerSteps.navigateToHomepage();
        registerSteps.goToRegister();
        registerSteps.enterInfoToCreateAccount(" John", "Doe", email, "123456", "123456");
        registerSteps.clickRegister();
        registerSteps.checkIfRegistered("MY DASHBOARD");
    }
}
