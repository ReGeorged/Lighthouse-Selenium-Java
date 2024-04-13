package dev.regeorged.lighthouse.reports.model.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoundingRect{

	@JsonProperty("top")
	private Integer top;

	@JsonProperty("left")
	private Integer left;

	@JsonProperty("bottom")
	private Integer bottom;

	@JsonProperty("width")
	private Integer width;

	@JsonProperty("right")
	private Integer right;

	@JsonProperty("height")
	private Integer height;

	public void setTop(Integer top){
		this.top = top;
	}

	public Integer getTop(){
		return top;
	}

	public void setLeft(Integer left){
		this.left = left;
	}

	public Integer getLeft(){
		return left;
	}

	public void setBottom(Integer bottom){
		this.bottom = bottom;
	}

	public Integer getBottom(){
		return bottom;
	}

	public void setWidth(Integer width){
		this.width = width;
	}

	public Integer getWidth(){
		return width;
	}

	public void setRight(Integer right){
		this.right = right;
	}

	public Integer getRight(){
		return right;
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
			"BoundingRect{" + 
			"top = '" + top + '\'' + 
			",left = '" + left + '\'' + 
			",bottom = '" + bottom + '\'' + 
			",width = '" + width + '\'' + 
			",right = '" + right + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}