package Karthika;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestFlightsSearch extends global { //class begins
    @Test
    public void testFlightsSearch(){ //method begins
        //Step 1	Go to http://demo.guru99.com/V1/index.php
        logger.info("http://demo.guru99.com/V1/index.php");
driver.get(baseUrl);
        //Assert page title:  GTPL Bank Home Page
        logger.info("Assert page title:  GTPL Bank Home Page");
        assertEquals( "GTPL Bank Home Page",driver.getTitle());
        //verify New Tours link exist
logger.info("verify New Tours link exist");
assertTrue(driver.findElement(By.xpath("\"//a[contains(.,'New Tours')]\"")).isDisplayed());
        //Step 1	Click on "New Tours" link on the header bar
        logger.info("Click on \"New Tours\" link on the header bar");
        driver.findElement(By.xpath("//a [text()='New Tours']")).click();

        //Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");
        assertEquals("Welcome: Mercury Tours",driver.getTitle());

        //Verify Flights link exists
        logger.info("Verify Flights link exists");
assertTrue(driver.findElement(By.xpath("//a[text()='flight']")).isDisplayed());
        //Click on Flights link
logger.info("click on Flights link ");
assertTrue(driver.findElement(By.xpath("//a[text()='flight']")).isDisplayed());

        //Verify page title: Find a Flight: Mercury Tours:
        logger.info("Verify page title: Find a Flight: Mercury Tours:");
        assertTrue(driver.findElement(By.xpath("//img[@alt=\"Mercury Tours\"]")).isDisplayed());

        //Verify that Sub heading Flight Details is present
        logger.info("Verify that Sub heading Flight Details is present");
assertTrue(driver.findElement(By.xpath("//font(contains[text(),'Details')] ")).isDisplayed());

        //Verify Type Round Trip, One Way radio exists
        logger.info("Verify Type Round Trip, One Way radio exists");
        assertTrue(driver.findElement(By.xpath("//input[@value='roundtrip']")).isDisplayed());
assertTrue(driver.findElement(By.xpath("//input[@value=\"oneway\"]")).isDisplayed());
        //Verify Passengers, Departing From, On, Arriving In, Returning drop downs exists
        logger.info("Verify Passengers, Departing From, On, Arriving In, Returning drop downs exists");
      assertTrue(driver.findElement(By.xpath("//select[@name='passCount']")).isDisplayed());

      //Verify that Sub heading Preferences is present
        logger.info("Verify that Sub heading Preferences is present");


        //Verify Service Class radios exists
        logger.info("Verify Service Class radios exists");


        //Verify Airline drop down exists
        logger.info("Verify Airline drop down exists");


        //Verify Continue exists
        logger.info("Verify Continue exists");


        //Select Type = One Way
logger.info("//input[@name='tripType'and@value='oneway']");
driver.findElement(By.xpath("//input[@name='tripType'and@value='oneway']")).click();
        //Select Passengers = 4
logger.info("Select Passengers = 4");
 new Select (driver.findElement(By.xpath("//selecT(@name='passCount')]")))
         .selectByVisibleText("4");

        //Select Departing From = New York

        //Select On = December, 15

        //Select Arriving In = Paris

        //Select Service Class = First class

        // Click Continue


    }//method ends
}//class ends
