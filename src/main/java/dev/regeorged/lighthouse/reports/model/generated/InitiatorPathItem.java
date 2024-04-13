package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitiatorPathItem{

	@JsonProperty("url")
	private String url;

	@JsonProperty("initiatorType")
	private String initiatorType;

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setInitiatorType(String initiatorType){
		this.initiatorType = initiatorType;
	}

	public String getInitiatorType(){
		return initiatorType;
	}

	@Override
 	public String toString(){
		return 
			"InitiatorPathItem{" + 
			"url = '" + url + '\'' + 
			",initiatorType = '" + initiatorType + '\'' + 
			"}";
		}
}