package Chaitra;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Test_Login {//class begins
    private WebDriver driver;

    @Before
    public void setUp(){//setUp  method
         driver = AsquaredWebDriverFactory.getDriver("chrome");

    }//setUp ends

    @Test
    public void test_Login() {//test method begins
        // Go to http://demo.guru99.com/V1/index.php
         driver.get("http://demo.guru99.com/V1/index.php");

         //verify Page title: GTPL Bank Home Page
        assertEquals("GTPL Bank Home Page",driver.getTitle());

        //Verify UserID field exist
        assertTrue(driver.findElement(By.name("uid")).isDisplayed());

        //Enter ‘mngr282009’ into UserID
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
        assertTrue(driver.findElement(By.name("Welcome To The Online Banking Page of GTPL Bank")).isDisplayed());

    }//test method ends

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }
}//class ends
