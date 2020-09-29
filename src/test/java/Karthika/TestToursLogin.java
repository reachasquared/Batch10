package Karthika;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestToursLogin extends global {//class begins
    @Test
    public void TestToursLogin(){//method begins

//Step 0	Go to http://demo.guru99.com/V1/index.php

        driver.get("http://demo.guru99.com/V1/index.php");


//Step 1	Go to http://newtours.demoaut.com
    driver.get("http://newtours.demoaut.com");

//Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours",driver.getTitle());
        driver.findElement(By.linkText("New Tours")).click();

  //Verify User Name and Password fields and Sign-in button exist
assertTrue(driver.findElement(By.name("btn sing-in")).isDisplayed());
//Step 2	Enter asquared in user name field
driver.findElement(By.name("asquared")).click();
//Step 3	Enter asquared in password field
driver.findElement(By.name("aquared")).click();
//Step 4	Click on Sign-in
driver.findElement(By.name("BTN sing-in")).click();
//Assert page title is Find a Flight: Mercury Tours:
assertEquals("Flight: Mercury Tours",driver.getTitle());
//Step 5 Click on SIGN-OFF
driver.findElement(By.name("BTN Sing-off")).click();


    }//method ends


}//class ends
