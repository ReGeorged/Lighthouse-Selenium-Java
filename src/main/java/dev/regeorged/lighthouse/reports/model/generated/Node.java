package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Node{

	@JsonProperty("snippet")
	private String snippet;

	@JsonProperty("path")
	private String path;

	@JsonProperty("lhId")
	private String lhId;

	@JsonProperty("boundingRect")
	private BoundingRect boundingRect;

	@JsonProperty("selector")
	private String selector;

	@JsonProperty("type")
	private String type;

	@JsonProperty("explanation")
	private String explanation;

	@JsonProperty("nodeLabel")
	private String nodeLabel;

	public void setSnippet(String snippet){
		this.snippet = snippet;
	}

	public String getSnippet(){
		return snippet;
	}

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setLhId(String lhId){
		this.lhId = lhId;
	}

	public String getLhId(){
		return lhId;
	}

	public void setBoundingRect(BoundingRect boundingRect){
		this.boundingRect = boundingRect;
	}

	public BoundingRect getBoundingRect(){
		return boundingRect;
	}

	public void setSelector(String selector){
		this.selector = selector;
	}

	public String getSelector(){
		return selector;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setExplanation(String explanation){
		this.explanation = explanation;
	}

	public String getExplanation(){
		return explanation;
	}

	public void setNodeLabel(String nodeLabel){
		this.nodeLabel = nodeLabel;
	}

	public String getNodeLabel(){
		return nodeLabel;
	}

	@Override
 	public String toString(){
		return 
			"Node{" + 
			"snippet = '" + snippet + '\'' + 
			",path = '" + path + '\'' + 
			",lhId = '" + lhId + '\'' + 
			",boundingRect = '" + boundingRect + '\'' + 
			",selector = '" + selector + '\'' + 
			",type = '" + type + '\'' + 
			",explanation = '" + explanation + '\'' + 
			",nodeLabel = '" + nodeLabel + '\'' + 
			"}";
		}
}