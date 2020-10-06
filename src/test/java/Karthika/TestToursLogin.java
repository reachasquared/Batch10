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

        //Assert page title:  GTPL Bank Home Page
        assertEquals("GTPL Bank Home Page",driver.getTitle());
        //Step 1	Click on "New Tours" link on the header bar
        driver.findElement(By.linkText("New Tours")).click();

//Assert page title : Welcome: Mercury Tours
    assertEquals("Welcome: Mercury Tours",driver.getTitle());


  //Verify User Name and Password fields and Sign-in button exist
        assertTrue(driver.findElement(By.name("userName")).isDisplayed());
        assertTrue(driver.findElement(By.name("password")).isDisplayed());
        assertTrue(driver.findElement(By.name("sumbit")).isDisplayed());
//Step 2	Enter asquared in user name field
driver.findElement(By.name("asquared")).clear();
driver.findElement(By.name("userName")).sendKeys("asquared");

//Step 3	Enter asquared in password field
driver.findElement(By.name("aquared")).clear();
driver.findElement(By.name("Password")).sendKeys("asquared");

//Step 4	Click on submit
    driver.findElement(By.name("submit")).click();

//Assert page title is Find a Login: Mercury Tours:
assertEquals("Login: Mercury Tours",driver.getTitle());
//Step 5 Click on SIGN-OFF
driver.findElement(By.linkText(" Sing-off")).click();


    }//method ends


}//class ends
