package RP;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BeforeAfter {//class begins
    public WebDriver driver;

    @Before
    public void setUp(){//setUp method begins
        driver = AsquaredWebDriverFactory.getDriver("chrome");
    }//setUp method ends

    @After//associated with Junit association
    public void tearDown(){//tearDown method starts
        driver.quit();
    }//tearDown method ends

}//class ends
