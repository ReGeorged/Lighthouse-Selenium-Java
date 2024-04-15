package dev.regeorged;

import dev.regeorged.lighthouse.reports.LighthouseResults;
import dev.regeorged.lighthouse.reports.model.generated.Report;
import dev.regeorged.lighthouse.reports.model.parser.json.LighthouseReportParser;
import dev.regeorged.lighthouse.services.LighthouseService;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws Exception {
//        checkThatPortIsFree("localhost", 9333);
//        checkNodeIsInstalled();
//        checkLighthouseIsInstalled();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-address=0.0.0.0", "--remote-debugging-port=9333");

        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://google.com");
        String driverUrl = driver.getCurrentUrl();
        driver.manage().window().maximize();
//        System.out.println("starting lighthouse report generation");
//         System.out.println(
//                "Lighthouse report generated successfully. Check the report in the current directory."
//        );
//
//        List<Report> reports = LighthouseReportParser.parseLighthouseReports(".");
//        LighthouseResults lighthouseResults = new LighthouseResults(reports.get(0));
//        System.out.println(lighthouseResults.getAccessibilityScore() + "is acc score");
//        driver.quit();
        LighthouseService lighthouseService = new LighthouseService();
        String reportPath = lighthouseService.runLighthouseReportWithPattern(driver, 9333);
        System.out.println(reportPath + "is report path");
        Report lighthouseReport = LighthouseReportParser.parseLastLighthouseReport(reportPath);
        LighthouseResults lighthouseResults = new LighthouseResults(lighthouseReport);
        System.out.println(lighthouseResults.getSpeedIndex().getScore() + "is speed index");
    }



}