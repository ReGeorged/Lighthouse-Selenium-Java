package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data{

	@JsonProperty("duration")
	private Object duration;

	@JsonProperty("numScripts")
	private Integer numScripts;

	@JsonProperty("styleAndLayoutDuration")
	private Object styleAndLayoutDuration;

	@JsonProperty("blockingDuration")
	private Object blockingDuration;

	@JsonProperty("renderDuration")
	private Object renderDuration;

	public void setDuration(Object duration){
		this.duration = duration;
	}

	public Object getDuration(){
		return duration;
	}

	public void setNumScripts(Integer numScripts){
		this.numScripts = numScripts;
	}

	public Integer getNumScripts(){
		return numScripts;
	}

	public void setStyleAndLayoutDuration(Object styleAndLayoutDuration){
		this.styleAndLayoutDuration = styleAndLayoutDuration;
	}

	public Object getStyleAndLayoutDuration(){
		return styleAndLayoutDuration;
	}

	public void setBlockingDuration(Object blockingDuration){
		this.blockingDuration = blockingDuration;
	}

	public Object getBlockingDuration(){
		return blockingDuration;
	}

	public void setRenderDuration(Object renderDuration){
		this.renderDuration = renderDuration;
	}

	public Object getRenderDuration(){
		return renderDuration;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"duration = '" + duration + '\'' + 
			",numScripts = '" + numScripts + '\'' + 
			",styleAndLayoutDuration = '" + styleAndLayoutDuration + '\'' + 
			",blockingDuration = '" + blockingDuration + '\'' + 
			",renderDuration = '" + renderDuration + '\'' + 
			"}";
		}
}