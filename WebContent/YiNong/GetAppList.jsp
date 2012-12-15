<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.WebService" %>
<%

	String json = "";
	try {
		String ePage = request.getParameter("page") != "" ? request.getParameter("page") : "1";
		String eLimit = request.getParameter("limit") != "" ? request.getParameter("limit") : "999";
		String eKeyWord = request.getParameter("keyWord");
		json = new WebService().GetAppList(ePage, eLimit, eKeyWord);
	} catch (Exception e) {
		System.out.println("jsp"+e.getMessage());
	};
	
	if (request.getParameter("callback") != null) {
		response.setContentType("text/javascript;charset=UTF-8");
		response.getWriter().write(request.getParameter("callback") + "(" + json + ");");
	} else {
		response.setContentType("application/x-json;charset=UTF-8");
		response.getWriter().write(json);
	};

 %>