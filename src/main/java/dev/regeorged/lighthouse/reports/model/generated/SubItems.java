package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubItems{

	@JsonProperty("type")
	private String type;

	@JsonProperty("items")
	private List<ItemsItem> items;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"SubItems{" + 
			"type = '" + type + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}