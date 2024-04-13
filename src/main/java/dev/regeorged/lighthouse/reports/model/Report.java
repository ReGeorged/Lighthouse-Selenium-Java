package dev.regeorged.lighthouse.reports.model;

import java.time.LocalDateTime;
import java.util.List;

public class Report {


    private String lighthouseVersion;
    private String requestedUrl;
    private String mainDocumentUrl;
    private String finalDisplayedUrl;
    private String finalUrl;
    private LocalDateTime fetchTime;
    private GatherMode gatherMode;
    private List<String> runWarnings;
    private String userAgent;

}
