package Karthika;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BeforeAfter {//class begins
    private WebDriver driver;
    @Before
    public void setup() {//setup method
        driver= AsquaredWebDriverFactory.getDriver("chrome");

    }//setup ends
    @After
    public void tearDown() {
        driver.quit();
    }
    }//class ends
