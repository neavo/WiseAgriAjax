<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		String categoryId = request.getParameter("categoryId");
		String appId = eDBManager.GetValue("SELECT appid FROM categorys WHERE categoryid = " + categoryId + " LIMIT 1", "appid");
		String SQL = "SELECT typeid AS value, typename AS text"
				+ " FROM publishtype"
				+ " WHERE appid = " + appId
				+ " ORDER BY typeid ASC";
		json = eDBManager.GetSnBType(SQL);
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