package modules.transaction.request;

public enum PaymentMethodDetailType {
    BANK_TRASNFER_BCA("BCA"),
    BANK_TRANSFER_MANDIRI("MANDIRI"),
    E_WALLET_SHOPEEPAY("SHOPEEPAY");

    public String detailType;

    PaymentMethodDetailType(String type) {
        detailType = type;
    }
}