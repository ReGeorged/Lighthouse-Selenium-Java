package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Categories{

	@JsonProperty("performance")
	private Performance performance;

	@JsonProperty("accessibility")
	private Accessibility accessibility;

	@JsonProperty("best-practices")
	private BestPractices bestPractices;

	@JsonProperty("pwa")
	private Pwa pwa;

	@JsonProperty("seo")
	private Seo seo;

	public void setPerformance(Performance performance){
		this.performance = performance;
	}

	public Performance getPerformance(){
		return performance;
	}

	public void setAccessibility(Accessibility accessibility){
		this.accessibility = accessibility;
	}

	public Accessibility getAccessibility(){
		return accessibility;
	}

	public void setBestPractices(BestPractices bestPractices){
		this.bestPractices = bestPractices;
	}

	public BestPractices getBestPractices(){
		return bestPractices;
	}

	public void setPwa(Pwa pwa){
		this.pwa = pwa;
	}

	public Pwa getPwa(){
		return pwa;
	}

	public void setSeo(Seo seo){
		this.seo = seo;
	}

	public Seo getSeo(){
		return seo;
	}

	@Override
 	public String toString(){
		return 
			"Categories{" + 
			"performance = '" + performance + '\'' + 
			",accessibility = '" + accessibility + '\'' + 
			",best-practices = '" + bestPractices + '\'' + 
			",pwa = '" + pwa + '\'' + 
			",seo = '" + seo + '\'' + 
			"}";
		}
}