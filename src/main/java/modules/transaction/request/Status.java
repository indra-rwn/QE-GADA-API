package modules.transaction.request;

public enum Status {
    SUCCEED("Success"),
    ALREADY_EXISTS("Exists");

    public String statusPayment;

    Status(String status) {
        statusPayment = status;
    }
}