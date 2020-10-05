package suites;

import asquared.TestFlightsSearch;
import asquared.TestLogin;
import asquared.TestRegistration;
import asquared.TestVerifyLinks;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
/**
 * This is a Suite file to execute multiple test classes at once.
 */
@Suite.SuiteClasses({
        TestVerifyLinks.class,
        TestRegistration.class,
        TestLogin.class,
        TestFlightsSearch.class
})
public class asquaredSuite {
}
