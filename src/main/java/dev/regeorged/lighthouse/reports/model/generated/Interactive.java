package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interactive{

	@JsonProperty("displayValue")
	private String displayValue;

	@JsonProperty("score")
	private Object score;

	@JsonProperty("description")
	private String description;

	@JsonProperty("numericValue")
	private Object numericValue;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("scoreDisplayMode")
	private String scoreDisplayMode;

	@JsonProperty("numericUnit")
	private String numericUnit;

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

	public void setNumericValue(Object numericValue){
		this.numericValue = numericValue;
	}

	public Object getNumericValue(){
		return numericValue;
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

	public void setNumericUnit(String numericUnit){
		this.numericUnit = numericUnit;
	}

	public String getNumericUnit(){
		return numericUnit;
	}

	@Override
 	public String toString(){
		return 
			"Interactive{" + 
			"displayValue = '" + displayValue + '\'' + 
			",score = '" + score + '\'' + 
			",description = '" + description + '\'' + 
			",numericValue = '" + numericValue + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",scoreDisplayMode = '" + scoreDisplayMode + '\'' + 
			",numericUnit = '" + numericUnit + '\'' + 
			"}";
		}
}