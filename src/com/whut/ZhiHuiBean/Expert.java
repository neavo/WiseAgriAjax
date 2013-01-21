package com.whut.ZhiHuiBean;

public class Expert implements java.io.Serializable {
	
	private static final long serialVersionUID = 4388324246940846239L;
	
	private String ExName;
	private String ExImage;
	private String ExTitle;
	private String ExPosition;
	private String ExPhone;
	private String ExConent;
	
	public String getExName() {
		return ExName;
	}
	public void setExName(String exName) {
		ExName = exName;
	}
	public String getExImage() {
		return ExImage;
	}
	public void setExImage(String exImage) {
		ExImage = exImage;
	}
	public String getExTitle() {
		return ExTitle;
	}
	public void setExTitle(String exTitle) {
		ExTitle = exTitle;
	}
	public String getExPosition() {
		return ExPosition;
	}
	public void setExPosition(String exPosition) {
		ExPosition = exPosition;
	}
	public String getExPhone() {
		return ExPhone;
	}
	public void setExPhone(String exPhone) {
		ExPhone = exPhone;
	}
	public String getExConent() {
		return ExConent;
	}
	public void setExConent(String exConent) {
		ExConent = exConent;
	}
	
}
