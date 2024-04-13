package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetricSavings{

	@JsonProperty("FCP")
	private Integer fCP;

	@JsonProperty("LCP")
	private Integer lCP;

	@JsonProperty("INP")
	private Integer iNP;

	@JsonProperty("CLS")
	private Integer cLS;

	@JsonProperty("TBT")
	private Integer tBT;

	public void setFCP(Integer fCP){
		this.fCP = fCP;
	}

	public Integer getFCP(){
		return fCP;
	}

	public void setLCP(Integer lCP){
		this.lCP = lCP;
	}

	public Integer getLCP(){
		return lCP;
	}

	public void setINP(Integer iNP){
		this.iNP = iNP;
	}

	public Integer getINP(){
		return iNP;
	}

	public void setCLS(Integer cLS){
		this.cLS = cLS;
	}

	public Integer getCLS(){
		return cLS;
	}

	public void setTBT(Integer tBT){
		this.tBT = tBT;
	}

	public Integer getTBT(){
		return tBT;
	}

	@Override
 	public String toString(){
		return 
			"MetricSavings{" + 
			"fCP = '" + fCP + '\'' + 
			",lCP = '" + lCP + '\'' + 
			",iNP = '" + iNP + '\'' + 
			",cLS = '" + cLS + '\'' + 
			",tBT = '" + tBT + '\'' + 
			"}";
		}
}