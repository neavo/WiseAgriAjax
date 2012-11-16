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
	
	// 获取客户端列表
	public String GetAppList(String sql) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(sql);
			while (eResultSet.next()) {
				json = json + "{";
				if (eResultSet.getString("appid") != null) {
					json = json + "\"" + "appId" + "\"" + " : " + "\"" + eResultSet.getString("appid") + "\"" + ",";
				};
				if (eResultSet.getString("companyarea") != null) {
					json = json + "\"" + "appLocation" + "\"" + " : " + "\"" + eResultSet.getString("companyarea") + "\"" + ",";
				};
				if (eResultSet.getString("appname") != null) {
					json = json + "\"" + "appName" + "\"" + " : " + "\"" + eResultSet.getString("appname") + "\"" + ",";
				};
				if (eResultSet.getString("imageurl1") != null) {
					json = json + "\"" + "appIconUrl" + "\"" + " : " + "\"" + eResultSet.getString("imageurl1") + "\"" + ",";
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
	
	// 获取频道列表
	public String GetCategoryList(String sql) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(sql);
			while (eResultSet.next()) {
				json = json + "{";
				if (eResultSet.getString("appid") != null) {
					json = json + "\"" + "appId" + "\"" + " : " + "\"" + eResultSet.getString("appid") + "\"" + ",";
				};
				if (eResultSet.getString("categoryid") != null) {
					json = json + "\"" + "categoryId" + "\"" + " : " + "\"" + eResultSet.getString("categoryid") + "\"" + ",";
				};
				if (eResultSet.getString("categoryname") != null) {
					json = json + "\"" + "categoryName" + "\"" + " : " + "\"" + eResultSet.getString("categoryname") + "\"" + ",";
				};
				if (eResultSet.getString("categoryimageurl") != null) {
					json = json + "\"" + "categoryIconUrl" + "\"" + " : " + "\"" + eResultSet.getString("categoryimageurl") + "\"" + ",";
				};
				if (eResultSet.getString("parentid").equals("0")) {
					json = json + "\"" + "categoryStyle" + "\"" + " : " + "\"" + "parentCategory" + "\"" + ",";
				} else {
					if (eResultSet.getString("flag") != null) {
						String categoryStyle = eResultSet.getString("flag");
						if (categoryStyle.equals("00")) {
							json = json + "\"" + "categoryStyle" + "\"" + " : " + "\"" + "newsCategory" + "\"" + ",";
						};
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
	public String GetNewsList(String sql) {
		String json = "[";
		
		try {
			Connection eConnection = GetConnection();
			Statement eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(sql);
			while (eResultSet.next()) {
				json = json + "{";
				
				if (eResultSet.getString("categoryid") != null) {
					json = json + "\"" + "categoryId" + "\"" + " : " + "\"" + eResultSet.getString("categoryid") + "\"" + ",";
				};
				if (eResultSet.getString("title") != null) {
					json = json + "\"" + "newsTitle" + "\"" + " : " + "\"" + eResultSet.getString("title") + "\"" + ",";
				};
				if (eResultSet.getString("publisher") != null) {
					json = json + "\"" + "newsPublisher" + "\"" + " : " + "\"" + eResultSet.getString("publisher") + "\"" + ",";
				};
				if (eResultSet.getString("datetime") != null) {
					json = json + "\"" + "dateTime" + "\"" + " : " + "\"" + eResultSet.getString("datetime") + "\"" + ",";
				};
				if (eResultSet.getString("imageurl1") != null) {
					json = json + "\"" + "iconUrl" + "\"" + " : " + "\"" + eResultSet.getString("imageurl1") + "\"" + ",";
				};
				if (eResultSet.getString("videourl") != null) {
					json = json + "\"" + "videoUrl" + "\"" + " : " + "\"" + eResultSet.getString("videourl") + "\"" + ",";
				};
				if (eResultSet.getString("imageurlall") != null) {
					json = json + "\"" + "imageUrl" + "\"" + " : " + "\"" + eResultSet.getString("imageurlall") + "\"" + ",";
				};
				if (eResultSet.getString("textcontent") != null) {
					json = json + "\"" + "newsContent" + "\"" + " : " + "\"" + eResultSet.getString("textcontent") + "\"" + ",";
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
	
}
