package dev.regeorged.lighthouse.services;

import dev.regeorged.lighthouse.reports.LighthouseReport;
import dev.regeorged.lighthouse.reports.model.generated.Report;
import dev.regeorged.lighthouse.reports.model.parser.json.LighthouseReportParser;
import dev.regeorged.utils.cli.LightHouseCli;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LighthouseService {

    private static List<Path> lighthouseReportPaths = Collections.synchronizedList(new ArrayList<>());


    public static LighthouseReport runLightHouse(WebDriver driver, int debuggerPort) {
        try {
            LightHouseCli.checkNodeIsInstalled();
            LightHouseCli.checkLighthouseIsInstalled();
            Path reportPath = LightHouseCli.runLightHouse(driver.getCurrentUrl(), debuggerPort);
            lighthouseReportPaths.add(reportPath);
            Report lighthouseReport = LighthouseReportParser.parseLastLighthouseReport(reportPath);
            return new LighthouseReport(lighthouseReport);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to run lighthouse analysis", e);
        }
    }

    public static LighthouseReport runLightHouse(WebDriver driver, int debuggerPort, String customArguments) {
        try {
            Path reportPath = LightHouseCli.runLightHouse(driver.getCurrentUrl(), debuggerPort, customArguments);
            lighthouseReportPaths.add(reportPath);
            Report lighthouseReport = LighthouseReportParser.parseLastLighthouseReport(reportPath);
            return new LighthouseReport(lighthouseReport);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to run lighthouse analysis", e);
        }

    }

    public static void cleanupReports() {
        synchronized (lighthouseReportPaths) {
            lighthouseReportPaths.forEach(reportPath -> {
                try {
                    Files.deleteIfExists(reportPath);
                    Files.deleteIfExists(Path.of(reportPath.toString().replace(".json", ".html")));
                    Files.deleteIfExists(Path.of(reportPath.toString().replace(".json", ".csv")));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            lighthouseReportPaths.clear();
        }
    }

}
