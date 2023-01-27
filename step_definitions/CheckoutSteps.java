package step_definitions;

import cucumber.api.java.en.*;
import io.cucumber.java.PendingException;
public class CheckoutSteps {

    @Given("^the price of a \"(.*?)\" is (\\d+) c$")
    public void thePriceOfAIsC(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the total price should be (\\d+) c$")
    public void theTotalPriceShouldBeC(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}