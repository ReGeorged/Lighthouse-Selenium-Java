package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TasksItem{

	@JsonProperty("urlIndex")
	private Integer urlIndex;

	@JsonProperty("duration")
	private Integer duration;

	@JsonProperty("other")
	private Integer other;

	@JsonProperty("paintCompositeRender")
	private Integer paintCompositeRender;

	@JsonProperty("startTime")
	private Object startTime;

	@JsonProperty("scriptEvaluation")
	private Integer scriptEvaluation;

	@JsonProperty("styleLayout")
	private Integer styleLayout;

	public void setUrlIndex(Integer urlIndex){
		this.urlIndex = urlIndex;
	}

	public Integer getUrlIndex(){
		return urlIndex;
	}

	public void setDuration(Integer duration){
		this.duration = duration;
	}

	public Integer getDuration(){
		return duration;
	}

	public void setOther(Integer other){
		this.other = other;
	}

	public Integer getOther(){
		return other;
	}

	public void setPaintCompositeRender(Integer paintCompositeRender){
		this.paintCompositeRender = paintCompositeRender;
	}

	public Integer getPaintCompositeRender(){
		return paintCompositeRender;
	}

	public void setStartTime(Object startTime){
		this.startTime = startTime;
	}

	public Object getStartTime(){
		return startTime;
	}

	public void setScriptEvaluation(Integer scriptEvaluation){
		this.scriptEvaluation = scriptEvaluation;
	}

	public Integer getScriptEvaluation(){
		return scriptEvaluation;
	}

	public void setStyleLayout(Integer styleLayout){
		this.styleLayout = styleLayout;
	}

	public Integer getStyleLayout(){
		return styleLayout;
	}

	@Override
 	public String toString(){
		return 
			"TasksItem{" + 
			"urlIndex = '" + urlIndex + '\'' + 
			",duration = '" + duration + '\'' + 
			",other = '" + other + '\'' + 
			",paintCompositeRender = '" + paintCompositeRender + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",scriptEvaluation = '" + scriptEvaluation + '\'' + 
			",styleLayout = '" + styleLayout + '\'' + 
			"}";
		}
}