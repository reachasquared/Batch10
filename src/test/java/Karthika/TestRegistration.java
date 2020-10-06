package Karthika;

import core.engine.AsquaredWebDriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestRegistration extends BeforeAfter{

    ;//class testbegin
    
  @Test
public void TestRegistration(){//test methods begins


//Step 0	Go to http://demo.guru99.com/V1/index.php

    driver.get("http://demo.guru99.com/V1/index.php");
//Assert page title:  GTPL Bank Home Page
    assertEquals( "GTPL Bank Home Page",driver.getTitle());
//Step 1	Click on "New Tours" link on the header bar
      assertTrue(driver.findElement(By.linkText("New Tours")).isDisplayed());
       driver.findElement(By.linkText("NewTours")).click();

//Assert page title : Welcome: Mercury Tours
    assertEquals("Welcome: Mercury Tours",driver.getTitle());

   // verify REGISTER link is present
   assertTrue(driver.findElement(By.linkText("REGISTER")).isDisplayed());
      //Click on REGISTER link
driver.findElement(By.name("btn register")).click();
//Assert page title : Register: Mercury Tours
assertEquals("Register: Mercury Tours",driver.getTitle());
      //Enter asquared in First Name
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("aquared");

      //Enter asquared in Last Name
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("aquared");

      //Enter 9049049044 in Phone
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("9049049044");

      //Select UNITED KINGDOM from Count
driver.findElement(By.name("COUNTRY")).sendKeys("UNITED KINGDOM");
      //Click Submit
    driver.findElement(By.name("BTN SUBMIT")).click();
      //Verify "Dear asquare asquared," text is displayed
assertTrue(driver.findElement(By.linkText("Dear asquare asquared")).isDisplayed());
      //verify Sign-off link exists
assertTrue(driver.findElement(By.linkText("sing-off")).isDisplayed());
      // Verify REGISTER image is displayed
assertTrue(driver.findElement(By.linkText("REGISTER")).isDisplayed());
      //click SIGN-OFF
    driver.findElement(By.linkText("sing-off")).click();
}//test ends




}//class ends
