<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.DBManager" %>
<%

	String json = "";
	try {
		DBManager eDBManager = new DBManager();
		
		String newsId = request.getParameter("newsId");
		
		int SkimNum = Integer.parseInt(eDBManager.GetValue("SELECT skimnum FROM newscontent WHERE id = " + newsId + " LIMIT 1", "skimnum"));
		
		String SQL = "UPDATE newscontent SET skimnum = " + (SkimNum+1) + " WHERE id = " + newsId;
		
		eDBManager.DoInsert(SQL);

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