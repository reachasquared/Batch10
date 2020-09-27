package asquared;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BeforeAfter{//class begins
    public WebDriver driver;

    @Before
    public void setUp() { driver = AsquaredWebDriverFactory.getDriver("chrome");}//setUpends
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

 }//class ends
