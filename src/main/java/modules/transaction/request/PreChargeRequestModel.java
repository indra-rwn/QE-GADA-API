package modules.transaction.request;

import modules.BaseModel;

public class PreChargeRequestModel extends BaseModel {

    public int itemAmount;
    public String itemDescription;
    public String itemType;
    public Enum paymentMethodDetailType;
    public Enum paymentMethodType;

    @Override
    public PreChargeRequestModel getBody() {
        return this;
    }

    public PreChargeRequestModel(int ammount, String description, String itemType, PaymentMethodDetailType paymentMethodDetailType, PaymentMethodType paymentMethodType) {
        this.itemAmount = ammount;
        this.itemDescription = description;
        this.itemType = itemType;
        this.paymentMethodDetailType = paymentMethodDetailType;
        this.paymentMethodType = paymentMethodType;
    }
}