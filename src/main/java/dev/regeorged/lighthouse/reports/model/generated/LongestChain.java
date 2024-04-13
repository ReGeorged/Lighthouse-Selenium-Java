package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class LongestChain{

	@JsonProperty("duration")
	private Object duration;

	@JsonProperty("transferSize")
	private Integer transferSize;

	@JsonProperty("length")
	private Integer length;

	public void setDuration(Object duration){
		this.duration = duration;
	}

	public Object getDuration(){
		return duration;
	}

	public void setTransferSize(Integer transferSize){
		this.transferSize = transferSize;
	}

	public Integer getTransferSize(){
		return transferSize;
	}

	public void setLength(Integer length){
		this.length = length;
	}

	public Integer getLength(){
		return length;
	}

	@Override
 	public String toString(){
		return 
			"LongestChain{" + 
			"duration = '" + duration + '\'' + 
			",transferSize = '" + transferSize + '\'' + 
			",length = '" + length + '\'' + 
			"}";
		}
}