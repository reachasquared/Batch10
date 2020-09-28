package RP;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestVerifyLinks {//class begins
    private WebDriver driver;
    @Before
    public void setUp(){//setUp method begins
        driver = AsquaredWebDriverFactory.getDriver("chrome");
    }//setUp method ends
    @Test
    public void testVerifyLinks(){//testVerifyLinks method starts

    //Step 0	Go to http://demo.guru99.com/V1/index.php
    driver.get("http://demo.guru99.com/V1/index.php");
    //Assert page title:  GTPL Bank Home Page
    assertEquals("GTPL Bank Home Page",driver.getTitle());

    //Step 1	Click on "New Tours" link on the header bar
    assertTrue(driver.findElement(By.linkText("New Tours")).isDisplayed());
    driver.findElement(By.linkText("New Tours")).click();
    //Assert page title : Welcome: Mercury Tours

    assertEquals("Welcome: Mercury Tours",driver.getTitle());
    // Verify Home link exist
    assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());
    // Verify Flights link exist
    assertTrue(driver.findElement(By.linkText("Flights")).isDisplayed());
    // Verify Hotels link exist
    assertTrue(driver.findElement(By.linkText("Hotels")).isDisplayed());
    // Verify Cars link exist
    assertTrue(driver.findElement(By.linkText("Car Rentals")).isDisplayed());
    // Verify Cruises link exist
    assertTrue(driver.findElement(By.linkText("Cruises")).isDisplayed());

    }//testVerifyLinks method ends
    @After//associated with Junit association
    public void tearDown(){//tearDown method starts
        driver.quit();
    }//tearDown method ends
}//class ends
