package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubItemsHeading{

	@JsonProperty("key")
	private String key;

	@JsonProperty("valueType")
	private String valueType;

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setValueType(String valueType){
		this.valueType = valueType;
	}

	public String getValueType(){
		return valueType;
	}

	@Override
 	public String toString(){
		return 
			"SubItemsHeading{" + 
			"key = '" + key + '\'' + 
			",valueType = '" + valueType + '\'' + 
			"}";
		}
}