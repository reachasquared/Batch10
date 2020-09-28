package Chaitra;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BeforeAfter {//class begins

    public WebDriver driver;

    @Before
    public void setUp(){//setUp  method starts
        driver = AsquaredWebDriverFactory.getDriver("chrome");

    }//setUp ends

    @After
    public void tearDown() throws Exception {
        driver.quit();

    }
}//class ends
