<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		String appId = request.getParameter("appId");
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
		
		String SQL = "SELECT"
			 + " comment.comment AS QContent, comment.publishtime AS QTime,"
			 + " feedback.content AS AContent, feedback.publishtime AS ATime"
			 + " FROM comment, feedback"
			 + " WHERE comment.commentid = feedback.commentid AND comment.appid = " + appId
			 + " ORDER BY comment.publishtime DESC"
			 + " LIMIT " + start + ", " + limit;
		
		json = eDBManager.GetFeedBack(SQL); 
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