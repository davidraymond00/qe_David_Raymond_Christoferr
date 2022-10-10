package starter.stepdefinitions.projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetAllProject {
    @Given("I set url and invalid token to get all project")
    public void iSetUrlAndInvalidTokenToGetAllProject() {
    }

    @When("I request get all project")
    public void iRequestGetAllProject() {
    }

    @Then("I will get {int}")
    public void iWillGet401() {
    }

    @And("get Forbidden message")
    public void getForbiddenMessage() {
    }
}
