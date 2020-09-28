package RP;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import core.engine.AsquaredWebDriverFactory;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLogin {//class starts
    private WebDriver driver;//variable/webdriver class declaration
    private String baseUrl;//variable declaration
    private boolean acceptNextAlert = true;//variable declaration
    private StringBuffer verificationErrors = new StringBuffer();

    @Before//associated with Junit association
    public void setUp() throws Exception {
        //opening chrome browser
       // driver = new FirefoxDriver();
        driver = AsquaredWebDriverFactory.getDriver("chrome");//driver is an object and it is created
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test//associated with Junit association
    public void testLogin() throws Exception {
        driver.get("http://demo.guru99.com/V1/index.php");//telling driver to open url
        try {
            assertEquals("GTPL Bank Home Page", driver.getTitle());//hey driver,verify page title
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("uid"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.name("uid")).click();
        driver.findElement(By.name("uid")).clear();
        driver.findElement(By.name("uid")).sendKeys("mngr282009");
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("password"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("dazesUt");
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("btnLogin"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.name("btnLogin")).click();
        try {
            assertEquals("GTPL Bank Manager HomePage", driver.getTitle());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @After//associated with Junit association
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
