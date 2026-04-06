package com.cdima.homework;

public class TestConfigRunner {

    public static void main(String[] args) {
        BrowserConfig config1 = new BrowserConfig(BrowserType.CHROME, "124.0", true);
        BrowserConfig config2 = new BrowserConfig(BrowserType.FIREFOX, "115.0");
        BrowserConfig config3 = new BrowserConfig(BrowserType.EDGE);
        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        config1.afiseazaConfig();
        config2.afiseazaConfig();
        config3.afiseazaConfig();
        config4.afiseazaConfig();
    }
}