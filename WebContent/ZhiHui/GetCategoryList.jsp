<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		String appId = request.getParameter("appId");
		String parentId = request.getParameter("parentId");
		String SQL = "";
		System.out.println(appId + ", " + parentId);
		
		
		if (appId != "" && appId != null) {
			SQL = "SELECT * FROM categorys WHERE appid = "
				 + appId
				 + " AND ( parentid = -1 OR parentid = 0 ) "
				 + " ORDER BY categoryid ASC";
		};
		if (parentId != "" && parentId != null) {
			SQL = "SELECT * FROM categorys WHERE parentid = "
				 + parentId
				 + " ORDER BY categoryid ASC";
		};
		json = eDBManager.GetCategoryList(SQL);
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