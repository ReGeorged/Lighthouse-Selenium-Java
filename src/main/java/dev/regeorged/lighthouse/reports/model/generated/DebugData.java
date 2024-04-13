package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DebugData{

	@JsonProperty("manifestUrl")
	private Object manifestUrl;

	@JsonProperty("type")
	private String type;

	@JsonProperty("impact")
	private String impact;

	@JsonProperty("tags")
	private List<String> tags;

	@JsonProperty("metricSavings")
	private MetricSavings metricSavings;

	@JsonProperty("stacks")
	private List<StacksItem> stacks;

	@JsonProperty("urls")
	private List<String> urls;

	@JsonProperty("tasks")
	private List<TasksItem> tasks;

	@JsonProperty("networkStartTimeTs")
	private Long networkStartTimeTs;

	@JsonProperty("initiatorPath")
	private List<InitiatorPathItem> initiatorPath;

	@JsonProperty("pathLength")
	private Integer pathLength;

	public void setManifestUrl(Object manifestUrl){
		this.manifestUrl = manifestUrl;
	}

	public Object getManifestUrl(){
		return manifestUrl;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setImpact(String impact){
		this.impact = impact;
	}

	public String getImpact(){
		return impact;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	public void setMetricSavings(MetricSavings metricSavings){
		this.metricSavings = metricSavings;
	}

	public MetricSavings getMetricSavings(){
		return metricSavings;
	}

	public void setStacks(List<StacksItem> stacks){
		this.stacks = stacks;
	}

	public List<StacksItem> getStacks(){
		return stacks;
	}

	public void setUrls(List<String> urls){
		this.urls = urls;
	}

	public List<String> getUrls(){
		return urls;
	}

	public void setTasks(List<TasksItem> tasks){
		this.tasks = tasks;
	}

	public List<TasksItem> getTasks(){
		return tasks;
	}

	public void setNetworkStartTimeTs(Long networkStartTimeTs){
		this.networkStartTimeTs = networkStartTimeTs;
	}

	public Long getNetworkStartTimeTs(){
		return networkStartTimeTs;
	}

	public void setInitiatorPath(List<InitiatorPathItem> initiatorPath){
		this.initiatorPath = initiatorPath;
	}

	public List<InitiatorPathItem> getInitiatorPath(){
		return initiatorPath;
	}

	public void setPathLength(Integer pathLength){
		this.pathLength = pathLength;
	}

	public Integer getPathLength(){
		return pathLength;
	}

	@Override
 	public String toString(){
		return 
			"DebugData{" + 
			"manifestUrl = '" + manifestUrl + '\'' + 
			",type = '" + type + '\'' + 
			",impact = '" + impact + '\'' + 
			",tags = '" + tags + '\'' + 
			",metricSavings = '" + metricSavings + '\'' + 
			",stacks = '" + stacks + '\'' + 
			",urls = '" + urls + '\'' + 
			",tasks = '" + tasks + '\'' + 
			",networkStartTimeTs = '" + networkStartTimeTs + '\'' + 
			",initiatorPath = '" + initiatorPath + '\'' + 
			",pathLength = '" + pathLength + '\'' + 
			"}";
		}
}