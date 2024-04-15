import dev.regeorged.lighthouse.services.LighthouseService;
import dev.regeorged.utils.drivers.ChromeDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected WebDriver driver;
    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-address=0.0.0.0", "--remote-debugging-port=9333");
        driver = ChromeDriverSingleton.getDriver(options);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
        LighthouseService.cleanupReports();
    }

}
