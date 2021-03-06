<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		String appId = request.getParameter("appId");
		String[] array = appId.split(";");
		String SQL = "SELECT apps.*, company.companyarea FROM apps, company"
				 + " WHERE apps.companyid = company.companyid AND apps.appid != 1";
		for (int i = 0; i < array.length; i++) {
			SQL = SQL + " AND apps.appid != " + array[i];
		};
		SQL = SQL + " ORDER BY apps.appid ASC";
		json = eDBManager.GetAppList(SQL);
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