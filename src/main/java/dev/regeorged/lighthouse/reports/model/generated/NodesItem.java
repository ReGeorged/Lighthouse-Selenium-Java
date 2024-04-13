package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodesItem{

	@JsonProperty("resourceBytes")
	private Integer resourceBytes;

	@JsonProperty("unusedBytes")
	private Integer unusedBytes;

	@JsonProperty("name")
	private String name;

	public void setResourceBytes(Integer resourceBytes){
		this.resourceBytes = resourceBytes;
	}

	public Integer getResourceBytes(){
		return resourceBytes;
	}

	public void setUnusedBytes(Integer unusedBytes){
		this.unusedBytes = unusedBytes;
	}

	public Integer getUnusedBytes(){
		return unusedBytes;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"NodesItem{" + 
			"resourceBytes = '" + resourceBytes + '\'' + 
			",unusedBytes = '" + unusedBytes + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}