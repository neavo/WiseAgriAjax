<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		
		String QPublisher = request.getParameter("QPublisher");
		String QPhone = request.getParameter("QPhone");
		String QContent = request.getParameter("QContent");
		String QTime = request.getParameter("QTime");
		String QCID = request.getParameter("QCID");
		String QnAType = request.getParameter("QnAType");
		String QnAExpert = request.getParameter("QnAExpert");
		String appid = eDBManager.GetValue("SELECT appid FROM categorys WHERE categoryid = " + QCID + " LIMIT 1", "appid");
		String categoryid = eDBManager.GetValue("SELECT categoryid FROM categorys WHERE parentid !=0 AND flag = 3  AND appid  = " + appid + " LIMIT 1", "categoryid");
		
		String SQL = "INSERT INTO question"
			 + " ( "
			 + " publisher, telephone, question, publishtime,"
			 + " expertid, appid, categoryid, questiontype"
			 + " ) "
			 + " VALUES"
			 + " ( "
			 + " \"" + QPublisher + "\"," + " \"" + QPhone + "\"," + " \"" + QContent + "\"," + " \"" + QTime + "\", "
			 + " \"" + QnAExpert + "\"," + " \"" + appid + "\"," + " \"" + categoryid + "\"," + " \"" + QnAType + "\""
			 + " ) ";
		
		if (eDBManager.DoInsert(SQL) != 0) { 
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