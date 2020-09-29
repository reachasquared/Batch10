package Dharti;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestToursLogin extends global {//class begin

@Test
public void testToursLogin(){//method begin
//Step 1	Go to http://demo.guru99.com/V1/index.php
driver.get("http://demo.guru99.com/V1/index.php");
     //Assert page title:  GTPL Bank Home Page
assertEquals("GTPL Bank Home Page",driver.getTitle());
     //Step 1	Click on "New Tours" link on the header bar
driver.findElement(By.linkText("New Tours")).click();
     //Assert page title : Welcome: Mercury Tours
assertEquals("Welcome: Mercury Tours",driver.getTitle());
     //Verify User Name and Password fields and Submit button exist
     assertTrue(driver.findElement(By.name("userName")).isDisplayed());
     assertTrue(driver.findElement(By.name("password")).isDisplayed());
     assertTrue(driver.findElement(By.name("submit")).isDisplayed());
     //Step 2	Enter asquared in user name field
driver.findElement(By.name("userName")).clear();
driver.findElement(By.name("userName")).sendKeys("asquared");
     //Step 3	Enter asquared in password field
     driver.findElement(By.name("password")).clear();
     driver.findElement(By.name("password")).sendKeys("asquared");
     //Step 4	Click on Submit
     driver.findElement(By.name("submit")).click();
     //Assert page title is Find a Login: Mercury Tours:
assertEquals("Login: Mercury Tours",driver.getTitle());
//Step 5 Click on SIGN-OFF
     driver.findElement(By.linkText("SIGN-OFF")).click();


     }//method ends



}// class ends
