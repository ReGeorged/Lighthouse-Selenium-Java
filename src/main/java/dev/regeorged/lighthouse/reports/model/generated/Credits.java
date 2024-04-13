package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Credits{

	@JsonProperty("axe-core")
	private String axeCore;

	public void setAxeCore(String axeCore){
		this.axeCore = axeCore;
	}

	public String getAxeCore(){
		return axeCore;
	}

	@Override
 	public String toString(){
		return 
			"Credits{" + 
			"axe-core = '" + axeCore + '\'' + 
			"}";
		}
}