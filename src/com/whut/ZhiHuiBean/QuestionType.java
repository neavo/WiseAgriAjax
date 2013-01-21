package com.whut.ZhiHuiBean;

public class QuestionType implements java.io.Serializable {
	
	private static final long serialVersionUID = 3042103233970328248L;
	
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
