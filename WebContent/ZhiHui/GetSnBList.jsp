<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		String categoryId = request.getParameter("categoryId");
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));

		String SQL = "SELECT"
			 + " publishtype.typename AS SnBType,"
			 + " publish.title AS SnBTitle, publish.publisher AS SnBPublisher, publish.price AS SnBPrice, publish.area AS SnBArea,"
			 + " publish.imageurl1 AS SnBImage, publish.publishtime AS SnBTime, publish.telephone AS SnBPhone, publish.content AS SnBContent"
			 + " FROM publish, publishtype"
			 + " WHERE publish.level = 1 AND publish.typeid = publishtype.typeid AND publish.categoryid = " + categoryId
			 + " ORDER BY publishtime DESC"
			 + " LIMIT " + start + ", " + limit;
			
		json = eDBManager.GetSnBList(SQL);
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