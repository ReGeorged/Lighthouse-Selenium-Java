package dev.regeorged.utils.cli;

import org.slf4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CliUtils {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CliUtils.class);

    private CliUtils() {
    }

    public static String executeCommand(String command, boolean waitForExit) throws IOException, InterruptedException {
        log.info("Executing command: {}", command);
        ProcessBuilder processBuilder = new ProcessBuilder();
        // Check if the operating system is Windows or Unix-based
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            processBuilder.command("cmd.exe", "/c", command);
        } else {
            processBuilder.command("sh", "-c", command);
        }

        try {
            // Start the process and redirect error stream to standard output stream
            Process process = processBuilder.redirectErrorStream(true).start();

            // Read the output of the process
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            String reportPath = null;

            while ((line = reader.readLine()) != null) {
                log.trace(line);
            }

            if (waitForExit) {
                int exitCode = process.waitFor();
                log.debug("Exited with error code : {}", exitCode);
            }

            return reportPath;

        } catch (IOException | InterruptedException e) {
            log.error("Failed to execute command: {}", command, e.getCause());
            throw new RuntimeException("Failed to execute command: " + command);
        }
    }

    public static String executeCommandWithPatternMatch(String command, String pattern, boolean waitForExit) throws IOException, InterruptedException {
        log.info("Executing command: {}", command);
        ProcessBuilder processBuilder = new ProcessBuilder();
        // Check if the operating system is Windows or Unix-based
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            processBuilder.command("cmd.exe", "/c", command);
        } else {
            processBuilder.command("sh", "-c", command);
        }

        try {
            // Start the process and redirect error stream to standard output stream
            Process process = processBuilder.redirectErrorStream(true).start();

            // Read the output of the process
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            Pattern p = Pattern.compile(pattern);
            String reportPath = null;

            while ((line = reader.readLine()) != null) {
                // Print the line to the console
                log.trace(line);

                // Check if the line matches the pattern
                Matcher matcher = p.matcher(line);
                if (matcher.matches()) {
                    reportPath = matcher.group(1);
                    log.debug("Report path: {}", reportPath);
                }

            }

            if (waitForExit) {
                int exitCode = process.waitFor();
                log.debug("Exited with error code : {}", exitCode);
            }

            return reportPath;

        } catch (IOException | InterruptedException e) {
            log.error("Failed to execute command: {}", command, e.getCause());
            throw new RuntimeException("Failed to execute command: " + command);
        }
    }


}
