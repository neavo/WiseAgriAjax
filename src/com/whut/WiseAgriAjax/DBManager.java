package com.whut.WiseAgriAjax;

import java.sql. * ;

public class DBManager {
	
	// JDBC连接数据库
	public Connection GetConnection() {
		Connection eConnection = null;
		try {
			String dbName = "zhnydb";
			String userName = "root";
			String userPasswd = "lxt";
			String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			eConnection = DriverManager.getConnection(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return eConnection;
	}
	
	// 获取字段的值
	public String GetValue(String SQL, String Key) {
		String data = "";
		
		System.out.println(SQL);
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				data = data + eResultSet.getString(Key);
			};
			
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return data;
	}
	
	// 获取客户端列表
	public String GetAppList(String SQL) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				json = json + "{";
				
				json = json + "\"" + "type" + "\"" + " : " + "\"" + "app" + "\"" + ",";
				json = json + "\"" + "id" + "\"" + " : " + "\"" + eResultSet.getString("appid") + "\"" + ",";
				json = json + "\"" + "name" + "\"" + " : " + "\"" + eResultSet.getString("appname") + "\"" + ",";
				json = json + "\"" + "iconUrl" + "\"" + " : " + "\"" + eResultSet.getString("imageurl1") + "\"" + ",";
				json = json + "\"" + "location" + "\"" + " : " + "\"" + eResultSet.getString("companyarea") + "\"" + ",";
				json = json + "\"" + "style" + "\"" + " : " + "\"" + "" + "\"" + ",";
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json;
	}
	
	// 获取频道列表
	public String GetCategoryList(String SQL) {
		String json = "[";
		
		try {
			
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				json = json + "{";
				
				json = json + "\"" + "type" + "\"" + " : " + "\"" + "category" + "\"" + ",";
				json = json + "\"" + "id" + "\"" + " : " + "\"" + eResultSet.getString("categoryid") + "\"" + ",";
				json = json + "\"" + "name" + "\"" + " : " + "\"" + eResultSet.getString("categoryname") + "\"" + ",";
				json = json + "\"" + "iconUrl" + "\"" + " : " + "\"" + eResultSet.getString("categoryimageurl") + "\"" + ",";
				json = json + "\"" + "location" + "\"" + " : " + "\"" + "" + "\"" + ",";
				
				if (eResultSet.getString("parentid").equals("0")) {
					json = json + "\"" + "style" + "\"" + " : " + "\"" + "parentCategory" + "\"" + ",";
				} else {
					String categoryStyle = eResultSet.getString("flag");
					if (categoryStyle.equals("0")) {
						json = json + "\"" + "style" + "\"" + " : " + "\"" + "newsCategory" + "\"" + ",";
					};
					if (categoryStyle.equals("1") || categoryStyle.equals("2")) {
						json = json + "\"" + "style" + "\"" + " : " + "\"" + "SnBCategory" + "\"" + ",";
					};
					if (categoryStyle.equals("3")) {
						json = json + "\"" + "style" + "\"" + " : " + "\"" + "QnACategory" + "\"" + ",";
					};
					if (categoryStyle.equals("7")) {
						json = json + "\"" + "style" + "\"" + " : " + "\"" + "DoSnB" + "\"" + ",";
					};
					if (categoryStyle.equals("8")) {
						json = json + "\"" + "style" + "\"" + " : " + "\"" + "DoQnA" + "\"" + ",";
					};
				};
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json;
	}
	
	// 获取新闻列表
	public String GetNewsList(String SQL) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				json = json + "{";
				
				json = json + "\"" + "categoryId" + "\"" + " : " + "\"" + eResultSet.getString("categoryid") + "\"" + ",";
				json = json + "\"" + "newsTitle" + "\"" + " : " + "\"" + eResultSet.getString("title") + "\"" + ",";
				json = json + "\"" + "newsPublisher" + "\"" + " : " + "\"" + eResultSet.getString("publisher") + "\"" + ",";
				json = json + "\"" + "dateTime" + "\"" + " : " + "\"" + eResultSet.getString("datetime") + "\"" + ",";
				json = json + "\"" + "iconUrl" + "\"" + " : " + "\"" + eResultSet.getString("imageurl1") + "\"" + ",";
				json = json + "\"" + "videoUrl" + "\"" + " : " + "\"" + eResultSet.getString("videourl") + "\"" + ",";
				json = json + "\"" + "imageUrl" + "\"" + " : " + "\"" + eResultSet.getString("imageurlall") + "\"" + ",";
				json = json + "\"" + "newsContent" + "\"" + " : " + "\"" + eResultSet.getString("textcontent") + "\"" + ",";
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json;
	}
	
	// 获取供求信息
	public String GetSnBList(String SQL) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				json = json + "{";
				
				json = json + "\"" + "SnBTitle" + "\"" + " : " + "\"" + eResultSet.getString("title") + "\"" + ",";
				json = json + "\"" + "SnBPublisher" + "\"" + " : " + "\"" + eResultSet.getString("publisher") + "\"" + ",";
				json = json + "\"" + "SnBPrice" + "\"" + " : " + "\"" + eResultSet.getString("price") + "\"" + ",";
				json = json + "\"" + "SnBArea" + "\"" + " : " + "\"" + eResultSet.getString("area") + "\"" + ",";
				json = json + "\"" + "SnBImage" + "\"" + " : " + "\"" + eResultSet.getString("imageurl1") + "\"" + ",";
				json = json + "\"" + "SnBTime" + "\"" + " : " + "\"" + eResultSet.getString("publishtime") + "\"" + ",";
				json = json + "\"" + "SnBPhone" + "\"" + " : " + "\"" + eResultSet.getString("telephone") + "\"" + ",";
				json = json + "\"" + "SnBContent" + "\"" + " : " + "\"" + eResultSet.getString("content") + "\"" + ",";
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json;
	}
	
	// 发布供求信息
	public int DoSnB(String SQL) {
		int record = 0;
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			record = eStatement.executeUpdate(SQL);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return record;
	}
	
}
