package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigSettings{

	@JsonProperty("maxWaitForFcp")
	private Integer maxWaitForFcp;

	@JsonProperty("networkQuietThresholdMs")
	private Integer networkQuietThresholdMs;

	@JsonProperty("formFactor")
	private String formFactor;

	@JsonProperty("disableFullPageScreenshot")
	private Boolean disableFullPageScreenshot;

	@JsonProperty("channel")
	private String channel;

	@JsonProperty("locale")
	private String locale;

	@JsonProperty("output")
	private List<String> output;

	@JsonProperty("ignoreStatusCode")
	private Boolean ignoreStatusCode;

	@JsonProperty("throttling")
	private Throttling throttling;

	@JsonProperty("precomputedLanternData")
	private Object precomputedLanternData;

	@JsonProperty("disableStorageReset")
	private Boolean disableStorageReset;

	@JsonProperty("maxWaitForLoad")
	private Integer maxWaitForLoad;

	@JsonProperty("onlyAudits")
	private Object onlyAudits;

	@JsonProperty("emulatedUserAgent")
	private String emulatedUserAgent;

	@JsonProperty("blockedUrlPatterns")
	private Object blockedUrlPatterns;

	@JsonProperty("throttlingMethod")
	private String throttlingMethod;

	@JsonProperty("pauseAfterLoadMs")
	private Integer pauseAfterLoadMs;

	@JsonProperty("auditMode")
	private Boolean auditMode;

	@JsonProperty("extraHeaders")
	private Object extraHeaders;

	@JsonProperty("skipAboutBlank")
	private Boolean skipAboutBlank;

	@JsonProperty("debugNavigation")
	private Boolean debugNavigation;

	@JsonProperty("additionalTraceCategories")
	private Object additionalTraceCategories;

	@JsonProperty("blankPage")
	private String blankPage;

	@JsonProperty("skipAudits")
	private Object skipAudits;

	@JsonProperty("cpuQuietThresholdMs")
	private Integer cpuQuietThresholdMs;

	@JsonProperty("gatherMode")
	private Boolean gatherMode;

	@JsonProperty("onlyCategories")
	private Object onlyCategories;

	@JsonProperty("clearStorageTypes")
	private List<String> clearStorageTypes;

	@JsonProperty("budgets")
	private Object budgets;

	@JsonProperty("usePassiveGathering")
	private Boolean usePassiveGathering;

	@JsonProperty("pauseAfterFcpMs")
	private Integer pauseAfterFcpMs;

	@JsonProperty("screenEmulation")
	private ScreenEmulation screenEmulation;

	public void setMaxWaitForFcp(Integer maxWaitForFcp){
		this.maxWaitForFcp = maxWaitForFcp;
	}

	public Integer getMaxWaitForFcp(){
		return maxWaitForFcp;
	}

	public void setNetworkQuietThresholdMs(Integer networkQuietThresholdMs){
		this.networkQuietThresholdMs = networkQuietThresholdMs;
	}

	public Integer getNetworkQuietThresholdMs(){
		return networkQuietThresholdMs;
	}

	public void setFormFactor(String formFactor){
		this.formFactor = formFactor;
	}

	public String getFormFactor(){
		return formFactor;
	}

	public void setDisableFullPageScreenshot(Boolean disableFullPageScreenshot){
		this.disableFullPageScreenshot = disableFullPageScreenshot;
	}

	public Boolean isDisableFullPageScreenshot(){
		return disableFullPageScreenshot;
	}

	public void setChannel(String channel){
		this.channel = channel;
	}

	public String getChannel(){
		return channel;
	}

	public void setLocale(String locale){
		this.locale = locale;
	}

	public String getLocale(){
		return locale;
	}

	public void setOutput(List<String> output){
		this.output = output;
	}

	public List<String> getOutput(){
		return output;
	}

	public void setIgnoreStatusCode(Boolean ignoreStatusCode){
		this.ignoreStatusCode = ignoreStatusCode;
	}

	public Boolean isIgnoreStatusCode(){
		return ignoreStatusCode;
	}

	public void setThrottling(Throttling throttling){
		this.throttling = throttling;
	}

	public Throttling getThrottling(){
		return throttling;
	}

	public void setPrecomputedLanternData(Object precomputedLanternData){
		this.precomputedLanternData = precomputedLanternData;
	}

	public Object getPrecomputedLanternData(){
		return precomputedLanternData;
	}

	public void setDisableStorageReset(Boolean disableStorageReset){
		this.disableStorageReset = disableStorageReset;
	}

	public Boolean isDisableStorageReset(){
		return disableStorageReset;
	}

	public void setMaxWaitForLoad(Integer maxWaitForLoad){
		this.maxWaitForLoad = maxWaitForLoad;
	}

	public Integer getMaxWaitForLoad(){
		return maxWaitForLoad;
	}

	public void setOnlyAudits(Object onlyAudits){
		this.onlyAudits = onlyAudits;
	}

	public Object getOnlyAudits(){
		return onlyAudits;
	}

	public void setEmulatedUserAgent(String emulatedUserAgent){
		this.emulatedUserAgent = emulatedUserAgent;
	}

	public String getEmulatedUserAgent(){
		return emulatedUserAgent;
	}

	public void setBlockedUrlPatterns(Object blockedUrlPatterns){
		this.blockedUrlPatterns = blockedUrlPatterns;
	}

	public Object getBlockedUrlPatterns(){
		return blockedUrlPatterns;
	}

	public void setThrottlingMethod(String throttlingMethod){
		this.throttlingMethod = throttlingMethod;
	}

	public String getThrottlingMethod(){
		return throttlingMethod;
	}

	public void setPauseAfterLoadMs(Integer pauseAfterLoadMs){
		this.pauseAfterLoadMs = pauseAfterLoadMs;
	}

	public Integer getPauseAfterLoadMs(){
		return pauseAfterLoadMs;
	}

	public void setAuditMode(Boolean auditMode){
		this.auditMode = auditMode;
	}

	public Boolean isAuditMode(){
		return auditMode;
	}

	public void setExtraHeaders(Object extraHeaders){
		this.extraHeaders = extraHeaders;
	}

	public Object getExtraHeaders(){
		return extraHeaders;
	}

	public void setSkipAboutBlank(Boolean skipAboutBlank){
		this.skipAboutBlank = skipAboutBlank;
	}

	public Boolean isSkipAboutBlank(){
		return skipAboutBlank;
	}

	public void setDebugNavigation(Boolean debugNavigation){
		this.debugNavigation = debugNavigation;
	}

	public Boolean isDebugNavigation(){
		return debugNavigation;
	}

	public void setAdditionalTraceCategories(Object additionalTraceCategories){
		this.additionalTraceCategories = additionalTraceCategories;
	}

	public Object getAdditionalTraceCategories(){
		return additionalTraceCategories;
	}

	public void setBlankPage(String blankPage){
		this.blankPage = blankPage;
	}

	public String getBlankPage(){
		return blankPage;
	}

	public void setSkipAudits(Object skipAudits){
		this.skipAudits = skipAudits;
	}

	public Object getSkipAudits(){
		return skipAudits;
	}

	public void setCpuQuietThresholdMs(Integer cpuQuietThresholdMs){
		this.cpuQuietThresholdMs = cpuQuietThresholdMs;
	}

	public Integer getCpuQuietThresholdMs(){
		return cpuQuietThresholdMs;
	}

	public void setGatherMode(Boolean gatherMode){
		this.gatherMode = gatherMode;
	}

	public Boolean isGatherMode(){
		return gatherMode;
	}

	public void setOnlyCategories(Object onlyCategories){
		this.onlyCategories = onlyCategories;
	}

	public Object getOnlyCategories(){
		return onlyCategories;
	}

	public void setClearStorageTypes(List<String> clearStorageTypes){
		this.clearStorageTypes = clearStorageTypes;
	}

	public List<String> getClearStorageTypes(){
		return clearStorageTypes;
	}

	public void setBudgets(Object budgets){
		this.budgets = budgets;
	}

	public Object getBudgets(){
		return budgets;
	}

	public void setUsePassiveGathering(Boolean usePassiveGathering){
		this.usePassiveGathering = usePassiveGathering;
	}

	public Boolean isUsePassiveGathering(){
		return usePassiveGathering;
	}

	public void setPauseAfterFcpMs(Integer pauseAfterFcpMs){
		this.pauseAfterFcpMs = pauseAfterFcpMs;
	}

	public Integer getPauseAfterFcpMs(){
		return pauseAfterFcpMs;
	}

	public void setScreenEmulation(ScreenEmulation screenEmulation){
		this.screenEmulation = screenEmulation;
	}

	public ScreenEmulation getScreenEmulation(){
		return screenEmulation;
	}

	@Override
 	public String toString(){
		return 
			"ConfigSettings{" + 
			"maxWaitForFcp = '" + maxWaitForFcp + '\'' + 
			",networkQuietThresholdMs = '" + networkQuietThresholdMs + '\'' + 
			",formFactor = '" + formFactor + '\'' + 
			",disableFullPageScreenshot = '" + disableFullPageScreenshot + '\'' + 
			",channel = '" + channel + '\'' + 
			",locale = '" + locale + '\'' + 
			",output = '" + output + '\'' + 
			",ignoreStatusCode = '" + ignoreStatusCode + '\'' + 
			",throttling = '" + throttling + '\'' + 
			",precomputedLanternData = '" + precomputedLanternData + '\'' + 
			",disableStorageReset = '" + disableStorageReset + '\'' + 
			",maxWaitForLoad = '" + maxWaitForLoad + '\'' + 
			",onlyAudits = '" + onlyAudits + '\'' + 
			",emulatedUserAgent = '" + emulatedUserAgent + '\'' + 
			",blockedUrlPatterns = '" + blockedUrlPatterns + '\'' + 
			",throttlingMethod = '" + throttlingMethod + '\'' + 
			",pauseAfterLoadMs = '" + pauseAfterLoadMs + '\'' + 
			",auditMode = '" + auditMode + '\'' + 
			",extraHeaders = '" + extraHeaders + '\'' + 
			",skipAboutBlank = '" + skipAboutBlank + '\'' + 
			",debugNavigation = '" + debugNavigation + '\'' + 
			",additionalTraceCategories = '" + additionalTraceCategories + '\'' + 
			",blankPage = '" + blankPage + '\'' + 
			",skipAudits = '" + skipAudits + '\'' + 
			",cpuQuietThresholdMs = '" + cpuQuietThresholdMs + '\'' + 
			",gatherMode = '" + gatherMode + '\'' + 
			",onlyCategories = '" + onlyCategories + '\'' + 
			",clearStorageTypes = '" + clearStorageTypes + '\'' + 
			",budgets = '" + budgets + '\'' + 
			",usePassiveGathering = '" + usePassiveGathering + '\'' + 
			",pauseAfterFcpMs = '" + pauseAfterFcpMs + '\'' + 
			",screenEmulation = '" + screenEmulation + '\'' + 
			"}";
		}
}