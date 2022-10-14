package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
    }

    @When("I input locked username")
    public void iInputLockedUsername() {
        loginPage.inputUsername("locked_out_user");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @When("I input valid username")
    public void iInputValidUsername() { loginPage.inputUsername("standar_user");
    }

    @Then("I will go to dashboard")
    public void iWillGoToDashboard() {
        loginPage.headerDisplayed();
    }

    @When("I input standard username")
    public void iInputStandardUsername() {
        loginPage.inputUsername("standard-user");
    }

    @When("I input problem username")
    public void iInputProblemUsername() {
        loginPage.inputUsername("problem_user");
    }

    @Then("I success login")
    public void iSuccessLogin() {
        loginPage.successLogin();
    }

    @When("I input performance glitch user")
    public void iInputPerformanceGlitchUser() {
        loginPage.inputUsername("performance_glitch_user");
    }

    @When("I input null username")
    public void iInputNullUsername() {
        loginPage.inputUsername("");
    }

    @And("I input null password")
    public void iInputNullPassword() {
        loginPage.inputPassword("");
    }
}
