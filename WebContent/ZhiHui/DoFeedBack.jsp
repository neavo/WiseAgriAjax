<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		
		String QContent = request.getParameter("QContent");
		String QnATime = request.getParameter("QTime");
		String appId = request.getParameter("appId");
		
		String SQL = "INSERT INTO comment"
			 + " ( "
			 + " comment, publishtime, appid"
			 + " ) "
			 + " VALUES"
			 + " ( "
			 + " \"" + QContent + "\"," + " \"" + QnATime + "\", " + " \"" + appId + "\""
			 + " ) ";
		
		if (eDBManager.DoFeedBack(SQL) != 0) {
			json = "{ \"success\" : \"true\", \"msg\" : \"发布成功\"}";
		} else {
			json = "{ \"success\" : \"false\", \"msg\" : \"发布失败\"}";
		};
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