package YESHA;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Testverifylink {//class begins
    private WebDriver driver;
    @Before
    public void setup() {//setup method
        driver= AsquaredWebDriverFactory.getDriver("chrome");

    }//setup ends
    @Test
    public void testverifyLink(){//test methods begins

//Step 0	Go to http://demo.guru99.com/V1/index.php
driver.get(" http://demo.guru99.com/V1/index.php");

//Assert page title:  GTPL Bank Home Page
  assertEquals( "GTPL Bank Home Page",driver.getTitle());

//Step 1	Click on "New Tours" link on the header bar
   assertTrue(driver.findElement(By.linkText("New Tours")).isDisplayed());

//Assert page title : Welcome: Mercury Tours
  assertEquals("Welcome: Mercury Tours",driver.getTitle());
driver.findElement(By.linkText("New Tours")).click();

// Verify Home link exist
     assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());

// Verify Flights link exist
  assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());
// Verify Hotels link exist
assertTrue(driver.findElement(By.linkText("Hotel")).isDisplayed());
// Verify Cars link exist
assertTrue(driver.findElement(By.linkText("Cars")).isDisplayed());
// Verify Cruises link exist
assertTrue(driver.findElement(By.linkText("Cruise")).isDisplayed());
    }//test method ends
    @After
    public void tearDown() {
        driver.quit();
    }
}//class ends
