package com.yiban.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class Page {
    public int DRIVER_WAIT = 120; // two minutes.

    private String title;

    private String url;

    protected final WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,
                DRIVER_WAIT);
        PageFactory.initElements(finder, this);
        this.title = this.driver.getTitle();
        this.url = this.driver.getCurrentUrl();
    }

    public String getTitle() {
        return title;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }
}
