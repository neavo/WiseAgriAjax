<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" 
import = "com.whut.WiseAgriAjax.WebService,java.util.Date,java.text.SimpleDateFormat" %>
<!-- 函数名：GetNewsList
传入的参数
名称	类型	说明	备注
BeginDate	datetime	开始时间	以创建时间为准
EndDate	datetime	结束时间	以创建时间为准
PageIndex	int	当前页数	
PageSize	int	当前条数	
KeyWord	String	搜索关键字

SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String publishtime=dateformat.format(new Date());

	 -->

<%

	String json = "";
	try {
		WebService ws = new WebService();
		Date date = new Date();
		
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = dateformat.format(date);
		//String endDate=dateformat.format(date);
		//date = ws.getDateBefore(date, 10);//从十天前开始
		//String startDate=dateformat.format(date);
		
		
		String categoryId = request.getParameter("categoryId");
		int start = Integer.parseInt(request.getParameter("start"));
		int limit = Integer.parseInt(request.getParameter("limit"));
/* 		String SQL = "SELECT * FROM newscontent"
				+ " WHERE level = 1 "
				+ " AND categoryid = " + categoryId
				+ " ORDER BY datetime DESC"
				+ " LIMIT " + start + ", " + limit; */
/* 			对应关系	pageIndex * pageSize = start; pageIndex从第一页开始
					pageSize = limit; */
		json = new WebService().GetNewsList(start/limit+1, limit, "2010-01-01", today); 

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