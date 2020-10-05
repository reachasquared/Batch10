package asquared;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestFlightsSearch extends global { //class begins
    @Test
    public void testFlightsSearch(){ //method begins
        //Step 1	Go to http://demo.guru99.com/V1/index.php
        logger.info("Step 1  Go to http://demo.guru99.com/V1/index.php");
        driver.get(baseUrl);

        //Assert page title:  GTPL Bank Home Page
        logger.info("Assert page title:  GTPL Bank Home Page");
        assertEquals("GTPL Bank Home Page", driver.getTitle());

        //Step 1	Verify & Click on "New Tours" link on the header bar
        logger.info("Step 1\tVerify & Click on \"New Tours\" link on the header bar");
        driver.findElement(By.xpath("//a[text()='New Tours']")).click();

        //Assert page title : Welcome: Mercury Tours

        //Verify Flights link exists
        assertTrue(driver.findElement(By.xpath("//a[text()='Flights']")).isDisplayed());

        //Click on Flights link
        driver.findElement(By.xpath("//a[text()='Flights']")).click();

        //Verify page title: Find a Flight: Mercury Tours:

        //Verify that Sub heading Flight Details is present

        //Verify Type Round Trip, One Way radio exists
        assertTrue(driver.findElement(By.xpath("//input[@value='roundtrip']")).isDisplayed());

        //Verify Passengers, Departing From, On, Arriving In, Returning drop downs exists

        //Verify that Sub heading Preferences is present

        //Verify Service Class radios exists

        //Verify Airline drop down exists

        //Verify Continue exists

        //Select Type = One Way

        //Select Passengers = 4

        //Select Departing From = New York

        //Select On = December, 15

        //Select Arriving In = Paris

        //Select Service Class = First class

        // Click Continue

    }//method ends
}//class ends
