package keerthi;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BeforeAfter {//class beforeAfter begins
    public WebDriver driver;

    @Before
    public void setUp(){//method setUp begins
        driver = AsquaredWebDriverFactory.getDriver("chrome");

    }//method setUp ends
    @After
    public void tearDown() throws Exception {
        driver.quit();//quit the browser//

    }



}//class beforeAfter ends
