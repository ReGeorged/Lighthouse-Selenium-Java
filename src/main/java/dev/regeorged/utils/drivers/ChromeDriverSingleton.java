package dev.regeorged.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverSingleton {
    private static WebDriver driver;

    private ChromeDriverSingleton() {
    }

    public static WebDriver getDriver(ChromeOptions options) {
        if (driver == null) {
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}