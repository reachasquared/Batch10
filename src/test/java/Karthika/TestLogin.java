package Karthika;


// import the pattern
import java.util.regex.Pattern;
//import the java concurrent until timeunit
import java.util.concurrent.TimeUnit;
//import AsquaredWebDriverFactory engine
import core.engine.AsquaredWebDriverFactory;
//import the junit
import org.junit.*;
//import the junit in assert title
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
   //TestLogin in public class
    public class TestLogin {
        //weddriver is driverr
        private WebDriver driver;
        //string should be in base url
        private String baseUrl;
        //accept next alert is true
        private boolean acceptNextAlert = true;
        //if the stringbuffer its shows verify error also will new string will buffer
        private StringBuffer verificationErrors = new StringBuffer();
//before in public void shold be  setup
        @Before
        public void setUp() throws Exception {
            //open new firefox
           driver= AsquaredWebDriverFactory.getDriver("chrome");
            // driver = new FirefoxDriver();
            // Browser google
            baseUrl = "https://www.google.com/";
            //wait 30 seconds to open  the page

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        //testlogin exception
        public void testLogin() throws Exception {
           // opening demo.guru99 home page
            driver.get("http://demo.guru99.com/V4/");
            //page will open in o second & ++
            for (int second = 0;; second++) {
                //if page will take >=60 seconds fail  timeout
                if (second >= 60) fail("timeout");
                //Element present by uid
                try { if (isElementPresent(By.name("uid"))) break; } catch (Exception e) {}
                Thread.sleep(1000);
            }
// assert page title expect "Guru99 Bank Home Page"
            try {
                assertEquals("Guru99 Bank Home Page", driver.getTitle());
                //some error
            } catch (Error e) {
             //verified he is e.tostring()
                verificationErrors.append(e.toString());
            }
            //the page wil open with in 0 seconds
            for (int second = 0;; second++) {
                //if is not the page will open with in >=60 seconds timeout its fail
                if (second >= 60) fail("timeout");
                //find the user id inbox
                try { if (isElementPresent(By.name("password"))) break; } catch (Exception e) {}
                Thread.sleep(1000);
            }
            //click on  userid inbox
            driver.findElement(By.name("uid")).click();
            //type valid userid
            driver.findElement(By.name("uid")).clear();
            //valid userid = "mngr282009"
            driver.findElement(By.name("uid")).sendKeys("mngr282009");
            //find the password inbox
            driver.findElement(By.name("password")).click();
            //Enter valid password
            driver.findElement(By.name("password")).clear();
            //valid password="dazesUt"
            driver.findElement(By.name("password")).sendKeys("dazesUt");
            //once enter the data its take o second to open the page
            for (int second = 0;; second++) {
                //if itv take morethan 60 seconds its fail to open
                if (second >= 60) fail("timeout");
                //valid data presents
                try { if (isElementPresent(By.name("btnLogin"))) break; } catch (Exception e) {}
                Thread.sleep(1000);
            }
            //click on the login button
            driver.findElement(By.name("btnLogin")).click();
            // Try to login
            try {
                //Expected to open Guru99 Bank Manager HomePage
                assertEquals("Guru99 Bank Manager HomePage", driver.getTitle());
                //catch the error e
            } catch (Error e) {
                //verification the error string e
                verificationErrors.append(e.toString());
            }
        }
        //After that
        @After
        //Expection to open
        public void tearDown() throws Exception {
            //Driver is quit
            driver.quit();
            //string will be verified
            String verificationErrorString = verificationErrors.toString();
            //Its equal to verificationError string
            if (!"".equals(verificationErrorString)) {
                //if fail to verificationErrorString
                fail(verificationErrorString);
            }
        }
        //Find the ElementPresent
        private boolean isElementPresent(By by) {
            //try to find the element present
            try {
            //once driver is find the element
                driver.findElement(by);
                //Exception is  pass
                return true;
                //there impossible to find the element is e
            } catch (NoSuchElementException e) {
                //Exception is fail
                return false;
            }
        }
        //In the private boolean as AlertPresent
        private boolean isAlertPresent() {
            //Try to find
            try {
                //If driver switch to alert
                driver.switchTo().alert();
                //exception is pass
                return true;
            // There impossible to find the NoAlertPresentException e
            } catch (NoAlertPresentException e) {
                //Exception is fail
                return false;
            }
        }
         //In the string private close the alert and get into the text
        private String closeAlertAndGetItsText() {
            // Try to next step
            try {
                //Alert=driver.switch
                Alert alert = driver.switchTo().alert();
                //String alert text = alert get text
                String alertText = alert.getText();
                // If pass to accept the next alert
                if (acceptNextAlert) {
                    // open the home page
                    alert.accept();
                    // if fail to accept
                } else {
                    //Dismiss the page
                    alert.dismiss();
                }
                //Return to the alert text box
                return alertText;
                //Once enter the valid data finally open the home page
            } finally {
                // Accept the text alert is pass
                acceptNextAlert = true;
            }
        }
    }





