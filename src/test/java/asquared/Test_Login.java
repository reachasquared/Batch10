package asquared;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Test_Login {//class begins
    private WebDriver driver;

    @Before
    public void setUp(){ // setUp method
        driver = AsquaredWebDriverFactory.getDriver("chrome");
    } //setUp ends

    @Test
    public void test_Login(){//test method begins
        //Go to http://demo.guru99.com/V1/index.php
        driver.get("http://demo.guru99.com/V1/index.php");

        //Verify Page title: GTPL Bank Home Page
        assertEquals("GTPL Bank Home Page", driver.getTitle());

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

        //Verify ‘Login’ button is present
        //Click on Login
        //Verify user is successfully logged in and Gtpl Bank Home page is displayed

    }//test method ends

    @After
    public void tearDown() {
        driver.quit();
    }

}//class ends
