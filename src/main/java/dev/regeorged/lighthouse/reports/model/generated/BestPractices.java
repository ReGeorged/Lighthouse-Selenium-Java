package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class BestPractices{

	@JsonProperty("score")
	private Object score;

	@JsonProperty("auditRefs")
	private List<AuditRefsItem> auditRefs;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("supportedModes")
	private List<String> supportedModes;

	public void setScore(Object score){
		this.score = score;
	}

	public Object getScore(){
		return score;
	}

	public void setAuditRefs(List<AuditRefsItem> auditRefs){
		this.auditRefs = auditRefs;
	}

	public List<AuditRefsItem> getAuditRefs(){
		return auditRefs;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setSupportedModes(List<String> supportedModes){
		this.supportedModes = supportedModes;
	}

	public List<String> getSupportedModes(){
		return supportedModes;
	}

	@Override
 	public String toString(){
		return 
			"BestPractices{" + 
			"score = '" + score + '\'' + 
			",auditRefs = '" + auditRefs + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",supportedModes = '" + supportedModes + '\'' + 
			"}";
		}
}