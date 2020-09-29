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

//Assert page title : Welcome: Mercury Tours
        assertEquals( "Welcome: Mercury Tours",driver.getTitle());
        driver.findElement(By.linkText("New Tours")).click();
//Verify User Name and Password fields and Sign-in button exist
        assertTrue(driver.findElement(By.name("userName")).isDisplayed());
        assertTrue(driver.findElement(By.name("password")).isDisplayed());
        assertTrue(driver.findElement(By.name("SIGN-ON")).isDisplayed());

//Step 2	Enter asquared in user name field
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("asquared");
//Step 3	Enter asquared in password field
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("asquared");

//Step 4	Click on Sign-in






//Assert page title is Find a Flight: Mercury Tours:

//Step 5 Click on SIGN-OFF


    }//method ends

}//class ends
