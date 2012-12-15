package com.whut.ZhiHuiBean;

/**
 * Newscontent entity. @author MyEclipse Persistence Tools
 * 
"categoryId" + "\"" + " : " + "\"" + eResultSet.getString("categoryid") + "\"" + ",";
"newsTitle" + "\"" + " : " + "\"" + eResultSet.getString("title") + "\"" + ",";
"newsPublisher" + "\"" + " : " + "\"" + eResultSet.getString("publisher") + "\"" + ",";
"dateTime" + "\"" + " : " + "\"" + eResultSet.getString("datetime") + "\"" + ",";
"iconUrl" + "\"" + " : " + "\"" + eResultSet.getString("imageurl1") + "\"" + ",";
"videoUrl" + "\"" + " : " + "\"" + eResultSet.getString("videourl") + "\"" + ",";
"imageUrl" + "\"" + " : " + "\"" + eResultSet.getString("imageurlall") + "\"" + ",";
"newsContent" + "\"" + " : " + "\"" + eResultSet.getString("textcontent") + "\"" + ",";
 * 
 */

public class News implements java.io.Serializable {

	// Fields

	private String categoryId;
	private String newsTitle;
	private String newsPublisher;
	private String dateTime;
	private String iconUrl;
	private String videoUrl;
	private String imageUrl;
	private String newsContent;
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsPublisher() {
		return newsPublisher;
	}
	public void setNewsPublisher(String newsPublisher) {
		this.newsPublisher = newsPublisher;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}



}