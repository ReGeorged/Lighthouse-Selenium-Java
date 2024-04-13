package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Report{

	@JsonProperty("categoryGroups")
	private CategoryGroups categoryGroups;

	@JsonProperty("userAgent")
	private String userAgent;

	@JsonProperty("lighthouseVersion")
	private String lighthouseVersion;

	@JsonProperty("configSettings")
	private ConfigSettings configSettings;

	@JsonProperty("gatherMode")
	private String gatherMode;

	@JsonProperty("environment")
	private Environment environment;

	@JsonProperty("stackPacks")
	private List<StackPacksItem> stackPacks;

	@JsonProperty("entities")
	private List<EntitiesItem> entities;

	@JsonProperty("runWarnings")
	private List<String> runWarnings;

	@JsonProperty("fetchTime")
	private String fetchTime;

	@JsonProperty("requestedUrl")
	private String requestedUrl;

	@JsonProperty("categories")
	private Categories categories;

	@JsonProperty("finalDisplayedUrl")
	private String finalDisplayedUrl;

	@JsonProperty("finalUrl")
	private String finalUrl;

	@JsonProperty("audits")
	private Audits audits;

	@JsonProperty("mainDocumentUrl")
	private String mainDocumentUrl;

	public void setCategoryGroups(CategoryGroups categoryGroups){
		this.categoryGroups = categoryGroups;
	}

	public CategoryGroups getCategoryGroups(){
		return categoryGroups;
	}

	public void setUserAgent(String userAgent){
		this.userAgent = userAgent;
	}

	public String getUserAgent(){
		return userAgent;
	}

	public void setLighthouseVersion(String lighthouseVersion){
		this.lighthouseVersion = lighthouseVersion;
	}

	public String getLighthouseVersion(){
		return lighthouseVersion;
	}

	public void setConfigSettings(ConfigSettings configSettings){
		this.configSettings = configSettings;
	}

	public ConfigSettings getConfigSettings(){
		return configSettings;
	}

	public void setGatherMode(String gatherMode){
		this.gatherMode = gatherMode;
	}

	public String getGatherMode(){
		return gatherMode;
	}

	public void setEnvironment(Environment environment){
		this.environment = environment;
	}

	public Environment getEnvironment(){
		return environment;
	}

	public void setStackPacks(List<StackPacksItem> stackPacks){
		this.stackPacks = stackPacks;
	}

	public List<StackPacksItem> getStackPacks(){
		return stackPacks;
	}

	public void setEntities(List<EntitiesItem> entities){
		this.entities = entities;
	}

	public List<EntitiesItem> getEntities(){
		return entities;
	}

	public void setRunWarnings(List<String> runWarnings){
		this.runWarnings = runWarnings;
	}

	public List<String> getRunWarnings(){
		return runWarnings;
	}

	public void setFetchTime(String fetchTime){
		this.fetchTime = fetchTime;
	}

	public String getFetchTime(){
		return fetchTime;
	}

	public void setRequestedUrl(String requestedUrl){
		this.requestedUrl = requestedUrl;
	}

	public String getRequestedUrl(){
		return requestedUrl;
	}

	public void setCategories(Categories categories){
		this.categories = categories;
	}

	public Categories getCategories(){
		return categories;
	}

	public void setFinalDisplayedUrl(String finalDisplayedUrl){
		this.finalDisplayedUrl = finalDisplayedUrl;
	}

	public String getFinalDisplayedUrl(){
		return finalDisplayedUrl;
	}

	public void setFinalUrl(String finalUrl){
		this.finalUrl = finalUrl;
	}

	public String getFinalUrl(){
		return finalUrl;
	}

	public void setAudits(Audits audits){
		this.audits = audits;
	}

	public Audits getAudits(){
		return audits;
	}

	public void setMainDocumentUrl(String mainDocumentUrl){
		this.mainDocumentUrl = mainDocumentUrl;
	}

	public String getMainDocumentUrl(){
		return mainDocumentUrl;
	}

	@Override
 	public String toString(){
		return 
			"Report{" + 
			"categoryGroups = '" + categoryGroups + '\'' + 
			",userAgent = '" + userAgent + '\'' + 
			",lighthouseVersion = '" + lighthouseVersion + '\'' + 
			",configSettings = '" + configSettings + '\'' + 
			",gatherMode = '" + gatherMode + '\'' + 
			",environment = '" + environment + '\'' + 
			",stackPacks = '" + stackPacks + '\'' + 
			",entities = '" + entities + '\'' + 
			",runWarnings = '" + runWarnings + '\'' + 
			",fetchTime = '" + fetchTime + '\'' + 
			",requestedUrl = '" + requestedUrl + '\'' + 
			",categories = '" + categories + '\'' + 
			",finalDisplayedUrl = '" + finalDisplayedUrl + '\'' + 
			",finalUrl = '" + finalUrl + '\'' + 
			",audits = '" + audits + '\'' + 
			",mainDocumentUrl = '" + mainDocumentUrl + '\'' + 
			"}";
		}
}