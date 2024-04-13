package dev.regeorged;

import dev.regeorged.lighthouse.reports.LighthouseResults;
import dev.regeorged.lighthouse.reports.model.generated.Report;
import dev.regeorged.lighthouse.reports.model.parser.json.LighthouseReportParser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        checkThatPortIsFree("localhost", 9333);
        checkNodeIsInstalled();
        checkLighthouseIsInstalled();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-address=0.0.0.0", "--remote-debugging-port=9333");

        ChromeDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://google.com");
        String driverUrl = driver.getCurrentUrl();
        driver.manage().window().maximize();
        System.out.println("starting lighthouse report generation");
        executeCommand(String.format("lighthouse %s  --output=json,html,csv --port=9333 ", driverUrl), true);
        System.out.println(
                "Lighthouse report generated successfully. Check the report in the current directory."
        );

        List<Report> reports = LighthouseReportParser.parseLighthouseReports(".");
        LighthouseResults lighthouseResults = new LighthouseResults(reports.get(0));
        System.out.println(lighthouseResults.getAccessibilityScore() + "is acc score");
//        driver.quit();

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