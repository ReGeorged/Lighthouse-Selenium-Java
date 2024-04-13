package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Environment{

	@JsonProperty("networkUserAgent")
	private String networkUserAgent;

	@JsonProperty("hostUserAgent")
	private String hostUserAgent;

	@JsonProperty("credits")
	private Credits credits;

	@JsonProperty("benchmarkIndex")
	private Object benchmarkIndex;

	public void setNetworkUserAgent(String networkUserAgent){
		this.networkUserAgent = networkUserAgent;
	}

	public String getNetworkUserAgent(){
		return networkUserAgent;
	}

	public void setHostUserAgent(String hostUserAgent){
		this.hostUserAgent = hostUserAgent;
	}

	public String getHostUserAgent(){
		return hostUserAgent;
	}

	public void setCredits(Credits credits){
		this.credits = credits;
	}

	public Credits getCredits(){
		return credits;
	}

	public void setBenchmarkIndex(Object benchmarkIndex){
		this.benchmarkIndex = benchmarkIndex;
	}

	public Object getBenchmarkIndex(){
		return benchmarkIndex;
	}

	@Override
 	public String toString(){
		return 
			"Environment{" + 
			"networkUserAgent = '" + networkUserAgent + '\'' + 
			",hostUserAgent = '" + hostUserAgent + '\'' + 
			",credits = '" + credits + '\'' + 
			",benchmarkIndex = '" + benchmarkIndex + '\'' + 
			"}";
		}
}