package com.upgrade.tests;

import com.upgrade.utilities.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static String UPGRADE_REST_BASEURI = "";
    public static String UPGRADE_WEB_INTRO_URL = "";
    public static String UPGRADE_WEB_LOGIN_URL = "";

    public static WebDriver driver;
    public static ReadProperties properties;

    @BeforeMethod
    public void setUp() {
        properties = ReadProperties.getInstance();
        UPGRADE_REST_BASEURI = properties.getValue("upgrade.rest.baseuri");
        UPGRADE_WEB_INTRO_URL = properties.getValue("upgrade.web.intro.url");
        UPGRADE_WEB_LOGIN_URL = properties.getValue("upgrade.web.login.url");

       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
