package com.whut.ZhiHuiBean;

/**
 * Apps entity. @author MyEclipse Persistence Tools
"QnAType" + "\"" + " : " + "\"" + eResultSet.getString("QnAType") + "\"" + ",";
"QContent" + "\"" + " : " + "\"" + eResultSet.getString("QContent") + "\"" + ",";
"QPublisher" + "\"" + " : " + "\"" + eResultSet.getString("QPublisher") + "\"" + ",";
"QPhone" + "\"" + " : " + "\"" + eResultSet.getString("QPhone") + "\"" + ",";
"QTime" + "\"" + " : " + "\"" + eResultSet.getString("QTime") + "\"" + ",";
"QImage" + "\"" + " : " + "\"" + eResultSet.getString("QImage") + "\"" + ",";
"AContent" + "\"" + " : " + "\"" + eResultSet.getString("AContent") + "\"" + ",";
"APublisher" + "\"" + " : " + "\"" + eResultSet.getString("APublisher") + "\"" + ",";
"APhone" + "\"" + " : " + "\"" + eResultSet.getString("APhone") + "\"" + ",";
"ATime" + "\"" + " : " + "\"" + eResultSet.getString("ATime") + "\"" + ",";
"AImage" + "\"" + " : " + "\"" + eResultSet.getString("AImage") + "\"" + ",";

 * 
 */

public class Question implements java.io.Serializable {

	// Fields
	private String QnAType;
	private String QContent;
	private String QPublisher;
	private String QPhone;
	private String QTime;
	private String QImage;
	private String AContent;
	private String APublisher;
	private String APhone;
	private String ATime;
	private String AImage;
	public String getQnAType() {
		return QnAType;
	}
	public void setQnAType(String qnAType) {
		QnAType = qnAType;
	}
	public String getQContent() {
		return QContent;
	}
	public void setQContent(String qContent) {
		QContent = qContent;
	}
	public String getQPublisher() {
		return QPublisher;
	}
	public void setQPublisher(String qPublisher) {
		QPublisher = qPublisher;
	}
	public String getQPhone() {
		return QPhone;
	}
	public void setQPhone(String qPhone) {
		QPhone = qPhone;
	}
	public String getQTime() {
		return QTime;
	}
	public void setQTime(String qTime) {
		QTime = qTime;
	}
	public String getQImage() {
		return QImage;
	}
	public void setQImage(String qImage) {
		QImage = qImage;
	}
	public String getAContent() {
		return AContent;
	}
	public void setAContent(String aContent) {
		AContent = aContent;
	}
	public String getAPublisher() {
		return APublisher;
	}
	public void setAPublisher(String aPublisher) {
		APublisher = aPublisher;
	}
	public String getAPhone() {
		return APhone;
	}
	public void setAPhone(String aPhone) {
		APhone = aPhone;
	}
	public String getATime() {
		return ATime;
	}
	public void setATime(String aTime) {
		ATime = aTime;
	}
	public String getAImage() {
		return AImage;
	}
	public void setAImage(String aImage) {
		AImage = aImage;
	}

	// Constructors

}