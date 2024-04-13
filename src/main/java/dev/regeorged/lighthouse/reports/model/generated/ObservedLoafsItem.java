package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservedLoafsItem{

	@JsonProperty("duration")
	private Object duration;

	@JsonProperty("blockingDuration")
	private Integer blockingDuration;

	@JsonProperty("startTime")
	private Object startTime;

	public void setDuration(Object duration){
		this.duration = duration;
	}

	public Object getDuration(){
		return duration;
	}

	public void setBlockingDuration(Integer blockingDuration){
		this.blockingDuration = blockingDuration;
	}

	public Integer getBlockingDuration(){
		return blockingDuration;
	}

	public void setStartTime(Object startTime){
		this.startTime = startTime;
	}

	public Object getStartTime(){
		return startTime;
	}

	@Override
 	public String toString(){
		return 
			"ObservedLoafsItem{" + 
			"duration = '" + duration + '\'' + 
			",blockingDuration = '" + blockingDuration + '\'' + 
			",startTime = '" + startTime + '\'' + 
			"}";
		}
}