package asquared;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class TestToursLoginXPath extends global { //class begins
    @Test
    public void testToursLoginXPath(){ // method begins
        //Step 1	Go to http://demo.guru99.com/V1/index.php
        //driver.get("http://demo.guru99.com/V1/index.php");
        logger.info("Step 1\tGo to " + baseUrl);
        driver.get(baseUrl);

        //Assert page title:  GTPL Bank Home Page

        //Step 2	Click on "New Tours" link on the header bar

        //Assert page title : Welcome: Mercury Tours

        //Verify User Name and Password fields and Submit button exist
        assertTrue(driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed());

        //Step 3	Enter asquared in user name field

        //Step 4	Enter asquared in password field

        //Step 5	Click on Submit

        //Assert page title is Find a Login: Mercury Tours:

        //Step 6 Click on SIGN-OFF

    } //method ends
}//class ends
