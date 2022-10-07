package starter.stepdefinitons.Users;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I go to login page")
    public void iGoToLoginPage() {
        System.out.println("I go to login page");
    }
    
    @When("I click Login button")
    public void iClickLoginButto(){
        System.out.println("I click login button");
    }

    @Then("I will get error message data is required")
    public void iWillGetErrorMessageDataIsRequired() {
        System.out.println("I get error message ");
    }

    @And("I can't login")
    public void iCanTLogin() {
        System.out.println("I can't login");
    }

    @When("I input valid password")
    public void iInputValidPassword() {
        System.out.println("I input valid password");
    }

    @Then("I will get error message data email is required")
    public void iWillGetErrorMessageDataEmailIsRequired() {
        System.out.println("I get error message data email is required");
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        System.out.println("I input valid email");
    }

    @Then("I will get error message data password is required")
    public void iWillGetErrorMessageDataPasswordIsRequired() {
        System.out.println("I get error message data password is required");
    }

    @When("I input valid email and valid password")
    public void iInputValidEmailAndValidPassword() {
        System.out.println("I input valid email and valid password");
    }

    @Then("I will success login")
    public void iWillSuccessLogin() {
        System.out.println("Success login");
    }

    @And("I click tampilkan button")
    public void iClickTampilkanButton() {
        System.out.println("I click tampilkan button");
    }

    @Then("I will unhide password")
    public void iWillUnhidePassword() {
        System.out.println("Unhide password");
    }
}
