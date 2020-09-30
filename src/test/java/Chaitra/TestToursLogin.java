package Chaitra;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestToursLogin extends global {//class begins

@Test
public void testToursLogin(){ //method begins


    //Step 1 Go to http://demo.guru99.com/V1/index.php

    driver.get("http://demo.guru99.com/V1/index.php");

    //STEP 2 Assert page title:  GTPL Bank Home Page

    assertEquals("GTPL Bank Home Page",driver.getTitle());

    //STEP 3	Click on "New Tours" link on the header bar

    assertTrue(driver.findElement(By.linkText("New Tours")).isDisplayed());
    driver.findElement(By.linkText("New Tours")).click();

    //STEP 4  Assert page title : Welcome: Mercury Tours

    assertEquals("Welcome: Mercury Tours",driver.getTitle());


   //STEP 5  Verify User Name and Password fields and Sign-in button exist

    assertTrue(driver.findElement(By.linkText("SIGN-ON")).isDisplayed());
    assertTrue(driver.findElement(By.name("userName")).isDisplayed());
    assertTrue(driver.findElement(By.name("password")).isDisplayed());

    //Step 6	Click on Sign-on

    driver.findElement(By.linkText("SIGN-ON")).click();


    //Step 7	Enter asquared in user name field

    driver.findElement(By.name("userName")).sendKeys("asquared");

    //Step 8	Enter asquared in password field

    driver.findElement(By.name("password")).sendKeys("asquared");
    driver.findElement(By.name("submit")).click();


    // STEP 9  Assert page title is Find a Flight: Mercury Tours:

    assertEquals("Login: Mercury Tours",driver.getTitle());

    //Step 10  Click on SIGN-OFF
    driver.findElement(By.linkText("SIGN-OFF")).click();


        }//method ends
}//class ends
