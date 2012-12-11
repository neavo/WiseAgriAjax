<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		
		String SnBTitle = request.getParameter("SnBTitle");
		String SnBPublisher = request.getParameter("SnBPublisher");
		String SnBPrice = request.getParameter("SnBPrice");
		String SnBArea = request.getParameter("SnBArea");
		String SnBTime = request.getParameter("SnBTime");
		String SnBPhone = request.getParameter("SnBPhone");
		String SnBContent = request.getParameter("SnBContent");
		String SnBCID = request.getParameter("SnBCID");
		String SnBFlag = request.getParameter("SnBFlag");
		String SnBType = request.getParameter("SnBType");
		String appid = eDBManager.GetValue("SELECT appid FROM categorys WHERE categoryid = " + SnBCID + " LIMIT 1", "appid");
		String categoryid = eDBManager.GetValue("SELECT categoryid FROM categorys WHERE parentid !=0 AND flag = " + SnBFlag + " AND appid  = " + appid + " LIMIT 1", "categoryid");
		
		String SQL = "INSERT INTO publish"
			 + " ( "
			 + " title, publisher, price, area, "
			 + " publishtime, telephone, content, categoryid, "
			 + " appid, category, typeid "
			 + " ) "
			 + " VALUES"
			 + " ( "
			 + " \"" + SnBTitle + "\"," + " \"" + SnBPublisher + "\"," + " \"" + SnBPrice + "\"," + " \"" + SnBArea + "\", "
			 + " \"" + SnBTime + "\"," + " \"" + SnBPhone + "\"," + " \"" + SnBContent + "\"," + " \"" + categoryid + "\", "
			 + " \"" + appid + "\"," + " \"" + (Integer.parseInt(SnBFlag) - 1) + "\"," + " \"" + SnBType + "\""
			 + " ) ";
		
		if (eDBManager.DoSnB(SQL) != 0) {
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