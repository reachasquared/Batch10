package YESHA;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
// select java unit
import core.engine.AsquaredWebDriverFactory;
//oprn new engine Asquaredwebdriverfactory;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLogin {
    //open new folder Testlogin
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
      //  driver = new FirefoxDriver();
     // opening chrome browser
        driver = AsquaredWebDriverFactory.getDriver("chrome");
      // setting variable value
        baseUrl = "https://www.google.com/";
      // setting 30 seconds of wait time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin() throws Exception {
        driver.get("http://demo.guru99.com/V1/index.php");
        try {
            //open new webpage demo.guru99.com/V1/index.php
            assertEquals("GTPL Bank Home Page", driver.getTitle());
        } catch (Error e) {
            //assert page title leads to GTPL bank home page
            verificationErrors.append(e.toString());
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("uid"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.name("uid")).click();
        //Find element called name and click it.
        driver.findElement(By.name("uid")).clear();
        //Find element called name
        driver.findElement(By.name("uid")).sendKeys("mngr282009");
        //sendkeys element mngr28009
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("password"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.name("password")).clear();
        //element find called password
        driver.findElement(By.name("password")).sendKeys("dazesUt");
        //sendkeys element n put the password
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("btnLogin"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.name("btnLogin")).click();
        try {
            // after enter the name n password try to login the page
            assertEquals("GTPL Bank Manager HomePage", driver.getTitle());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @After
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
