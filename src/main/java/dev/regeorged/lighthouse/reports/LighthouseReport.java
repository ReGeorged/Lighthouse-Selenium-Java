package dev.regeorged.lighthouse.reports;

import dev.regeorged.lighthouse.reports.model.generated.*;


public class LighthouseReport {

    private Double performanceScore;
    private Double accessibilityScore;
    private Double bestPracticesScore;
    private Double seoScore;
    private Double pwaScore;
    private FirstMeaningfulPaint firstMeaningfulPaint;
    private FirstContentfulPaint firstContentfulPaint;
    private SpeedIndex speedIndex;
    private LargestContentfulPaint largestContentfulPaint;
    private Interactive interactive;
    private TotalBlockingTime totalBlockingTime;
    private CumulativeLayoutShift cumulativeLayoutShift;
    private Redirects redirects;
    private ServerResponseTime serverResponseTime;
    private BootupTime bootupTime;


    public LighthouseReport(Report lighthouseReport) {
        this.performanceScore = (Double) lighthouseReport.getCategories().getPerformance().getScore();
        this.accessibilityScore = (Double) lighthouseReport.getCategories().getAccessibility().getScore();
        this.bestPracticesScore = (Double) lighthouseReport.getCategories().getBestPractices().getScore();
        this.seoScore = (Double) lighthouseReport.getCategories().getSeo().getScore();
        this.pwaScore = (Double) lighthouseReport.getCategories().getPwa().getScore();
        this.firstMeaningfulPaint = lighthouseReport.getAudits().getFirstMeaningfulPaint();
        this.firstContentfulPaint = lighthouseReport.getAudits().getFirstContentfulPaint();
        this.speedIndex = lighthouseReport.getAudits().getSpeedIndex();
        this.largestContentfulPaint = lighthouseReport.getAudits().getLargestContentfulPaint();
        this.interactive = lighthouseReport.getAudits().getInteractive();
        this.totalBlockingTime = lighthouseReport.getAudits().getTotalBlockingTime();
        this.cumulativeLayoutShift = lighthouseReport.getAudits().getCumulativeLayoutShift();
        this.redirects = lighthouseReport.getAudits().getRedirects();
        this.serverResponseTime = lighthouseReport.getAudits().getServerResponseTime();
        this.bootupTime = lighthouseReport.getAudits().getBootupTime();
    }

    public Double getPerformanceScore() {
        return this.performanceScore;
    }

    public Double getAccessibilityScore() {
        return this.accessibilityScore;
    }

    public Double getBestPracticesScore() {
        return this.bestPracticesScore;
    }

    public Double getSeoScore() {
        return this.seoScore;
    }

    public Double getPwaScore() {
        return this.pwaScore;
    }

    public FirstMeaningfulPaint getFirstMeaningfulPaint() {
        return this.firstMeaningfulPaint;
    }

    public FirstContentfulPaint getFirstContentfulPaint() {
        return this.firstContentfulPaint;
    }

    public SpeedIndex getSpeedIndex() {
        return this.speedIndex;
    }

    public LargestContentfulPaint getLargestContentfulPaint() {
        return this.largestContentfulPaint;
    }

    public Interactive getInteractive() {
        return this.interactive;
    }

    public TotalBlockingTime getTotalBlockingTime() {
        return this.totalBlockingTime;
    }

    public CumulativeLayoutShift getCumulativeLayoutShift() {
        return this.cumulativeLayoutShift;
    }

    public Redirects getRedirects() {
        return this.redirects;
    }

    public ServerResponseTime getServerResponseTime() {
        return this.serverResponseTime;
    }

    public BootupTime getBootupTime() {
        return this.bootupTime;
    }

    public void setPerformanceScore(Double performanceScore) {
        this.performanceScore = performanceScore;
    }

    public void setAccessibilityScore(Double accessibilityScore) {
        this.accessibilityScore = accessibilityScore;
    }

    public void setBestPracticesScore(Double bestPracticesScore) {
        this.bestPracticesScore = bestPracticesScore;
    }

    public void setSeoScore(Double seoScore) {
        this.seoScore = seoScore;
    }

    public void setPwaScore(Double pwaScore) {
        this.pwaScore = pwaScore;
    }

    public void setFirstMeaningfulPaint(FirstMeaningfulPaint firstMeaningfulPaint) {
        this.firstMeaningfulPaint = firstMeaningfulPaint;
    }

    public void setFirstContentfulPaint(FirstContentfulPaint firstContentfulPaint) {
        this.firstContentfulPaint = firstContentfulPaint;
    }

    public void setSpeedIndex(SpeedIndex speedIndex) {
        this.speedIndex = speedIndex;
    }

    public void setLargestContentfulPaint(LargestContentfulPaint largestContentfulPaint) {
        this.largestContentfulPaint = largestContentfulPaint;
    }

    public void setInteractive(Interactive interactive) {
        this.interactive = interactive;
    }

    public void setTotalBlockingTime(TotalBlockingTime totalBlockingTime) {
        this.totalBlockingTime = totalBlockingTime;
    }

    public void setCumulativeLayoutShift(CumulativeLayoutShift cumulativeLayoutShift) {
        this.cumulativeLayoutShift = cumulativeLayoutShift;
    }

    public void setRedirects(Redirects redirects) {
        this.redirects = redirects;
    }

    public void setServerResponseTime(ServerResponseTime serverResponseTime) {
        this.serverResponseTime = serverResponseTime;
    }

    public void setBootupTime(BootupTime bootupTime) {
        this.bootupTime = bootupTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LighthouseReport)) return false;
        final LighthouseReport other = (LighthouseReport) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$performanceScore = this.getPerformanceScore();
        final Object other$performanceScore = other.getPerformanceScore();
        if (this$performanceScore == null ? other$performanceScore != null : !this$performanceScore.equals(other$performanceScore))
            return false;
        final Object this$accessibilityScore = this.getAccessibilityScore();
        final Object other$accessibilityScore = other.getAccessibilityScore();
        if (this$accessibilityScore == null ? other$accessibilityScore != null : !this$accessibilityScore.equals(other$accessibilityScore))
            return false;
        final Object this$bestPracticesScore = this.getBestPracticesScore();
        final Object other$bestPracticesScore = other.getBestPracticesScore();
        if (this$bestPracticesScore == null ? other$bestPracticesScore != null : !this$bestPracticesScore.equals(other$bestPracticesScore))
            return false;
        final Object this$seoScore = this.getSeoScore();
        final Object other$seoScore = other.getSeoScore();
        if (this$seoScore == null ? other$seoScore != null : !this$seoScore.equals(other$seoScore)) return false;
        final Object this$pwaScore = this.getPwaScore();
        final Object other$pwaScore = other.getPwaScore();
        if (this$pwaScore == null ? other$pwaScore != null : !this$pwaScore.equals(other$pwaScore)) return false;
        final Object this$firstMeaningfulPaint = this.getFirstMeaningfulPaint();
        final Object other$firstMeaningfulPaint = other.getFirstMeaningfulPaint();
        if (this$firstMeaningfulPaint == null ? other$firstMeaningfulPaint != null : !this$firstMeaningfulPaint.equals(other$firstMeaningfulPaint))
            return false;
        final Object this$firstContentfulPaint = this.getFirstContentfulPaint();
        final Object other$firstContentfulPaint = other.getFirstContentfulPaint();
        if (this$firstContentfulPaint == null ? other$firstContentfulPaint != null : !this$firstContentfulPaint.equals(other$firstContentfulPaint))
            return false;
        final Object this$speedIndex = this.getSpeedIndex();
        final Object other$speedIndex = other.getSpeedIndex();
        if (this$speedIndex == null ? other$speedIndex != null : !this$speedIndex.equals(other$speedIndex))
            return false;
        final Object this$largestContentfulPaint = this.getLargestContentfulPaint();
        final Object other$largestContentfulPaint = other.getLargestContentfulPaint();
        if (this$largestContentfulPaint == null ? other$largestContentfulPaint != null : !this$largestContentfulPaint.equals(other$largestContentfulPaint))
            return false;
        final Object this$interactive = this.getInteractive();
        final Object other$interactive = other.getInteractive();
        if (this$interactive == null ? other$interactive != null : !this$interactive.equals(other$interactive))
            return false;
        final Object this$totalBlockingTime = this.getTotalBlockingTime();
        final Object other$totalBlockingTime = other.getTotalBlockingTime();
        if (this$totalBlockingTime == null ? other$totalBlockingTime != null : !this$totalBlockingTime.equals(other$totalBlockingTime))
            return false;
        final Object this$cumulativeLayoutShift = this.getCumulativeLayoutShift();
        final Object other$cumulativeLayoutShift = other.getCumulativeLayoutShift();
        if (this$cumulativeLayoutShift == null ? other$cumulativeLayoutShift != null : !this$cumulativeLayoutShift.equals(other$cumulativeLayoutShift))
            return false;
        final Object this$redirects = this.getRedirects();
        final Object other$redirects = other.getRedirects();
        if (this$redirects == null ? other$redirects != null : !this$redirects.equals(other$redirects)) return false;
        final Object this$serverResponseTime = this.getServerResponseTime();
        final Object other$serverResponseTime = other.getServerResponseTime();
        if (this$serverResponseTime == null ? other$serverResponseTime != null : !this$serverResponseTime.equals(other$serverResponseTime))
            return false;
        final Object this$bootupTime = this.getBootupTime();
        final Object other$bootupTime = other.getBootupTime();
        if (this$bootupTime == null ? other$bootupTime != null : !this$bootupTime.equals(other$bootupTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LighthouseReport;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $performanceScore = this.getPerformanceScore();
        result = result * PRIME + ($performanceScore == null ? 43 : $performanceScore.hashCode());
        final Object $accessibilityScore = this.getAccessibilityScore();
        result = result * PRIME + ($accessibilityScore == null ? 43 : $accessibilityScore.hashCode());
        final Object $bestPracticesScore = this.getBestPracticesScore();
        result = result * PRIME + ($bestPracticesScore == null ? 43 : $bestPracticesScore.hashCode());
        final Object $seoScore = this.getSeoScore();
        result = result * PRIME + ($seoScore == null ? 43 : $seoScore.hashCode());
        final Object $pwaScore = this.getPwaScore();
        result = result * PRIME + ($pwaScore == null ? 43 : $pwaScore.hashCode());
        final Object $firstMeaningfulPaint = this.getFirstMeaningfulPaint();
        result = result * PRIME + ($firstMeaningfulPaint == null ? 43 : $firstMeaningfulPaint.hashCode());
        final Object $firstContentfulPaint = this.getFirstContentfulPaint();
        result = result * PRIME + ($firstContentfulPaint == null ? 43 : $firstContentfulPaint.hashCode());
        final Object $speedIndex = this.getSpeedIndex();
        result = result * PRIME + ($speedIndex == null ? 43 : $speedIndex.hashCode());
        final Object $largestContentfulPaint = this.getLargestContentfulPaint();
        result = result * PRIME + ($largestContentfulPaint == null ? 43 : $largestContentfulPaint.hashCode());
        final Object $interactive = this.getInteractive();
        result = result * PRIME + ($interactive == null ? 43 : $interactive.hashCode());
        final Object $totalBlockingTime = this.getTotalBlockingTime();
        result = result * PRIME + ($totalBlockingTime == null ? 43 : $totalBlockingTime.hashCode());
        final Object $cumulativeLayoutShift = this.getCumulativeLayoutShift();
        result = result * PRIME + ($cumulativeLayoutShift == null ? 43 : $cumulativeLayoutShift.hashCode());
        final Object $redirects = this.getRedirects();
        result = result * PRIME + ($redirects == null ? 43 : $redirects.hashCode());
        final Object $serverResponseTime = this.getServerResponseTime();
        result = result * PRIME + ($serverResponseTime == null ? 43 : $serverResponseTime.hashCode());
        final Object $bootupTime = this.getBootupTime();
        result = result * PRIME + ($bootupTime == null ? 43 : $bootupTime.hashCode());
        return result;
    }

    public String toString() {
        return "LighthouseResults(performanceScore=" + this.getPerformanceScore() + ", accessibilityScore=" + this.getAccessibilityScore() + ", bestPracticesScore=" + this.getBestPracticesScore() + ", seoScore=" + this.getSeoScore() + ", pwaScore=" + this.getPwaScore() + ", firstMeaningfulPaint=" + this.getFirstMeaningfulPaint() + ", firstContentfulPaint=" + this.getFirstContentfulPaint() + ", speedIndex=" + this.getSpeedIndex() + ", largestContentfulPaint=" + this.getLargestContentfulPaint() + ", interactive=" + this.getInteractive() + ", totalBlockingTime=" + this.getTotalBlockingTime() + ", cumulativeLayoutShift=" + this.getCumulativeLayoutShift() + ", redirects=" + this.getRedirects() + ", serverResponseTime=" + this.getServerResponseTime() + ", bootupTime=" + this.getBootupTime() + ")";
    }
}
