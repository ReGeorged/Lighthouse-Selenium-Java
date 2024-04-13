package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Id2{

	@JsonProperty("local")
	private String local;

	public void setLocal(String local){
		this.local = local;
	}

	public String getLocal(){
		return local;
	}

	@Override
 	public String toString(){
		return 
			"Id2{" + 
			"local = '" + local + '\'' + 
			"}";
		}
}