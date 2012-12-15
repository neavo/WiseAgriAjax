package com.whut.WiseAgriAjax;

import com.YiNong.WebService.AppAgent;
import com.YiNong.WebService.AppAgentSoap;

public class WebService {
	static AppAgentSoap eAppAgentSoap = new AppAgent().getAppAgentSoap();
	// 获取产品页数
	public String GetAppPage(int limit, String keyWord)
	{
		String json = "";
		try {
			
			json = json.replace("categoryId", "id");
			json = json.replace("categoryName", "name");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return json;		
	}
	
	// 获取翼农App列表  
	public static String GetAppList(String page, String limit, String keyWord) {
		String json = "";
		try {
			json = eAppAgentSoap.getAppList(Integer.parseInt(page), Integer.parseInt(limit), keyWord);
			json = json.replace("categoryId", "id");
			json = json.replace("categoryName", "name");
		} catch (Exception e) {
			System.out.println("here:"+e.getMessage());
		}
		return json;
	}
	
	//测试
	public static void main(String[] args) {
		System.out.println(GetAppList("1","999",""));
	}
	
}
//userLogin
