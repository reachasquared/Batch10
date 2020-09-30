package YESHA;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestToursLogin extends global {//class begins
    @Test
    public void testToursLogin(){//method begins

       //Step 1 http://demo.guru99.com/V1/index.php
        driver.get(" http://demo.guru99.com/V1/index.php");

       //Step 2 Assert page title:  GTPL Bank Home Page
        assertEquals("GTPL Bank Home Page",driver.getTitle());

        //Step 3   Click on "New Tours" link on the header bar
        assertTrue(driver.findElement(By.linkText("New Tours")).isDisplayed());
        driver.findElement(By.linkText("New Tours")).click();


        //Step 4 Assert page title : Welcome: Mercury Tours
        assertEquals( "Welcome: Mercury Tours",driver.getTitle());
        driver.findElement(By.linkText("New Tours")).click();

        //Step 5Verify User Name and Password fields and Sign-in button exist
        assertTrue(driver.findElement(By.name("userName")).isDisplayed());
        assertTrue(driver.findElement(By.name("password")).isDisplayed());
        assertTrue(driver.findElement(By.linkText("SIGN-ON")).isDisplayed());

       //Step 6	Enter asquared in user name field
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("asquared");

       //Step 7	Enter asquared in password field
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("asquared");

        //Step 8	Click on Submit
         driver.findElement(By.name("submit")).click();

        //Assert page title is Find a Login: Mercury Tours:
        driver.findElement(By.name("Login")).isDisplayed();


        //Step 9 Click on SIGN-OFF
        driver.findElement(By.linkText("SIGN-OFF")).click();


    }//method ends

}//class ends
