<%@ page language = "java" contentType = "text/html; charset=utf-8" 
pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		String categoryId = request.getParameter("categoryId");
		String SQL = "SELECT"
				+ " websitelink AS WebLink"
				+ " FROM"
				+ " categorylink"
				+ " WHERE"
				+ " categoryId = " + categoryId;
		json = eDBManager.GetWebLink(SQL); 
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