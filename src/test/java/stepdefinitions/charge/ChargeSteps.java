package stepdefinitions.charge;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.transaction.TransactionPaths;
import modules.transaction.request.*;
import stepdefinitions.BaseStep;

public class ChargeSteps extends BaseStep {

    @When("^I hit charge API with value (.*) and (.*) and (.*)$")
    public void hitChargeAPI(String requestID, String token, int duration) {
        ChargeRequestModel chargeRequestModel = new ChargeRequestModel(requestID, token, duration);
        response = createRequest(globalVariable.publicToken, chargeRequestModel.toJsonString(), TransactionPaths.CHARGE.getUrl());
    }

    @Then("^verify response API with (.*)$")
    public void verify_response_api(int response) {
        switch (response) {
            case 200:
                System.out.println("Success request");
                break;
            case 422:
                System.out.println("Failed request");
                break;
        }
    }
}