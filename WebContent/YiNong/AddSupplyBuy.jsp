<%@ page language = "java" contentType = "text/html; charset=utf-8" pageEncoding = "utf-8" import = "com.whut.WiseAgriAjax.*" %>
<%

	String json = "";
	int rec = 0;
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
		
			String ePage = request.getParameter("page") != "" ? request.getParameter("page") : "1";
			String eLimit = request.getParameter("limit") != "" ? request.getParameter("limit") : "999";
			String eKeyWord = request.getParameter("keyWord");
			
			int flag = Integer.parseInt(SnBFlag) - 1;
			String mid = "";//发布人会员编号
			String productName = request.getParameter("SnBTitle");//产品名称
			String lowPrice = request.getParameter("SnBPrice");//最高价
			String highPrice = request.getParameter("SnBPrice");//最低价
			String isDiscuss = "1";//1:面议  0:有薪资范围
			String productPlaceId = "";//上传供应信息时需要此参数,求购时不需要
			String productDesc = request.getParameter("SnBContent");//产品描述
			String beginTime = request.getParameter("SnBTime");//有效时间-开始时间
			String endTime = "";//有效时间-开始时间
			String contactPhone = request.getParameter("SnBPhone");//联系电话
			String contactName = request.getParameter("SnBPublisher");//联系人
			
			rec = new WebService().AddSupplyBuy(flag, mid, productName, 
								lowPrice, highPrice, isDiscuss, 
								productPlaceId, productDesc, beginTime, endTime,
								contactPhone, contactName);
						 
			if (rec != 0) {
			json = "{ \"success\" : \"true\", \"msg\" : \"发布成功\"}";
			}
			else {
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