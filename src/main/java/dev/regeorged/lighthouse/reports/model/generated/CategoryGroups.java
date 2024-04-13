package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryGroups{

	@JsonProperty("pwa-installable")
	private PwaInstallable pwaInstallable;

	@JsonProperty("a11y-color-contrast")
	private A11yColorContrast a11yColorContrast;

	@JsonProperty("hidden")
	private Hidden hidden;

	@JsonProperty("a11y-aria")
	private A11yAria a11yAria;

	@JsonProperty("seo-content")
	private SeoContent seoContent;

	@JsonProperty("best-practices-trust-safety")
	private BestPracticesTrustSafety bestPracticesTrustSafety;

	@JsonProperty("pwa-optimized")
	private PwaOptimized pwaOptimized;

	@JsonProperty("a11y-best-practices")
	private A11yBestPractices a11yBestPractices;

	@JsonProperty("seo-crawl")
	private SeoCrawl seoCrawl;

	@JsonProperty("load-opportunities")
	private LoadOpportunities loadOpportunities;

	@JsonProperty("a11y-names-labels")
	private A11yNamesLabels a11yNamesLabels;

	@JsonProperty("best-practices-ux")
	private BestPracticesUx bestPracticesUx;

	@JsonProperty("a11y-language")
	private A11yLanguage a11yLanguage;

	@JsonProperty("seo-mobile")
	private SeoMobile seoMobile;

	@JsonProperty("diagnostics")
	private Diagnostics diagnostics;

	@JsonProperty("a11y-navigation")
	private A11yNavigation a11yNavigation;

	@JsonProperty("a11y-audio-video")
	private A11yAudioVideo a11yAudioVideo;

	@JsonProperty("best-practices-browser-compat")
	private BestPracticesBrowserCompat bestPracticesBrowserCompat;

	@JsonProperty("budgets")
	private Budgets budgets;

	@JsonProperty("a11y-tables-lists")
	private A11yTablesLists a11yTablesLists;

	@JsonProperty("metrics")
	private Metrics metrics;

	@JsonProperty("best-practices-general")
	private BestPracticesGeneral bestPracticesGeneral;

	public void setPwaInstallable(PwaInstallable pwaInstallable){
		this.pwaInstallable = pwaInstallable;
	}

	public PwaInstallable getPwaInstallable(){
		return pwaInstallable;
	}

	public void setA11yColorContrast(A11yColorContrast a11yColorContrast){
		this.a11yColorContrast = a11yColorContrast;
	}

	public A11yColorContrast getA11yColorContrast(){
		return a11yColorContrast;
	}

	public void setHidden(Hidden hidden){
		this.hidden = hidden;
	}

	public Hidden getHidden(){
		return hidden;
	}

	public void setA11yAria(A11yAria a11yAria){
		this.a11yAria = a11yAria;
	}

	public A11yAria getA11yAria(){
		return a11yAria;
	}

	public void setSeoContent(SeoContent seoContent){
		this.seoContent = seoContent;
	}

	public SeoContent getSeoContent(){
		return seoContent;
	}

	public void setBestPracticesTrustSafety(BestPracticesTrustSafety bestPracticesTrustSafety){
		this.bestPracticesTrustSafety = bestPracticesTrustSafety;
	}

	public BestPracticesTrustSafety getBestPracticesTrustSafety(){
		return bestPracticesTrustSafety;
	}

	public void setPwaOptimized(PwaOptimized pwaOptimized){
		this.pwaOptimized = pwaOptimized;
	}

	public PwaOptimized getPwaOptimized(){
		return pwaOptimized;
	}

	public void setA11yBestPractices(A11yBestPractices a11yBestPractices){
		this.a11yBestPractices = a11yBestPractices;
	}

	public A11yBestPractices getA11yBestPractices(){
		return a11yBestPractices;
	}

	public void setSeoCrawl(SeoCrawl seoCrawl){
		this.seoCrawl = seoCrawl;
	}

	public SeoCrawl getSeoCrawl(){
		return seoCrawl;
	}

	public void setLoadOpportunities(LoadOpportunities loadOpportunities){
		this.loadOpportunities = loadOpportunities;
	}

	public LoadOpportunities getLoadOpportunities(){
		return loadOpportunities;
	}

	public void setA11yNamesLabels(A11yNamesLabels a11yNamesLabels){
		this.a11yNamesLabels = a11yNamesLabels;
	}

	public A11yNamesLabels getA11yNamesLabels(){
		return a11yNamesLabels;
	}

	public void setBestPracticesUx(BestPracticesUx bestPracticesUx){
		this.bestPracticesUx = bestPracticesUx;
	}

	public BestPracticesUx getBestPracticesUx(){
		return bestPracticesUx;
	}

	public void setA11yLanguage(A11yLanguage a11yLanguage){
		this.a11yLanguage = a11yLanguage;
	}

	public A11yLanguage getA11yLanguage(){
		return a11yLanguage;
	}

	public void setSeoMobile(SeoMobile seoMobile){
		this.seoMobile = seoMobile;
	}

	public SeoMobile getSeoMobile(){
		return seoMobile;
	}

	public void setDiagnostics(Diagnostics diagnostics){
		this.diagnostics = diagnostics;
	}

	public Diagnostics getDiagnostics(){
		return diagnostics;
	}

	public void setA11yNavigation(A11yNavigation a11yNavigation){
		this.a11yNavigation = a11yNavigation;
	}

	public A11yNavigation getA11yNavigation(){
		return a11yNavigation;
	}

	public void setA11yAudioVideo(A11yAudioVideo a11yAudioVideo){
		this.a11yAudioVideo = a11yAudioVideo;
	}

	public A11yAudioVideo getA11yAudioVideo(){
		return a11yAudioVideo;
	}

	public void setBestPracticesBrowserCompat(BestPracticesBrowserCompat bestPracticesBrowserCompat){
		this.bestPracticesBrowserCompat = bestPracticesBrowserCompat;
	}

	public BestPracticesBrowserCompat getBestPracticesBrowserCompat(){
		return bestPracticesBrowserCompat;
	}

	public void setBudgets(Budgets budgets){
		this.budgets = budgets;
	}

	public Budgets getBudgets(){
		return budgets;
	}

	public void setA11yTablesLists(A11yTablesLists a11yTablesLists){
		this.a11yTablesLists = a11yTablesLists;
	}

	public A11yTablesLists getA11yTablesLists(){
		return a11yTablesLists;
	}

	public void setMetrics(Metrics metrics){
		this.metrics = metrics;
	}

	public Metrics getMetrics(){
		return metrics;
	}

	public void setBestPracticesGeneral(BestPracticesGeneral bestPracticesGeneral){
		this.bestPracticesGeneral = bestPracticesGeneral;
	}

	public BestPracticesGeneral getBestPracticesGeneral(){
		return bestPracticesGeneral;
	}

	@Override
 	public String toString(){
		return 
			"CategoryGroups{" + 
			"pwa-installable = '" + pwaInstallable + '\'' + 
			",a11y-color-contrast = '" + a11yColorContrast + '\'' + 
			",hidden = '" + hidden + '\'' + 
			",a11y-aria = '" + a11yAria + '\'' + 
			",seo-content = '" + seoContent + '\'' + 
			",best-practices-trust-safety = '" + bestPracticesTrustSafety + '\'' + 
			",pwa-optimized = '" + pwaOptimized + '\'' + 
			",a11y-best-practices = '" + a11yBestPractices + '\'' + 
			",seo-crawl = '" + seoCrawl + '\'' + 
			",load-opportunities = '" + loadOpportunities + '\'' + 
			",a11y-names-labels = '" + a11yNamesLabels + '\'' + 
			",best-practices-ux = '" + bestPracticesUx + '\'' + 
			",a11y-language = '" + a11yLanguage + '\'' + 
			",seo-mobile = '" + seoMobile + '\'' + 
			",diagnostics = '" + diagnostics + '\'' + 
			",a11y-navigation = '" + a11yNavigation + '\'' + 
			",a11y-audio-video = '" + a11yAudioVideo + '\'' + 
			",best-practices-browser-compat = '" + bestPracticesBrowserCompat + '\'' + 
			",budgets = '" + budgets + '\'' + 
			",a11y-tables-lists = '" + a11yTablesLists + '\'' + 
			",metrics = '" + metrics + '\'' + 
			",best-practices-general = '" + bestPracticesGeneral + '\'' + 
			"}";
		}
}