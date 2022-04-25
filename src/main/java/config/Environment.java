package config;

public enum Environment {
    DEVELOPMENT(""),
    STAGING("");

    private final String url;

    Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}