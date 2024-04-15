package dev.regeorged.lighthouse.services;

import org.openqa.selenium.WebDriver;

import static dev.regeorged.utils.cmd.CmdUtils.executeCommand;
import static dev.regeorged.utils.cmd.CmdUtils.executeCommandWithPatternMatch;

public class LighthouseService {

    public void runLighthouseReport(WebDriver driver, int debuggerPort) {
        executeCommand(String.format("lighthouse %s  --output=json,html,csv --port=%s", driver.getCurrentUrl(), debuggerPort), true);
    }
    public void runLighthouseReport(WebDriver driver, int debuggerPort, String customArguments) {
        executeCommand(String.format("lighthouse %s  --output=json,html,csv --port=%s %s ", driver.getCurrentUrl(), debuggerPort, customArguments), true);
    }
    public String runLighthouseReportWithPattern(WebDriver driver, int debuggerPort, String customArguments) {
        return executeCommandWithPatternMatch(String.format("lighthouse %s  --output=json,html,csv --port=%s %s ", driver.getCurrentUrl(), debuggerPort, customArguments), ".*LH:Printer json output written to (.*\\.json).*",true);
    }
    public String runLighthouseReportWithPattern(WebDriver driver, int debuggerPort) {
        return executeCommandWithPatternMatch(String.format("lighthouse %s  --output=json,html,csv --port=%s", driver.getCurrentUrl(), debuggerPort), ".*json output written to (.*\\.json).*",true);
    }
}
