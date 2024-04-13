package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class StacksItem{

	@JsonProperty("id")
	private String id;

	@JsonProperty("version")
	private String version;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	@Override
 	public String toString(){
		return 
			"StacksItem{" + 
			"id = '" + id + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}