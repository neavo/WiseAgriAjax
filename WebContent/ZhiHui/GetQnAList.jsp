<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		String categoryId = request.getParameter("categoryId");
		String appId = eDBManager.GetValue("SELECT appid FROM categorys WHERE categoryid = " + categoryId + " LIMIT 1", "appid");
		String SQL = "SELECT"
			 + " publishtype.typename AS QnAType,"
			 + " question.question AS QContent, question.publisher AS QPublisher, question.telephone AS QPhone, question.publishtime AS QTime, question.imageurl1 AS QImage,"
			 + " answer.answer AS AContent, answer.publisher AS APublisher, answer.telephone AS APhone, answer.publishtime AS ATime, answer.imageurl1 AS AImage"
			 + " FROM question, answer, publishtype"
			 + " WHERE question.questionid = answer.questionid AND question.questiontype = publishtype.typeid AND question.appid = " + appId
			 + " ORDER BY question.publishtime DESC";
		json = eDBManager.GetQnAList(SQL);
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