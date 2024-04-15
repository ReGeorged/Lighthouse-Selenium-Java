package dev.regeorged.utils.cli;

import java.io.IOException;
import java.nio.file.Path;

import static dev.regeorged.utils.cli.CliUtils.executeCommand;
import static dev.regeorged.utils.cli.CliUtils.executeCommandWithPatternMatch;

public class LightHouseCli {

    public static void checkNodeIsInstalled() {
        try {
            executeCommand("node -v", true);
        } catch (RuntimeException e) {
            throw new RuntimeException("Node.js is not installed. Please install Node.js and try again.");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void checkLighthouseIsInstalled() {
        try {
            executeCommand("lighthouse --version", true);
        } catch (RuntimeException e) {
            throw new RuntimeException("Lighthouse is not installed. Please install Lighthouse and try again.");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Path runLightHouse(String url, int debuggerPort) throws IOException, InterruptedException {
        return Path.of(executeCommandWithPatternMatch(String.format("lighthouse %s  --output=json,html,csv --port=%s", url, debuggerPort), ".*json output written to (.*\\.json).*", true));
    }

    public static Path runLightHouse(String url, int debuggerPort, String customArguments) throws IOException, InterruptedException {
        return Path.of(executeCommandWithPatternMatch(String.format("lighthouse %s  --output=json,html,csv --port=%s %s", url, debuggerPort, customArguments), ".*json output written to (.*\\.json).*", true));

    }


}
