package com.whut.WiseAgriAjax;

import com.YiNong.WebService.AppAgent;
import com.YiNong.WebService.AppAgentSoap;

public class WebService {
	
	// 获取翼农App列表
	public String GetAppList(String page, String limit, String keyWord) {
		String json = "";
		
		int ePage = Integer.parseInt(page);
		int eLimit = Integer.parseInt(limit);
		String eKeyWord = keyWord;
		
		try {
			AppAgentSoap eAppAgentSoap = new AppAgent().getAppAgentSoap();
			json = eAppAgentSoap.getAppList(ePage, eLimit, eKeyWord);
			json = json.replace("categoryId", "id");
			json = json.replace("categoryName", "name");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return json;
	}
	
}
