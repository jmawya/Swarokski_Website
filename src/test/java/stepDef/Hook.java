package stepDef;

import Base.config;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends config {
    public static String browserType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest() {
        if (Strings.isNullOrEmpty(browserType)) {
            browserType = "Chrome";
        }
        if (Strings.isNullOrEmpty(envType)) {
            envType = "QA";
        }

        driver = setupBrowser(browserType);
        if (envType.equalsIgnoreCase("qa")) {
            driver.get("https://www.swarovski.com/en-US/");
        } else {
            System.out.println("invalid envType:" + envType);
        }

    }

  /*@After
    public void afterEachScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }
        driver.close();
        driver.quit();
    }*/
}