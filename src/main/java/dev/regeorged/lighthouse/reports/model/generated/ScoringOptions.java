package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScoringOptions{

	@JsonProperty("median")
	private Object median;

	@JsonProperty("p10")
	private Object p10;

	public void setMedian(Object median){
		this.median = median;
	}

	public Object getMedian(){
		return median;
	}

	public void setP10(Object p10){
		this.p10 = p10;
	}

	public Object getP10(){
		return p10;
	}

	@Override
 	public String toString(){
		return 
			"ScoringOptions{" + 
			"median = '" + median + '\'' + 
			",p10 = '" + p10 + '\'' + 
			"}";
		}
}