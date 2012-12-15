package com.whut.ZhiHuiBean;

/**
 * Apps entity. @author MyEclipse Persistence Tools
"text" + "\"" + " : " + "\"" + eResultSet.getString("text") + "\"" + ",";
"value" + "\"" + " : " + "\"" + eResultSet.getString("value") + "\"" + ",";
	

 * 
 */

public class SupplyBuyType implements java.io.Serializable {

	// Fields
	private String text;
	private String value;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}