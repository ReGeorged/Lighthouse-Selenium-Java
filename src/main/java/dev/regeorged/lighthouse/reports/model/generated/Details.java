package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Details{

	@JsonProperty("nodes")
	private List<NodesItem> nodes;

	@JsonProperty("type")
	private String type;

	@JsonProperty("headings")
	private List<HeadingsItem> headings;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("sortedBy")
	private List<String> sortedBy;

	@JsonProperty("overallSavingsMs")
	private Integer overallSavingsMs;

	@JsonProperty("viewportContent")
	private String viewportContent;

	@JsonProperty("debugData")
	private DebugData debugData;

	@JsonProperty("observedMaxBlockingLoaf")
	private ObservedMaxBlockingLoaf observedMaxBlockingLoaf;

	@JsonProperty("observedMaxDurationLoaf")
	private ObservedMaxDurationLoaf observedMaxDurationLoaf;

	@JsonProperty("observedLoafs")
	private List<ObservedLoafsItem> observedLoafs;

	@JsonProperty("overallSavingsBytes")
	private Integer overallSavingsBytes;

	@JsonProperty("longestChain")
	private LongestChain longestChain;

	@JsonProperty("summary")
	private Summary summary;

	@JsonProperty("skipSumming")
	private List<String> skipSumming;

	@JsonProperty("isEntityGrouped")
	private Boolean isEntityGrouped;

	public void setNodes(List<NodesItem> nodes){
		this.nodes = nodes;
	}

	public List<NodesItem> getNodes(){
		return nodes;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setHeadings(List<HeadingsItem> headings){
		this.headings = headings;
	}

	public List<HeadingsItem> getHeadings(){
		return headings;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public void setSortedBy(List<String> sortedBy){
		this.sortedBy = sortedBy;
	}

	public List<String> getSortedBy(){
		return sortedBy;
	}

	public void setOverallSavingsMs(Integer overallSavingsMs){
		this.overallSavingsMs = overallSavingsMs;
	}

	public Integer getOverallSavingsMs(){
		return overallSavingsMs;
	}

	public void setViewportContent(String viewportContent){
		this.viewportContent = viewportContent;
	}

	public String getViewportContent(){
		return viewportContent;
	}

	public void setDebugData(DebugData debugData){
		this.debugData = debugData;
	}

	public DebugData getDebugData(){
		return debugData;
	}

	public void setObservedMaxBlockingLoaf(ObservedMaxBlockingLoaf observedMaxBlockingLoaf){
		this.observedMaxBlockingLoaf = observedMaxBlockingLoaf;
	}

	public ObservedMaxBlockingLoaf getObservedMaxBlockingLoaf(){
		return observedMaxBlockingLoaf;
	}

	public void setObservedMaxDurationLoaf(ObservedMaxDurationLoaf observedMaxDurationLoaf){
		this.observedMaxDurationLoaf = observedMaxDurationLoaf;
	}

	public ObservedMaxDurationLoaf getObservedMaxDurationLoaf(){
		return observedMaxDurationLoaf;
	}

	public void setObservedLoafs(List<ObservedLoafsItem> observedLoafs){
		this.observedLoafs = observedLoafs;
	}

	public List<ObservedLoafsItem> getObservedLoafs(){
		return observedLoafs;
	}

	public void setOverallSavingsBytes(Integer overallSavingsBytes){
		this.overallSavingsBytes = overallSavingsBytes;
	}

	public Integer getOverallSavingsBytes(){
		return overallSavingsBytes;
	}

	public void setLongestChain(LongestChain longestChain){
		this.longestChain = longestChain;
	}

	public LongestChain getLongestChain(){
		return longestChain;
	}

	public void setSummary(Summary summary){
		this.summary = summary;
	}

	public Summary getSummary(){
		return summary;
	}

	public void setSkipSumming(List<String> skipSumming){
		this.skipSumming = skipSumming;
	}

	public List<String> getSkipSumming(){
		return skipSumming;
	}

	public void setIsEntityGrouped(Boolean isEntityGrouped){
		this.isEntityGrouped = isEntityGrouped;
	}

	public Boolean isIsEntityGrouped(){
		return isEntityGrouped;
	}

	@Override
 	public String toString(){
		return 
			"Details{" + 
			"nodes = '" + nodes + '\'' + 
			",type = '" + type + '\'' + 
			",headings = '" + headings + '\'' + 
			",items = '" + items + '\'' + 
			",sortedBy = '" + sortedBy + '\'' + 
			",overallSavingsMs = '" + overallSavingsMs + '\'' + 
			",viewportContent = '" + viewportContent + '\'' + 
			",debugData = '" + debugData + '\'' + 
			",observedMaxBlockingLoaf = '" + observedMaxBlockingLoaf + '\'' + 
			",observedMaxDurationLoaf = '" + observedMaxDurationLoaf + '\'' + 
			",observedLoafs = '" + observedLoafs + '\'' + 
			",overallSavingsBytes = '" + overallSavingsBytes + '\'' + 
			",longestChain = '" + longestChain + '\'' + 
			",summary = '" + summary + '\'' + 
			",skipSumming = '" + skipSumming + '\'' + 
			",isEntityGrouped = '" + isEntityGrouped + '\'' + 
			"}";
		}
}