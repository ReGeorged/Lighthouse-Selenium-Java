package dev.regeorged.lighthouse.reports.model.generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accessibility{

	@JsonProperty("score")
	private Object score;

	@JsonProperty("manualDescription")
	private String manualDescription;

	@JsonProperty("auditRefs")
	private List<AuditRefsItem> auditRefs;

	@JsonProperty("description")
	private String description;

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

	public void setManualDescription(String manualDescription){
		this.manualDescription = manualDescription;
	}

	public String getManualDescription(){
		return manualDescription;
	}

	public void setAuditRefs(List<AuditRefsItem> auditRefs){
		this.auditRefs = auditRefs;
	}

	public List<AuditRefsItem> getAuditRefs(){
		return auditRefs;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
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
			"Accessibility{" + 
			"score = '" + score + '\'' + 
			",manualDescription = '" + manualDescription + '\'' + 
			",auditRefs = '" + auditRefs + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",supportedModes = '" + supportedModes + '\'' + 
			"}";
		}
}