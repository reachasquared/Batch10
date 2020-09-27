package asquared;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestRegistration extends BeforeAfter{ //class begins
    @Test
    public void testRegistration(){ //test methods begins

        //Step 0	Go to http://demo.guru99.com/V1/index.php

        //Assert page title:  GTPL Bank Home Page

        //Step 1	Click on "New Tours" link on the header bar

        //Assert page title : Welcome: Mercury Tours

        //Verify REGISTER link is present

        //Click on REGISTER link

        //Assert page title : Register: Mercury Tours

        //Enter asquared in First Name

        //Enter asquared in Last Name

        //Enter 9049049044 in Phone

        //Select UNITED KINGDOM from Country

        //Click Submit

        //Verify "Dear asquare asquared," text is displayed

        //verify Sign-off link exists

        // Verify REGISTER image is displayed

        //click SIGN-OFF


    } // test method ends
}//class ends
