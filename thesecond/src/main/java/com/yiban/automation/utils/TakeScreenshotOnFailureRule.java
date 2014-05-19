package com.yiban.automation.utils;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.WebDriver;

public class TakeScreenshotOnFailureRule implements TestRule {

    private final WebDriver driver;

    public TakeScreenshotOnFailureRule(WebDriver driver) {
        this.driver = driver;
    }

    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    base.evaluate();
                }
                catch (Throwable throwable) {
                    WebDriverWrapper.screenShot(driver, "assert-fail");
                    throw throwable;
                }
            }
        };
    }
}