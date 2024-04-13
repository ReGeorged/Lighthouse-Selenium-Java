package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location{

	@JsonProperty("line")
	private Integer line;

	@JsonProperty("urlProvider")
	private String urlProvider;

	@JsonProperty("column")
	private Integer column;

	@JsonProperty("type")
	private String type;

	@JsonProperty("url")
	private String url;

	public void setLine(Integer line){
		this.line = line;
	}

	public Integer getLine(){
		return line;
	}

	public void setUrlProvider(String urlProvider){
		this.urlProvider = urlProvider;
	}

	public String getUrlProvider(){
		return urlProvider;
	}

	public void setColumn(Integer column){
		this.column = column;
	}

	public Integer getColumn(){
		return column;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Location{" + 
			"line = '" + line + '\'' + 
			",urlProvider = '" + urlProvider + '\'' + 
			",column = '" + column + '\'' + 
			",type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}