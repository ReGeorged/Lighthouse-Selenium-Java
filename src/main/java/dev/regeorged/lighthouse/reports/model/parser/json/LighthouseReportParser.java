package dev.regeorged.lighthouse.reports.model.parser.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.regeorged.lighthouse.reports.model.generated.Report;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LighthouseReportParser {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static List<Report> parseLighthouseReports(String directoryPath) throws IOException {
        Path dirPath = Paths.get(directoryPath);
        try (Stream<Path> paths = Files.walk(dirPath)) {
            return paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.getFileName().toString().endsWith("report.json"))
                    .map(path -> {
                        try {
                            // Use TypeReference to specify the generic type
                            return objectMapper.readValue(Files.readAllBytes(path), Report.class);
                        } catch (IOException e) {
                            throw new RuntimeException("Failed to read file: " + path, e);
                        }
                    })
                    .collect(Collectors.toList());
        }
    }
}
