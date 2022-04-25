package stepdefinitions.precharge;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.transaction.TransactionPaths;
import modules.transaction.request.PaymentMethodDetailType;
import modules.transaction.request.PaymentMethodType;
import modules.transaction.request.PreChargeRequestModel;
import modules.transaction.request.Status;
import stepdefinitions.BaseStep;

public class PreChargeSteps extends BaseStep {

    @When("^User hit pre charge API with (.*) and (.*) and (.*) and (.*) and (.*)$")
    public void hitPreChargeAPI(int ammount, String description, String itemType, PaymentMethodDetailType paymentMethodDetailType, PaymentMethodType paymentMethodType) {
        PreChargeRequestModel preChargeRequestModel = new PreChargeRequestModel(ammount, description, itemType, paymentMethodDetailType, paymentMethodType);
        response = createRequest(globalVariable.publicToken, preChargeRequestModel.toJsonString(), TransactionPaths.CHARGE.getUrl());
    }

    @Then("^success verify response API with (.*)$")
    public void verifyPayment(Status status) {
        switch (status.statusPayment) {
            case "Success":
            case "Exists":
                System.out.println("Status " + status.statusPayment);
                break;
        }
    }
}
