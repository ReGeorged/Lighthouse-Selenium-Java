package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadingsItem{

	@JsonProperty("valueType")
	private String valueType;

	@JsonProperty("label")
	private String label;

	@JsonProperty("key")
	private String key;

	@JsonProperty("subItemsHeading")
	private SubItemsHeading subItemsHeading;

	@JsonProperty("granularity")
	private Integer granularity;

	@JsonProperty("displayUnit")
	private String displayUnit;

	public void setValueType(String valueType){
		this.valueType = valueType;
	}

	public String getValueType(){
		return valueType;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setSubItemsHeading(SubItemsHeading subItemsHeading){
		this.subItemsHeading = subItemsHeading;
	}

	public SubItemsHeading getSubItemsHeading(){
		return subItemsHeading;
	}

	public void setGranularity(Integer granularity){
		this.granularity = granularity;
	}

	public Integer getGranularity(){
		return granularity;
	}

	public void setDisplayUnit(String displayUnit){
		this.displayUnit = displayUnit;
	}

	public String getDisplayUnit(){
		return displayUnit;
	}

	@Override
 	public String toString(){
		return 
			"HeadingsItem{" + 
			"valueType = '" + valueType + '\'' + 
			",label = '" + label + '\'' + 
			",key = '" + key + '\'' + 
			",subItemsHeading = '" + subItemsHeading + '\'' + 
			",granularity = '" + granularity + '\'' + 
			",displayUnit = '" + displayUnit + '\'' + 
			"}";
		}
}