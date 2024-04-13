package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class UnminifiedCss{

	@JsonProperty("displayValue")
	private String displayValue;

	@JsonProperty("score")
	private Integer score;

	@JsonProperty("description")
	private String description;

	@JsonProperty("numericValue")
	private Integer numericValue;

	@JsonProperty("details")
	private Details details;

	@JsonProperty("guidanceLevel")
	private Integer guidanceLevel;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("scoreDisplayMode")
	private String scoreDisplayMode;

	@JsonProperty("numericUnit")
	private String numericUnit;

	@JsonProperty("metricSavings")
	private MetricSavings metricSavings;

	public void setDisplayValue(String displayValue){
		this.displayValue = displayValue;
	}

	public String getDisplayValue(){
		return displayValue;
	}

	public void setScore(Integer score){
		this.score = score;
	}

	public Integer getScore(){
		return score;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setNumericValue(Integer numericValue){
		this.numericValue = numericValue;
	}

	public Integer getNumericValue(){
		return numericValue;
	}

	public void setDetails(Details details){
		this.details = details;
	}

	public Details getDetails(){
		return details;
	}

	public void setGuidanceLevel(Integer guidanceLevel){
		this.guidanceLevel = guidanceLevel;
	}

	public Integer getGuidanceLevel(){
		return guidanceLevel;
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

	public void setMetricSavings(MetricSavings metricSavings){
		this.metricSavings = metricSavings;
	}

	public MetricSavings getMetricSavings(){
		return metricSavings;
	}

	@Override
 	public String toString(){
		return 
			"UnminifiedCss{" + 
			"displayValue = '" + displayValue + '\'' + 
			",score = '" + score + '\'' + 
			",description = '" + description + '\'' + 
			",numericValue = '" + numericValue + '\'' + 
			",details = '" + details + '\'' + 
			",guidanceLevel = '" + guidanceLevel + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",scoreDisplayMode = '" + scoreDisplayMode + '\'' + 
			",numericUnit = '" + numericUnit + '\'' + 
			",metricSavings = '" + metricSavings + '\'' + 
			"}";
		}
}