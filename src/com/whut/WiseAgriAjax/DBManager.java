package com.whut.WiseAgriAjax;
import java.sql. * ;
public class DBManager {
	
	// JDBC连接数据库
	public Connection GetConnection() {
		Connection eConnection = null;
		try {
			String dbName = "zhnydb";
			String userName = "root";
			String userPasswd = "";
			String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			eConnection = DriverManager.getConnection(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return eConnection;
	}
	
	// 获取App列表
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
	
}
