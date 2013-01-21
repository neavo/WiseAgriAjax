package com.whut.ZhiHuiBean;

public class App implements java.io.Serializable {
	
	private static final long serialVersionUID = 650798469214046662L;
	
	private String type;
	private String id;
	private String name;
	private String iconUrl;
	private String location;
	private String style;
	
	public String getAppid() {
		return this.id;
	}
	
	public void setAppid(String id) {
		this.id = id;
	}
	
	public String getAppname() {
		return this.name;
	}
	
	public void setAppname(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIconUrl() {
		return iconUrl;
	}
	
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	
	public String getStyle() {
		return style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getImageurl1() {
		return this.iconUrl;
	}
	
	public void setImageurl1(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	
}
