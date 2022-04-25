package modules.transaction.request;

public enum PaymentMethodType {
    BANK_TRASNFER("Bank transfer"),
    E_WALLET("EWallet");

    public String paymentType;

    PaymentMethodType(String type) {
        paymentType = type;
    }

    public String getPaymentType() {
        return paymentType;
    }
}