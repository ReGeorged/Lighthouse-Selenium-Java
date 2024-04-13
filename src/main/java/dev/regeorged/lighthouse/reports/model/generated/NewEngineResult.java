package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewEngineResult{

	@JsonProperty("cumulativeLayoutShift")
	private Integer cumulativeLayoutShift;

	@JsonProperty("cumulativeLayoutShiftMainFrame")
	private Integer cumulativeLayoutShiftMainFrame;

	public void setCumulativeLayoutShift(Integer cumulativeLayoutShift){
		this.cumulativeLayoutShift = cumulativeLayoutShift;
	}

	public Integer getCumulativeLayoutShift(){
		return cumulativeLayoutShift;
	}

	public void setCumulativeLayoutShiftMainFrame(Integer cumulativeLayoutShiftMainFrame){
		this.cumulativeLayoutShiftMainFrame = cumulativeLayoutShiftMainFrame;
	}

	public Integer getCumulativeLayoutShiftMainFrame(){
		return cumulativeLayoutShiftMainFrame;
	}

	@Override
 	public String toString(){
		return 
			"NewEngineResult{" + 
			"cumulativeLayoutShift = '" + cumulativeLayoutShift + '\'' + 
			",cumulativeLayoutShiftMainFrame = '" + cumulativeLayoutShiftMainFrame + '\'' + 
			"}";
		}
}