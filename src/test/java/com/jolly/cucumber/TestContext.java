package com.jolly.cucumber;

import com.jolly.managers.PageObjectManager;
import com.jolly.managers.WebDriverManager;

public class TestContext {

    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
