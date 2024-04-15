# Lighthouse report generation with selenium in Java

## To get started you will need
- two minutes of your time
- Java 11 or higher
- Nodejs
- lighthouse installed globally
```shell
npm install -g lighthouse
```
## To run the light house report add debugger port to chrome capabilities and pass in your driver instance
#### options.addArguments("--remote-debugging-address=0.0.0.0", "--remote-debugging-port=9333");

```java
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

```
### this means that all the cookies and session data will be transferred to the lighthouse report
```java
import dev.regeorged.lighthouse.services.LighthouseService;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LighthouseReportTest extends TestBase {
    @Test
    void goToSomePage() {
        driver.navigate().to("https://yourPageHere.dev");
    }
    
    @Test(priority = 99)
    void lighthouseExtension() {
        LighthouseReport lighthouseReport = LighthouseService.runLightHouse(driver, 9333);
        assertThat(lighthouseReport.getPerformanceScore()).isGreaterThan(1);
        assertThat(lighthouseReport.getAccessibilityScore()).isGreaterThan(0.5);
    }
}
```

## thats all, enjoy easy performance and accessibility testing in your existing test suite !
