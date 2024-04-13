package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SplashScreen{

	@JsonProperty("score")
	private Integer score;

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

	@JsonProperty("explanation")
	private String explanation;

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

	public void setExplanation(String explanation){
		this.explanation = explanation;
	}

	public String getExplanation(){
		return explanation;
	}

	@Override
 	public String toString(){
		return 
			"SplashScreen{" + 
			"score = '" + score + '\'' + 
			",description = '" + description + '\'' + 
			",details = '" + details + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",scoreDisplayMode = '" + scoreDisplayMode + '\'' + 
			",explanation = '" + explanation + '\'' + 
			"}";
		}
}