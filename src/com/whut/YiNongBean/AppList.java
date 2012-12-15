package com.whut.YiNongBean;

public class AppList {
	int categoryId;//目标频道id
	int categoryName;//目标频道名称
	String iconUrl;//目标频道图标
	String trialTime;//目标频道试用时间
	String categoryPrice;//目标频道价格
	String description;//目标频道描述
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(int categoryName) {
		this.categoryName = categoryName;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getTrialTime() {
		return trialTime;
	}
	public void setTrialTime(String trialTime) {
		this.trialTime = trialTime;
	}
	public String getCategoryPrice() {
		return categoryPrice;
	}
	public void setCategoryPrice(String categoryPrice) {
		this.categoryPrice = categoryPrice;
	} 

}
