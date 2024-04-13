package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class StackPacksItem{

	@JsonProperty("iconDataURL")
	private String iconDataURL;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("descriptions")
	private Descriptions descriptions;

	public void setIconDataURL(String iconDataURL){
		this.iconDataURL = iconDataURL;
	}

	public String getIconDataURL(){
		return iconDataURL;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setDescriptions(Descriptions descriptions){
		this.descriptions = descriptions;
	}

	public Descriptions getDescriptions(){
		return descriptions;
	}

	@Override
 	public String toString(){
		return 
			"StackPacksItem{" + 
			"iconDataURL = '" + iconDataURL + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",descriptions = '" + descriptions + '\'' + 
			"}";
		}
}