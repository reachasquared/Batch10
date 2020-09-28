package keerthi;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestVerifyLinks {//class testverifylinks begins
    private WebDriver driver;

    @Before
    public void setUp(){//method setUp begins
        driver = AsquaredWebDriverFactory.getDriver("chrome");
    }//method setUp ends
    @Test
    public void testVerifylinks(){//method  testdriverlinks begins
        //Step 0	Go to http://demo.guru99.com/V1/index.php
        driver.get("http://demo.guru99.com/V1/index.php");

         //Assert page title:  GTPL Bank Home Page
        assertEquals("GTPL Bank Home Page",driver.getTitle());

         //Step 1	Click on "New Tours" link on the header bar
//assertTrue(driver.findElement(By.linkText("New Tours")).isDisplayed());
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
      // Verify Car Rentals link exist
        assertTrue(driver.findElement(By.linkText("Car Rentals")).isDisplayed());
        // Verify Cruises link exist
        assertTrue(driver.findElement(By.linkText("Cruises")).isDisplayed());


    }//method  testdriverlinks ends
    @After
    public void tearDown() throws Exception {// method teardown begins//
        driver.quit();//quit the browser//

    }//method teardown ends



}//class testverifylinks ends
