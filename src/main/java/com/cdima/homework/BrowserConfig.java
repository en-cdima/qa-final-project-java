package com.cdima.homework;

public class BrowserConfig {
    private BrowserType browserType;
    private String version;
    private Boolean isHeadless;

    public BrowserConfig(BrowserType browserType, String version, Boolean isHeadless) {
        this.browserType = browserType;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    public BrowserConfig(BrowserType browserType, String version) {
        this(browserType, version, false);
    }

    public BrowserConfig(BrowserType browserType) {
        this(browserType, "latest", false);
    }

    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    public void afiseazaConfig() {
        System.out.println("Browser: " + this.browserType + ", Version: " + this.version
        + ", Headless: " + this.isHeadless);
    }
}