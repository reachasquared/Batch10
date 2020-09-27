package keerthi;

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
        //opening chrome browser//
        driver = AsquaredWebDriverFactory.getDriver("chrome");
        //setting base url//
        baseUrl = "https://www.google.com/";
        //setting 30 secondsof wait time for every action//
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void TestLogin() throws Exception {

//        setting to open the demoguru 99.com//
        driver.get("http://demo.guru99.com/V1/index.php");
        try {
//            expected gtpl bank homepage  is displayed//
            assertEquals("GTPL Bank Home Page", driver.getTitle());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("uid"))) break; } catch (Exception e) {}
            Thread.sleep(1000);//pause the execution for 1000 milliseconds//
        }

        driver.findElement(By.name("uid")).click();// to click the uid field function//
        driver.findElement(By.name("uid")).clear();//the uid field is clear//
        driver.findElement(By.name("uid")).sendKeys("mngr282009");//to enter username  to uid field//
        driver.findElement(By.name("password")).clear();//the password field is n clear format//
        driver.findElement(By.name("password")).sendKeys("dazesUt");//to enter a password to password field//
        for (int second = 0;; second++) {//process starts from 0 and it s incremented upto 60//
            if (second >= 60) fail("timeout");//process will take to run morethan 60 seconds the operation failed mentioned timeout//
            try { if (isElementPresent(By.name("password"))) break; } catch (Exception e) {}
            Thread.sleep(1000);//the particular execution of thread  paused for 1000milliseconds//
        }

        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("btnLogin"))) break; } catch (Exception e) {}// the button login is working
            Thread.sleep(1000);
        }

        driver.findElement(By.name("btnLogin")).click();//setting click action on button login//
        try {
            assertEquals("GTPL Bank Manager HomePage", driver.getTitle());//it will login in to gtpl bank manager homepage//
        } catch (Error e) {////if its not opening thr gtpl bank home page error will displayed//
            verificationErrors.append(e.toString());//error will comes i wii be appended//
        }
    }

    @After
    public void tearDown() throws Exception {// cleanup after each execution//
        driver.quit();//quit the browser//
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;//verification process done by boolean value  true it returns 1 and false means 0//

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
