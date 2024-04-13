package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuditRefsItem{

	@JsonProperty("weight")
	private Integer weight;

	@JsonProperty("id")
	private String id;

	@JsonProperty("group")
	private String group;

	@JsonProperty("acronym")
	private String acronym;

	@JsonProperty("relevantAudits")
	private List<String> relevantAudits;

	public void setWeight(Integer weight){
		this.weight = weight;
	}

	public Integer getWeight(){
		return weight;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setGroup(String group){
		this.group = group;
	}

	public String getGroup(){
		return group;
	}

	public void setAcronym(String acronym){
		this.acronym = acronym;
	}

	public String getAcronym(){
		return acronym;
	}

	public void setRelevantAudits(List<String> relevantAudits){
		this.relevantAudits = relevantAudits;
	}

	public List<String> getRelevantAudits(){
		return relevantAudits;
	}

	@Override
 	public String toString(){
		return 
			"AuditRefsItem{" + 
			"weight = '" + weight + '\'' + 
			",id = '" + id + '\'' + 
			",group = '" + group + '\'' + 
			",acronym = '" + acronym + '\'' + 
			",relevantAudits = '" + relevantAudits + '\'' + 
			"}";
		}
}