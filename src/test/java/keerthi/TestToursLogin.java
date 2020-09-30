package keerthi;

import core.engine.global;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestToursLogin extends global {//class begins
@Test
public void testToursLogin(){//method begins
//Step 1	Go to http://demo.guru99.com/V1/index.php
driver.get("http://demo.guru99.com/V1/index.php");
    //Assert page title:  GTPL Bank Home Page
    assertEquals("GTPL Bank Home Page",driver.getTitle());

    assertTrue(driver.findElement(By.linkText("New Tours")).isDisplayed());
    driver.findElement(By.linkText("New Tours")).click();

//Assert page title : Welcome: Mercury Tours
    assertEquals("Welcome: Mercury Tours",driver.getTitle());

//Verify User Name and Password fields and Sign-in button exist
    assertTrue(driver.findElement(By.name("userName")).isDisplayed());
    assertTrue(driver.findElement(By.name("password")).isDisplayed());
    assertTrue(driver.findElement(By.name("submit")).isDisplayed());

//Step 2	Enter asquared in user name field
driver.findElement(By.name("userName")).sendKeys("asquared");

//Step 3	Enter asquared in password field
driver.findElement(By.name("password")).sendKeys("asquared");

//Step 4	Click on Sign-in
driver.findElement(By.name("submit")).click();

//Assert page title is Find a Flight: Mercury Tours:


    assertEquals("Login:Mercury Tours",driver.getTitle());

//Step 5 Click on SIGN-OFF
    driver.findElement(By.linkText("SIGN-OFF")).click();
  //assertEquals("login: Mercury Tours",driver.getTitle());


}//method ends
}//class ends
