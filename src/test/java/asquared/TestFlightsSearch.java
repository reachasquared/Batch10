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
        logger.info("Step 1: Go to http://demo.guru99.com/V1/index.php");
        driver.get(baseUrl);

        //Assert page title:  GTPL Bank Home Page
        logger.info("Step 1: Assert page title:  GTPL Bank Home Page");
        assertEquals("GTPL Bank Home Page", driver.getTitle());

        //Step 2	Verify & Click on "New Tours" link on the header bar
        logger.info("Step 2: Verify & Click on \"New Tours\" link on the header bar");
        driver.findElement(By.xpath("//a[text()='New Tours']")).click();

        //Step 2: Assert page title : Welcome: Mercury Tours

        //Step 3: Verify Flights link exists
        assertTrue(driver.findElement(By.xpath("//a[text()='Flights']")).isDisplayed());

        //Step 4: Click on Flights link
        driver.findElement(By.xpath("//a[text()='Flights']")).click();

        //Step 5: Verify page title: Find a Flight: Mercury Tours:

        //Step 6: Verify that Sub heading Flight Details is present

        //Step 7: Verify Type Round Trip, One Way radio exists
        assertTrue(driver.findElement(By.xpath("//input[@value='roundtrip']")).isDisplayed());

        //Step 8: Verify Passengers, Departing From, On, Arriving In, Returning drop downs exists

        //Step 9: Verify that Sub heading Preferences is present

        //Step 10: Verify Service Class radios exists

        //Step 11: Verify Airline drop down exists

        //Step 12: Verify Continue exists

        //Step 13: Select Type = One Way

        //Step 14: Select Passengers = 4

        //Step 15: Select Departing From = New York

        //Step 16: Select On = December, 15

        //Step 17: Select Arriving In = Paris

        //Step 18: Select Service Class = First class

        //Step 19: Click Continue

    }//method ends
}//class ends
