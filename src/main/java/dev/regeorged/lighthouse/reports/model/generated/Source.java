package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.regeorged.lighthouse.reports.model.deserializers.SourceDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = SourceDeserializer.class)
public class Source{

	@JsonProperty("type")
	private String type;

	@JsonProperty("value")
	private String value;
	@JsonProperty("network")
	private String network;


	public void setNetwork(String network){
		this.network = network;
	}
	public String getNetwork(){
		return network;
	}
	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"Source{" + 
			"type = '" + type + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}