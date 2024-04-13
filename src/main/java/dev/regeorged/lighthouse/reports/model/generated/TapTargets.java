package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TapTargets{

	@JsonProperty("displayValue")
	private String displayValue;

	@JsonProperty("score")
	private Object score;

	@JsonProperty("description")
	private String description;

	@JsonProperty("details")
	private Details details;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("scoreDisplayMode")
	private String scoreDisplayMode;

	public void setDisplayValue(String displayValue){
		this.displayValue = displayValue;
	}

	public String getDisplayValue(){
		return displayValue;
	}

	public void setScore(Object score){
		this.score = score;
	}

	public Object getScore(){
		return score;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setDetails(Details details){
		this.details = details;
	}

	public Details getDetails(){
		return details;
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

	public void setScoreDisplayMode(String scoreDisplayMode){
		this.scoreDisplayMode = scoreDisplayMode;
	}

	public String getScoreDisplayMode(){
		return scoreDisplayMode;
	}

	@Override
 	public String toString(){
		return 
			"TapTargets{" + 
			"displayValue = '" + displayValue + '\'' + 
			",score = '" + score + '\'' + 
			",description = '" + description + '\'' + 
			",details = '" + details + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",scoreDisplayMode = '" + scoreDisplayMode + '\'' + 
			"}";
		}
}