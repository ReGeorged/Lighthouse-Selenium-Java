import dev.regeorged.lighthouse.services.LighthouseService;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LighthouseReportTest extends TestBase {
    @Test
    void checkGoogle() {
        driver.navigate().to("https://google.com");
    }

    @Test(priority = 99)
    void lighthouseExtension() {
        dev.regeorged.lighthouse.reports.LighthouseReport lighthouseReport = LighthouseService.runLightHouse(driver, 9333);
        assertThat(lighthouseReport.getPerformanceScore()).isGreaterThan(1);
        assertThat(lighthouseReport.getAccessibilityScore()).isGreaterThan(0.5);
    }
}
