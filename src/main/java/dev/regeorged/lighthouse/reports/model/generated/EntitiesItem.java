package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntitiesItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("origins")
	private List<String> origins;

	@JsonProperty("isUnrecognized")
	private Boolean isUnrecognized;

	@JsonProperty("category")
	private String category;

	@JsonProperty("homepage")
	private String homepage;

	@JsonProperty("isFirstParty")
	private Boolean isFirstParty;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setOrigins(List<String> origins){
		this.origins = origins;
	}

	public List<String> getOrigins(){
		return origins;
	}

	public void setIsUnrecognized(Boolean isUnrecognized){
		this.isUnrecognized = isUnrecognized;
	}

	public Boolean isIsUnrecognized(){
		return isUnrecognized;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setHomepage(String homepage){
		this.homepage = homepage;
	}

	public String getHomepage(){
		return homepage;
	}

	public void setIsFirstParty(Boolean isFirstParty){
		this.isFirstParty = isFirstParty;
	}

	public Boolean isIsFirstParty(){
		return isFirstParty;
	}

	@Override
 	public String toString(){
		return 
			"EntitiesItem{" + 
			"name = '" + name + '\'' + 
			",origins = '" + origins + '\'' + 
			",isUnrecognized = '" + isUnrecognized + '\'' + 
			",category = '" + category + '\'' + 
			",homepage = '" + homepage + '\'' + 
			",isFirstParty = '" + isFirstParty + '\'' + 
			"}";
		}
}