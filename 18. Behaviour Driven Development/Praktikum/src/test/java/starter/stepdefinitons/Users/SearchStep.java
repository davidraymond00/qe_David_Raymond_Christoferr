package starter.stepdefinitons.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep{
    @Given("I go to first view")
    public void iGoToFirstView(){
        System.out.println("I go to first view");
    }

    @Then("I click search button")
    public void iClickSearchButton() {
        System.out.println("Click search button");
    }

    @When("I will empty history")
    public void iWillEmptyHistory() {
        System.out.println("Empty history");
    }

    @Then("I click search button again")
    public void iClickSearchButtonAgain() {
        System.out.println("I click search button again");
    }

    @When("I will any history")
    public void iWillAnyHistory() {
        System.out.println("Any history");
    }

    @Given("I go to search button")
    public void iGoToSearchButton() {
        System.out.println("I go to search button");
    }

    @When("I input invalid key search")
    public void iInputInvalidKeySearch() {
        System.out.println("I input invalid key");
    }

    @Then("I will get empty search")
    public void iWillGetEmptySearch() {
        System.out.println("Empty search");
    }
}
