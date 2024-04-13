package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Descriptions{

	@JsonProperty("server-response-time")
	private String serverResponseTime;

	@JsonProperty("unused-javascript")
	private String unusedJavascript;

	@JsonProperty("user-timings")
	private String userTimings;

	@JsonProperty("redirects")
	private String redirects;

	@JsonProperty("dom-size")
	private String domSize;

	@JsonProperty("unminified-css")
	private String unminifiedCss;

	@JsonProperty("unminified-javascript")
	private String unminifiedJavascript;

	public void setServerResponseTime(String serverResponseTime){
		this.serverResponseTime = serverResponseTime;
	}

	public String getServerResponseTime(){
		return serverResponseTime;
	}

	public void setUnusedJavascript(String unusedJavascript){
		this.unusedJavascript = unusedJavascript;
	}

	public String getUnusedJavascript(){
		return unusedJavascript;
	}

	public void setUserTimings(String userTimings){
		this.userTimings = userTimings;
	}

	public String getUserTimings(){
		return userTimings;
	}

	public void setRedirects(String redirects){
		this.redirects = redirects;
	}

	public String getRedirects(){
		return redirects;
	}

	public void setDomSize(String domSize){
		this.domSize = domSize;
	}

	public String getDomSize(){
		return domSize;
	}

	public void setUnminifiedCss(String unminifiedCss){
		this.unminifiedCss = unminifiedCss;
	}

	public String getUnminifiedCss(){
		return unminifiedCss;
	}

	public void setUnminifiedJavascript(String unminifiedJavascript){
		this.unminifiedJavascript = unminifiedJavascript;
	}

	public String getUnminifiedJavascript(){
		return unminifiedJavascript;
	}

	@Override
 	public String toString(){
		return 
			"Descriptions{" + 
			"server-response-time = '" + serverResponseTime + '\'' + 
			",unused-javascript = '" + unusedJavascript + '\'' + 
			",user-timings = '" + userTimings + '\'' + 
			",redirects = '" + redirects + '\'' + 
			",dom-size = '" + domSize + '\'' + 
			",unminified-css = '" + unminifiedCss + '\'' + 
			",unminified-javascript = '" + unminifiedJavascript + '\'' + 
			"}";
		}
}