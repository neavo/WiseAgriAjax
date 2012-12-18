<%@ page language = "java" contentType = "text/html; charset=utf-8" 
pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		String categoryId = request.getParameter("categoryId");
		String appId = eDBManager.GetValue("SELECT appid FROM categorys WHERE categoryid = " + categoryId + " LIMIT 1", "appid");
		String SQL = "SELECT"
			 + " name AS ExName, imageurl AS ExImage, title AS ExTitle,"
			 + " position AS ExPosition, telephone AS ExPhone, content AS ExConent"
			 + " FROM expert"
			 + " WHERE  level = 1  AND appid = " + appId
			 + " ORDER BY datetime DESC";
		json = eDBManager.GetExpertList(SQL); 
	} catch (Exception e) {
		System.out.println(e.getMessage());
	};
	
	if (request.getParameter("callback") != null) {
		response.setContentType("text/javascript;charset=UTF-8");
		response.getWriter().write(request.getParameter("callback") + "(" + json + ");");
	} else {
		response.setContentType("application/x-json;charset=UTF-8");
		response.getWriter().write(json);
	};

 %>