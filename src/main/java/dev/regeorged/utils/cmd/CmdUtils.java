package dev.regeorged.utils.cmd;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class CmdUtils {
    private CmdUtils() {
    }
    public static void executeCommand(String command, boolean waitForExit) {
        ProcessBuilder processBuilder = new ProcessBuilder();

        // Check if the operating system is Windows or Unix-based
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            processBuilder.command("cmd.exe", "/c", command);
        } else {
            processBuilder.command("sh", "-c", command);
        }

        try {
            processBuilder.inheritIO();
            Process process = processBuilder.start();

            // Redirect error stream to standard output stream
            processBuilder.redirectErrorStream(true);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            if (waitForExit) {
                int exitCode = process.waitFor();
                System.out.println("\nExited with error code : " + exitCode);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to execute command: " + command);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to execute command: " + command);
        }
    }

    public static String executeCommandWithPatternMatch(String command, String pattern, boolean waitForExit) {
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

        } catch (IOException e) {
            log.error("Failed to execute command: {}", command, e.getCause());
            throw new RuntimeException("Failed to execute command: " + command);
        } catch (InterruptedException e) {
            log.error("Failed to execute command: {}", command, e.getCause());
            throw new RuntimeException("Failed to execute command: " + command);
        }
    }


    public static void checkNodeIsInstalled() {
        try {
            executeCommand("node -v", true);
        } catch (RuntimeException e) {
            throw new RuntimeException("Node.js is not installed. Please install Node.js and try again.");
        }
    }

    public static void checkLighthouseIsInstalled() {
        try {
            executeCommand("lighthouse --version", true);
        } catch (RuntimeException e) {
            throw new RuntimeException("Lighthouse is not installed. Please install Lighthouse and try again.");
        }
    }

    public static void checkThatPortIsFree(String host, int port) {
        try {
            Socket socket = new Socket(host, port);
            throw new RuntimeException("Port " + port + " is already in use. Please free the port and try again.");

        } catch (IOException e) {
            System.out.println("Port " + port + " is free. Proceeding with the execution.");
        }
    }

}
