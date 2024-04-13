package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservedMaxBlockingLoaf{

	@JsonProperty("args")
	private Args args;

	@JsonProperty("id2")
	private Id2 id2;

	@JsonProperty("cat")
	private String cat;

	@JsonProperty("scope")
	private String scope;

	@JsonProperty("name")
	private String name;

	@JsonProperty("ph")
	private String ph;

	@JsonProperty("pid")
	private Integer pid;

	@JsonProperty("tid")
	private Integer tid;

	@JsonProperty("ts")
	private Long ts;

	public void setArgs(Args args){
		this.args = args;
	}

	public Args getArgs(){
		return args;
	}

	public void setId2(Id2 id2){
		this.id2 = id2;
	}

	public Id2 getId2(){
		return id2;
	}

	public void setCat(String cat){
		this.cat = cat;
	}

	public String getCat(){
		return cat;
	}

	public void setScope(String scope){
		this.scope = scope;
	}

	public String getScope(){
		return scope;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPh(String ph){
		this.ph = ph;
	}

	public String getPh(){
		return ph;
	}

	public void setPid(Integer pid){
		this.pid = pid;
	}

	public Integer getPid(){
		return pid;
	}

	public void setTid(Integer tid){
		this.tid = tid;
	}

	public Integer getTid(){
		return tid;
	}

	public void setTs(Long ts){
		this.ts = ts;
	}

	public Long getTs(){
		return ts;
	}

	@Override
 	public String toString(){
		return 
			"ObservedMaxBlockingLoaf{" + 
			"args = '" + args + '\'' + 
			",id2 = '" + id2 + '\'' + 
			",cat = '" + cat + '\'' + 
			",scope = '" + scope + '\'' + 
			",name = '" + name + '\'' + 
			",ph = '" + ph + '\'' + 
			",pid = '" + pid + '\'' + 
			",tid = '" + tid + '\'' + 
			",ts = '" + ts + '\'' + 
			"}";
		}
}