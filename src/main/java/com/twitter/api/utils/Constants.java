package com.twitter.api.utils;

public final class Constants {
    private Constants() {
        throw new IllegalStateException("Utility constants class");
    }
    public static final String CONSUMER_KEY = "CONSUMER_KEY";
    public static final String CONSUMER_SECRET = "CONSUMER_SECRET";
    public static final String ACCESS_TOKEN = "ACCESS_TOKEN";
    public static final String ACCESS_TOKEN_SECRET = "ACCESS_TOKEN_SECRET";

    public static final String getEnv(String variable) {
        return System.getenv(variable);
    }
}
