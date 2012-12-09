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
		
		return data.replace("null", "");
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
		return json.replace("null", "");
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
					if (categoryStyle.equals("4")) {
						json = json + "\"" + "style" + "\"" + " : " + "\"" + "ExCategory" + "\"" + ",";
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
		return json.replace("null", "");
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
		return json.replace("null", "");
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
				
				json = json + "\"" + "SnBType" + "\"" + " : " + "\"" + eResultSet.getString("SnBType") + "\"" + ",";
				json = json + "\"" + "SnBTitle" + "\"" + " : " + "\"" + eResultSet.getString("SnBTitle") + "\"" + ",";
				json = json + "\"" + "SnBPublisher" + "\"" + " : " + "\"" + eResultSet.getString("SnBPublisher") + "\"" + ",";
				json = json + "\"" + "SnBPrice" + "\"" + " : " + "\"" + eResultSet.getString("SnBPrice") + "\"" + ",";
				json = json + "\"" + "SnBArea" + "\"" + " : " + "\"" + eResultSet.getString("SnBArea") + "\"" + ",";
				json = json + "\"" + "SnBImage" + "\"" + " : " + "\"" + eResultSet.getString("SnBImage") + "\"" + ",";
				json = json + "\"" + "SnBTime" + "\"" + " : " + "\"" + eResultSet.getString("SnBTime") + "\"" + ",";
				json = json + "\"" + "SnBPhone" + "\"" + " : " + "\"" + eResultSet.getString("SnBPhone") + "\"" + ",";
				json = json + "\"" + "SnBContent" + "\"" + " : " + "\"" + eResultSet.getString("SnBContent") + "\"" + ",";
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json.replace("null", "");
	}
	
	// 获取供求信息类型
	public String GetSnBType(String SQL) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				json = json + "{";
				
				json = json + "\"" + "text" + "\"" + " : " + "\"" + eResultSet.getString("text") + "\"" + ",";
				json = json + "\"" + "value" + "\"" + " : " + "\"" + eResultSet.getString("value") + "\"" + ",";
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json.replace("null", "");
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
	
	// 获取问答信息
	public String GetQnAList(String SQL) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				json = json + "{";
				
				json = json + "\"" + "QnAType" + "\"" + " : " + "\"" + eResultSet.getString("QnAType") + "\"" + ",";
				json = json + "\"" + "QContent" + "\"" + " : " + "\"" + eResultSet.getString("QContent") + "\"" + ",";
				json = json + "\"" + "QPublisher" + "\"" + " : " + "\"" + eResultSet.getString("QPublisher") + "\"" + ",";
				json = json + "\"" + "QPhone" + "\"" + " : " + "\"" + eResultSet.getString("QPhone") + "\"" + ",";
				json = json + "\"" + "QTime" + "\"" + " : " + "\"" + eResultSet.getString("QTime") + "\"" + ",";
				json = json + "\"" + "QImage" + "\"" + " : " + "\"" + eResultSet.getString("QImage") + "\"" + ",";
				json = json + "\"" + "AContent" + "\"" + " : " + "\"" + eResultSet.getString("AContent") + "\"" + ",";
				json = json + "\"" + "APublisher" + "\"" + " : " + "\"" + eResultSet.getString("APublisher") + "\"" + ",";
				json = json + "\"" + "APhone" + "\"" + " : " + "\"" + eResultSet.getString("APhone") + "\"" + ",";
				json = json + "\"" + "ATime" + "\"" + " : " + "\"" + eResultSet.getString("ATime") + "\"" + ",";
				json = json + "\"" + "AImage" + "\"" + " : " + "\"" + eResultSet.getString("AImage") + "\"" + ",";
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json.replace("null", "");
	}
	
	// 获取问答信息类型
	public String GetQnAType(String SQL) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				json = json + "{";
				
				json = json + "\"" + "text" + "\"" + " : " + "\"" + eResultSet.getString("text") + "\"" + ",";
				json = json + "\"" + "value" + "\"" + " : " + "\"" + eResultSet.getString("value") + "\"" + ",";
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json.replace("null", "");
	}
	
	// 发布问答信息
	public int DoQnA(String SQL) {
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
	
	// 获取专家列表
	public String GetExList(String SQL) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				json = json + "{";
				
				json = json + "\"" + "ExName" + "\"" + " : " + "\"" + eResultSet.getString("ExName") + "\"" + ",";
				json = json + "\"" + "ExImage" + "\"" + " : " + "\"" + eResultSet.getString("ExImage") + "\"" + ",";
				json = json + "\"" + "ExTitle" + "\"" + " : " + "\"" + eResultSet.getString("ExTitle") + "\"" + ",";
				json = json + "\"" + "ExPosition" + "\"" + " : " + "\"" + eResultSet.getString("ExPosition") + "\"" + ",";
				json = json + "\"" + "ExPhone" + "\"" + " : " + "\"" + eResultSet.getString("ExPhone") + "\"" + ",";
				json = json + "\"" + "ExConent" + "\"" + " : " + "\"" + eResultSet.getString("ExConent") + "\"" + ",";
				
				json = json + "},";
			};
			eStatement.close();
			eConnection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		json = json + "]";
		return json.replace("null", "");
	}
	
}
