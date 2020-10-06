package Karthika;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestToursLoginXpath extends global {// class begins
   @Test

    public void TestToursLoginXpath(){//methods begins
//Step 1	Go to http://demo.guru99.com/V1/index.php
driver.get("http://demo.guru99.com/V1/index.php");
driver.get(baseUrl);
       //Assert page title:  GTPL Bank Home Page
assertEquals("GTPL Bank Home Page", driver.getTitle());
       //Step 2	Click on "New Tours" link on the header bar
       assertTrue(driver.findElement(By.xpath("//a[contains(.,'New Tours')]")).isDisplayed());
       driver.findElement(By.xpath("//a[contains(.,'New Tours')]")).click();
       //Assert page title : Welcome: Mercury Tours
assertEquals( "Welcome: Mercury Tours",driver.getTitle());
       //Verify User Name and Password fields and Submit button exist
       assertTrue(driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed());
       assertTrue(driver.findElement(By.xpath("//input[contains(@type,'password')]")).isDisplayed());
       //Step 3	Enter asquared in user name field
       driver.findElement(By.xpath("//input[(@name='userName')]")).clear();
       driver.findElement(By.xpath("//input[(@name='userName')]")).sendKeys("asquared");
       //Step 4	Enter asquared in password field
       driver.findElement(By.xpath("//input[contains(@type,'password')]")).clear();
       driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("asquared");
       //Step 5	Click on Submit
       driver.findElement(By.xpath("//input[@name='submit']")).click();

//Step 6 Click on SIGN-OF
       assertTrue(driver.findElement(By.xpath("//a[contains(.,'SIGN-OFF')]")).isDisplayed());
       driver.findElement(By.xpath("//a[contains(.,'SIGN-OFF')]")).click();
   }//method ends

}//class ends




