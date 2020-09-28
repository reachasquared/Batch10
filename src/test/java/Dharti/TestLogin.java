package Dharti;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import core.engine.AsquaredWebDriverFactory;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLogin {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        //opening chrome browser
        driver = AsquaredWebDriverFactory.getDriver("chrome");
        baseUrl = "https://www.google.com/";
        //take 30secand pause to open any links
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin() throws Exception {
        //opening demo guru browser
        driver.get("http://demo.guru99.com/V1/index.php");
        try {
            //verify gtpl bank home page is there.
            assertEquals("GTPL Bank Home Page", driver.getTitle());
        } catch (Error e) {
            //error came for verification
            verificationErrors.append(e.toString());
        }
        //first take 0 second if secon is more than 60 second timeout test fail
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            //check user id link is there
            try { if (isElementPresent(By.name("uid"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
//find userid clear
        driver.findElement(By.name("uid")).clear();
        //find userid and send keys to sign in send keys to sing in mngr282009
        driver.findElement(By.name("uid")).sendKeys("mngr282009");
        //take o second to open if take more than 60 second time out fail the test
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            //check if password link is there
            try { if (isElementPresent(By.name("password"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
//find password link is there
        driver.findElement(By.name("password")).clear();
        //find password link and password should be dazesUt
        driver.findElement(By.name("password")).sendKeys("dazesUt");
        //to open take 0 second if take more than 60 seconds test is fail time out
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            //link btnLogin is there catch
            try { if (isElementPresent(By.name("btnLogin"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
//find btnLogin and click
        driver.findElement(By.name("btnLogin")).click();
        try {
            //check gtpl bank title is there catch error
            assertEquals("GTPL Bank Manager HomePage", driver.getTitle());
        } catch (Error e) {
            //verification errors
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
