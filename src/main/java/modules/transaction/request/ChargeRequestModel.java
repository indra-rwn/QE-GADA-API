package modules.transaction.request;

import modules.BaseModel;

public class ChargeRequestModel extends BaseModel<ChargeRequestModel> {

    public String requestId;
    public String preChargeToken;
    public int paymentExpirationDuration;

    @Override
    public ChargeRequestModel getBody() {
        return this;
    }

    public ChargeRequestModel(String requestid, String token, int duration) {
        this.requestId = requestid;
        this.preChargeToken = token;
        this.paymentExpirationDuration = duration;
    }
}