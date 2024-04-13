package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Throttling{

	@JsonProperty("downloadThroughputKbps")
	private Object downloadThroughputKbps;

	@JsonProperty("rttMs")
	private Integer rttMs;

	@JsonProperty("requestLatencyMs")
	private Object requestLatencyMs;

	@JsonProperty("cpuSlowdownMultiplier")
	private Integer cpuSlowdownMultiplier;

	@JsonProperty("uploadThroughputKbps")
	private Integer uploadThroughputKbps;

	@JsonProperty("throughputKbps")
	private Object throughputKbps;

	public void setDownloadThroughputKbps(Object downloadThroughputKbps){
		this.downloadThroughputKbps = downloadThroughputKbps;
	}

	public Object getDownloadThroughputKbps(){
		return downloadThroughputKbps;
	}

	public void setRttMs(Integer rttMs){
		this.rttMs = rttMs;
	}

	public Integer getRttMs(){
		return rttMs;
	}

	public void setRequestLatencyMs(Object requestLatencyMs){
		this.requestLatencyMs = requestLatencyMs;
	}

	public Object getRequestLatencyMs(){
		return requestLatencyMs;
	}

	public void setCpuSlowdownMultiplier(Integer cpuSlowdownMultiplier){
		this.cpuSlowdownMultiplier = cpuSlowdownMultiplier;
	}

	public Integer getCpuSlowdownMultiplier(){
		return cpuSlowdownMultiplier;
	}

	public void setUploadThroughputKbps(Integer uploadThroughputKbps){
		this.uploadThroughputKbps = uploadThroughputKbps;
	}

	public Integer getUploadThroughputKbps(){
		return uploadThroughputKbps;
	}

	public void setThroughputKbps(Object throughputKbps){
		this.throughputKbps = throughputKbps;
	}

	public Object getThroughputKbps(){
		return throughputKbps;
	}

	@Override
 	public String toString(){
		return 
			"Throttling{" + 
			"downloadThroughputKbps = '" + downloadThroughputKbps + '\'' + 
			",rttMs = '" + rttMs + '\'' + 
			",requestLatencyMs = '" + requestLatencyMs + '\'' + 
			",cpuSlowdownMultiplier = '" + cpuSlowdownMultiplier + '\'' + 
			",uploadThroughputKbps = '" + uploadThroughputKbps + '\'' + 
			",throughputKbps = '" + throughputKbps + '\'' + 
			"}";
		}
}