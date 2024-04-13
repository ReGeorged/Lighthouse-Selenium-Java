package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value{

	@JsonProperty("granularity")
	private Integer granularity;

	@JsonProperty("type")
	private String type;

	@JsonProperty("value")
	private Integer value;

	public void setGranularity(Integer granularity){
		this.granularity = granularity;
	}

	public Integer getGranularity(){
		return granularity;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setValue(Integer value){
		this.value = value;
	}

	public Integer getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"Value{" + 
			"granularity = '" + granularity + '\'' + 
			",type = '" + type + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}