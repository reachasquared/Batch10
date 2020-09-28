package keerthi;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Test_login { //class Test_login begins
    private WebDriver driver;

    @Before
    public void setUp(){//method setUp begins
         driver = AsquaredWebDriverFactory.getDriver("chrome");

    }//method setUp ends

    @Test
    public void test_Login(){//Test_login method begins
     //Go to http://demo.guru99.com/V1/index.php
        driver.get(" http://demo.guru99.com/V1/index.php");

        //verify Page title: GTPL Bank Home Page

        assertEquals("GTPL Bank Home Page",driver.getTitle());
        //Verify UserID field exist
assertTrue(driver.findElement(By.name("uid")).isDisplayed());

        // Enter ‘mngr282009’ into UserID
        driver.findElement(By.name("uid")).clear();
        driver.findElement(By.name("uid")).sendKeys("mngr282009");

        //Verify Password field Exist
        assertTrue(driver.findElement(By.name("password")).isDisplayed());
        //Enter ‘dazesUt’ into Password
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("dazesUt");

        //Verif ‘Login’ button is present
        assertTrue(driver.findElement(By.name("btnLogin")).isDisplayed());
        //Click on Login
        driver.findElement(By.name("btnLogin")).click();
        //Verify user is successfully logged in and Gtpl Bank Home page is displayed
        //assertTrue(driver.findElement(By.name("logged")).isDisplayed());
        assertEquals("GTPL Bank Manager",driver.getTitle());

    }//test method ends
    @After
    public void tearDown() throws Exception {// cleanup after each execution//
        driver.quit();//quit the browser//

        }



}//class Test_login ends
