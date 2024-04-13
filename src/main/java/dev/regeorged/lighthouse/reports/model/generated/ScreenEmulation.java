package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreenEmulation{

	@JsonProperty("mobile")
	private Boolean mobile;

	@JsonProperty("width")
	private Integer width;

	@JsonProperty("deviceScaleFactor")
	private Object deviceScaleFactor;

	@JsonProperty("disabled")
	private Boolean disabled;

	@JsonProperty("height")
	private Integer height;

	public void setMobile(Boolean mobile){
		this.mobile = mobile;
	}

	public Boolean isMobile(){
		return mobile;
	}

	public void setWidth(Integer width){
		this.width = width;
	}

	public Integer getWidth(){
		return width;
	}

	public void setDeviceScaleFactor(Object deviceScaleFactor){
		this.deviceScaleFactor = deviceScaleFactor;
	}

	public Object getDeviceScaleFactor(){
		return deviceScaleFactor;
	}

	public void setDisabled(Boolean disabled){
		this.disabled = disabled;
	}

	public Boolean isDisabled(){
		return disabled;
	}

	public void setHeight(Integer height){
		this.height = height;
	}

	public Integer getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"ScreenEmulation{" + 
			"mobile = '" + mobile + '\'' + 
			",width = '" + width + '\'' + 
			",deviceScaleFactor = '" + deviceScaleFactor + '\'' + 
			",disabled = '" + disabled + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}