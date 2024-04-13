package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Summary{

	@JsonProperty("wastedMs")
	private Object wastedMs;

	@JsonProperty("wastedBytes")
	private Integer wastedBytes;

	public void setWastedMs(Object wastedMs){
		this.wastedMs = wastedMs;
	}

	public Object getWastedMs(){
		return wastedMs;
	}

	public void setWastedBytes(Integer wastedBytes){
		this.wastedBytes = wastedBytes;
	}

	public Integer getWastedBytes(){
		return wastedBytes;
	}

	@Override
 	public String toString(){
		return 
			"Summary{" + 
			"wastedMs = '" + wastedMs + '\'' + 
			",wastedBytes = '" + wastedBytes + '\'' + 
			"}";
		}
}