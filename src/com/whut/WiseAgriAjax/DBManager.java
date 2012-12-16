package com.whut.WiseAgriAjax;

import java.sql.* ;
import java.util.ArrayList;
import java.util.List;
import com.whut.ZhiHuiBean.*;
import org.apache.commons.dbutils.DbUtils;
import net.sf.json.JSONArray;

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
	
	public String GetValue(String SQL, String Key) {
		String data = "";
		Connection eConnection = null;
		Statement eStatement = null;
		ResultSet rs = null;

		try {
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				data = data + eResultSet.getString(Key);
			}
			data = data.replace("null", "");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return data;
	}
	
	// 获取客户端列表
	public String GetAppList(String SQL){
		String json = "";
		Connection eConnection = null;
		Statement eStatement = null;
		ResultSet rs = null;
		
	    List<App> apps = new ArrayList<App>();
	    App app = null;
		
		try {
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				app = new App();
			    app.setType("app");
			    app.setId(eResultSet.getString("appid"));
			    app.setName(eResultSet.getString("appname"));
			    app.setIconUrl(eResultSet.getString("imageurl1"));
			    app.setLocation(eResultSet.getString("companyarea"));
			    app.setStyle("");
			    apps.add(app);
			}
		    json = json + JSONArray.fromObject(apps).toString();
			json = json.replace("null", "");			
		}
		catch (Exception e)	{
			System.out.println(e.getMessage());
		} 
		finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return json;
	}
	
	// 获取频道列表
	
	public String GetCategoryList(String SQL) {
		String json = "";
		Connection eConnection = null;
		Statement eStatement = null;
		ResultSet rs = null;
		
	    List<Category> categorys = new ArrayList<Category>();
	    Category category = null;
		
		try {
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				category = new Category();
			    category.setType("category");
			    category.setId(eResultSet.getString("categoryid"));
			    category.setName(eResultSet.getString("categoryname"));
			    category.setIconUrl(eResultSet.getString("categoryimageurl"));
			    category.setLocation("");
			    
				if (eResultSet.getString("parentid").equals("0")) {
				    category.setStyle("parentCategory");
				} 
				else{
					String categoryStyle = eResultSet.getString("flag");
					if (categoryStyle.equals("0")){
					    category.setStyle("newsCategory");
					}
					if (categoryStyle.equals("1") || categoryStyle.equals("2")) {
					    category.setStyle("SnBCategory");
					}
					if (categoryStyle.equals("3")) {
					    category.setStyle("QnACategory");
					}
					if (categoryStyle.equals("7")) {
					    category.setStyle("DoSnB");
					}
					if (categoryStyle.equals("8")) {
					    category.setStyle("DoQnA");
					}
				}
			    categorys.add(category);
			}
		    json = json + JSONArray.fromObject(categorys).toString();
			json = json.replace("null", "");			
		}
		catch (Exception e)	{
			System.out.println(e.getMessage());
		} 
		finally {
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return json;
	}
	
	// 获取新闻列表
	public String GetNewsList(String SQL) {
		String json = "";
		Connection eConnection = null;
		Statement eStatement = null;
		ResultSet rs = null;
			
		List<News> news = new ArrayList<News>();
		News eNews = null;
			
		try{
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				eNews = new News();
				eNews.setCategoryId(eResultSet.getString("categoryid"));
				eNews.setNewsTitle(eResultSet.getString("title"));
				eNews.setNewsPublisher(eResultSet.getString("publisher"));
				eNews.setDateTime(eResultSet.getString("datetime"));
				eNews.setIconUrl(eResultSet.getString("imageurl1"));
				eNews.setVideoUrl(eResultSet.getString("videourl"));
				eNews.setImageUrl(eResultSet.getString("imageurlall"));
				eNews.setNewsContent(eResultSet.getString("textcontent"));
			    news.add(eNews);
			}
		    json = json + JSONArray.fromObject(news).toString();
			json = json.replace("null", "");			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		} 
		finally{
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return json;
	}
	
	// 获取供求信息
	public String GetSnBList(String SQL) {
		String json = "";
		Connection eConnection = null;
		Statement eStatement = null;
		ResultSet rs = null;
			
		List<SupplyBuy> supplybuys = new ArrayList<SupplyBuy>();
		SupplyBuy supplybuy = null;
			
		try{
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				supplybuy = new SupplyBuy();
				supplybuy.setSnBType(eResultSet.getString("SnBType"));
				supplybuy.setSnBTitle(eResultSet.getString("SnBTitle"));
				supplybuy.setSnBPublisher(eResultSet.getString("SnBPublisher"));
				supplybuy.setSnBPrice(eResultSet.getString("SnBPrice"));
				supplybuy.setSnBArea(eResultSet.getString("SnBArea"));
				supplybuy.setSnBImage(eResultSet.getString("SnBImage"));
				supplybuy.setSnBTime(eResultSet.getString("SnBTime"));
				supplybuy.setSnBPhone(eResultSet.getString("SnBPhone"));
				supplybuy.setSnBContent(eResultSet.getString("SnBContent"));
				supplybuys.add(supplybuy);
			}
		    json = json + JSONArray.fromObject(supplybuys).toString();
			json = json.replace("snB", "SnB");			
			json = json.replace("null", "");			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		} 
		finally{
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return json;
	}
	
	
	// 获取供求信息类型
	public String GetSnBType(String SQL) {
		String json = "";
		Connection eConnection = null;
		Statement eStatement = null;
		ResultSet rs = null;
			
		List<SupplyBuyType> supplybuytypes = new ArrayList<SupplyBuyType>();
		SupplyBuyType supplybuytype = null;
			
		try{
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				supplybuytype = new SupplyBuyType();
				supplybuytype.setText(eResultSet.getString("text"));
				supplybuytype.setValue(eResultSet.getString("value"));
				supplybuytypes.add(supplybuytype);
			}
		    json = json + JSONArray.fromObject(supplybuytypes).toString();
			json = json.replace("null", "");			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		} 
		finally{
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return json;
	}
	
	// 发布供求信息
	public int DoSnB(String SQL) {
		int record = 0;
		Connection eConnection = null;
		Statement eStatement = null;
		try{
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			record = eStatement.executeUpdate(SQL);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		} 
		finally{
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return record;
	}
	
	// 获取问答信息
	public String GetQnAList(String SQL) {
		String json = "";
		Connection eConnection = null;
		Statement eStatement = null;
		ResultSet rs = null;
			
		List<Question> questions = new ArrayList<Question>();
		Question question = null;
			
		try{
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				question = new Question();
				question.setQnAType(eResultSet.getString("QnAType"));
				question.setQContent(eResultSet.getString("QContent"));
				question.setQPublisher(eResultSet.getString("QPublisher"));
				question.setQPhone(eResultSet.getString("QPhone"));
				question.setQTime(eResultSet.getString("QTime"));
				question.setQImage(eResultSet.getString("QImage"));
				question.setAContent(eResultSet.getString("AContent"));
				question.setAPublisher(eResultSet.getString("APublisher"));
				question.setAPhone(eResultSet.getString("APhone"));
				question.setATime(eResultSet.getString("ATime"));
				question.setAImage(eResultSet.getString("AImage"));
				questions.add(question);
			}
		    json = json + JSONArray.fromObject(questions).toString();
			json = json.replace("null", "");			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		} 
		finally{
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return json;
		}
	
	// 获取问答信息类型
	public String GetQnAType(String SQL) {
		String json = "";
		Connection eConnection = null;
		Statement eStatement = null;
		ResultSet rs = null;
			
		List<QuestionType> questiontypes = new ArrayList<QuestionType>();
		QuestionType questiontype = null;
			
		try{
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			ResultSet eResultSet = eStatement.executeQuery(SQL);
			while (eResultSet.next()) {
				questiontype = new QuestionType();
				questiontype.setText(eResultSet.getString("text"));
				questiontype.setValue(eResultSet.getString("value"));
				questiontypes.add(questiontype);
			}
		    json = json + JSONArray.fromObject(questiontypes).toString();
			json = json.replace("null", "");			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		} 
		finally{
			DbUtils.closeQuietly(rs);
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return json;
	}
	
	// 发布问答信息
	public int DoQnA(String SQL) {
		int record = 0;
		Connection eConnection = null;
		Statement eStatement = null;
		
		try{
			eConnection = GetConnection();
			eStatement = eConnection.createStatement();
			record = eStatement.executeUpdate(SQL);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		} 
		finally{
			DbUtils.closeQuietly(eStatement);
			DbUtils.closeQuietly(eConnection);
		}		
		return record;
	}
	
}
