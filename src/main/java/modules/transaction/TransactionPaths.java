package modules.transaction;

public enum TransactionPaths {
    CHARGE(""),
    PRECHARGE("");

    private final String url;

    TransactionPaths(String value) {
        url = value;
    }

    public String getUrl() {
        return url;
    }
}