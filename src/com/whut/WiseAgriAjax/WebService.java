package com.whut.WiseAgriAjax;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.YiNong.WebService.AppAgent;
import com.YiNong.WebService.AppAgentSoap;

public class WebService {
	static AppAgentSoap eAppAgentSoap = new AppAgent().getAppAgentSoap();
	
/*	
 *获取翼农App列表  
  categoryId	int	目标频道id	
  categoryName	int	目标频道名称
  iconUrl	string	目标频道图标
  trialTime	string	目标频道试用时间	单位：天
  categoryPrice	string 	目标频道价格	
  
    app.setType("app");
    app.setId(eResultSet.getString("appid"));
    app.setName(eResultSet.getString("appname"));
    app.setIconUrl(eResultSet.getString("imageurl1"));
    app.setLocation(eResultSet.getString("companyarea"));
    app.setStyle("");
*/
	public String GetAppList(String page, String limit, String keyWord) {
		String json = "";
		try {
			json = eAppAgentSoap.getAppList(Integer.parseInt(page), Integer.parseInt(limit), keyWord);
			json = json.replace("categoryId", "id");
			json = json.replace("categoryName", "name");
		} catch (Exception e) {
			System.out.println("here:"+e.getMessage());
		}
		return json;
	}

/*	
函数名：GetNewsList
传入的参数
名称	类型	说明	备注
BeginDate	datetime	开始时间	以创建时间为准
EndDate	datetime	结束时间	以创建时间为准
PageIndex	int	当前页数	
PageSize	int	当前条数	
KeyWord	String	搜索关键字	

返回的JSON数据如下：
{ “ Pageindex “:1, “PageCount“:10, “RecordCount“:10,”DataList”:
	[{
		“Id”:1,
		“Title”:”农业资讯”,
		“Content“:”资讯内容”,
		“CreateTime”:”2010-10-1”
	},{
		“Id”:2,
		“Title”:”农业资讯”,
		“Content“:”content”,
		“CreateTime”:”2010-10-1”
	}]
}
	*/
	public String GetNewsList(int pageIndex, int pageSize, String startDatePara, String endDatePara) {
		String jsonAll = "";
		String json = "";
        try {
	    	jsonAll = eAppAgentSoap.getNewsList(pageIndex, pageSize,
				  startDatePara, endDatePara);
			json = JSONObject.fromObject(jsonAll).getString("dataList");  
			
			json = json.replace("Id", "categoryId");
			json = json.replace("Title", "newsTitle");
			json = json.replace("Content", "newsContent");
			json = json.replace("CreateTime", "dateTime");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return json;
	}	

/*获取供应信息
 * 	函数名：GetGYList
	传入的参数
	名称	类型	说明	备注
	StartDate	String	开始时间	以创建时间为准
	EndDate	string	结束时间	以创建时间为准
	Pageindex	int	当前页数	
	Pagesize	int	当前条数
返回JSON格式如下：
//供应信息格式
	[{
		“Id”:1,
		“ProductName”:”小麦”,
“Price “:”面议”,
“ContectName”:”周先生”,
“ContentPhone”:”0711-3611645”,
“BeginTime”:”2012-9-7”,
“EndTime”:”2012-10-7”,
“ProductPlace”:”鄂州”,
“Desc”:”湖北鄂州市周先生大量供应小麦”
	},{
		“Id”:2,
		“ProductName”:”小麦”,
“Price “:”面议”,
“ContectName”:”周先生”,
“ContentPhone”:”0711-3611645”,
“BeginTime”:”2012-9-7”,
“EndTime”:”2012-10-7”,
“ProductPlace”:”鄂州”,
“Desc”:”湖北鄂州市周先生大量供应小麦”
	}]
	private String SnBType;
	private String SnBTitle;
	private String SnBPublisher;
	private String SnBPrice;
	private String SnBArea;
	private String SnBImage;
	private String SnBTime;
	private String SnBPhone;
	private String SnBContent;
*/	
	
	public String GetSupplyList(int pageIndex, int pageSize, String startDate, String endDate) {
		String json = "";
		JSONArray arrayBefore = null;
		JSONArray arrayAfter = null;
       try {
        	json = eAppAgentSoap.getGYList(pageIndex, pageSize, startDate, endDate);
        	json = JSONObject.fromObject(json).getString("dataList");  //[{},{},{}]
        	arrayBefore = JSONArray.fromObject(json);//转换为未添加属性的array
	
			arrayAfter = new JSONArray();
			//为每一个array中的object添加属性
        	for(int i = 0; i < arrayBefore.size(); i++) {
        	    JSONObject temp = arrayBefore.getJSONObject(i);
         		temp.put("SnBType", "0");
          		temp.put("SnBImage", "");//为object添加三个信息田园未提供的属性
          		arrayAfter.add(i, temp);
        	}        	
        	json = arrayAfter.toString();  //[{},{},{}]
			//System.out.println(arrayAfter);

			json = json.replace("ProductName", "SnBTitle");
			json = json.replace("ContectName", "SnBPublisher");
			json = json.replace("Price", "SnBPrice");
			json = json.replace("BeginTime", "SnBTime");
			json = json.replace("ContentPhone", "SnBPhone");
			json = json.replace("ProductPlace", "SnBArea");
			json = json.replace("Desc", "SnBContent");
			System.out.println(arrayAfter);
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return json;
	}		
	
/*	获取求购信息
函数名：GetQGList
	传入的参数
	名称	类型	说明	备注
	StartDate	string	开始时间	以创建时间为准
	EndDate	string	结束时间	以创建时间为准
	Pageindex	int	当前页数	
	Pagesize	int	当前条数	
	返回JSON格式如下：
	{ “ Pageindex “:1, “ PageCount “:10, RecordCount “:10,”dataList”:
		[{
			“Id”:1,
			“ProductName”:”小麦”,
	“Price “:”面议”,
	“ContectName”:”周先生”,
	“ContentPhone”:”0711-3611645”,
	“BeginTime”:”2012-9-7”,
	“EndTime”:”2012-10-7”,
	“Desc”:”湖北鄂州市周先生大量求购小麦”
		},{
*/	
	public String GetBuyList(int pageIndex, int pageSize, int status, String startDate, String endDate) {
		String json = "";
		JSONArray arrayBefore = null;
		JSONArray arrayAfter = null;
       try {
        	json = eAppAgentSoap.getQGList(pageIndex, pageSize, status, startDate, endDate);
        	json = JSONObject.fromObject(json).getString("dataList");  //[{},{},{}]
        	arrayBefore = JSONArray.fromObject(json);//转换为未添加属性的array
	
			arrayAfter = new JSONArray();
			//为每一个array中的object添加属性
        	for(int i = 0; i < arrayBefore.size(); i++) {
        	    JSONObject temp = arrayBefore.getJSONObject(i);
         		temp.put("SnBType", "1");
          		temp.put("SnBImage", "");//为object添加三个信息田园未提供的属性
          		temp.put("SnBArea", "暂无");//为object添加三个信息田园未提供的属性
         		arrayAfter.add(i, temp);
        	}        	
        	json = arrayAfter.toString();  //[{},{},{}]

			json = json.replace("ProductName", "SnBTitle");
			json = json.replace("ContectName", "SnBPublisher");
			json = json.replace("Price", "SnBPrice");
			json = json.replace("BeginTime", "SnBTime");
			json = json.replace("ContentPhone", "SnBPhone");
			json = json.replace("Desc", "SnBContent");
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return json;
	}		
	
/*	获取问题信息
函数名:GetWTList
传入的参数
名称	类型	说明	备注
StartDate	string	开始时间	以创建时间为准
EndDate	string	结束时间	以创建时间为准
Pageindex	int	当前页数	
Pagesize	int	当前条数	
CatalogId	Int	类别编号	
返回JSON格式如下：
{ “ Pageindex “:1, “ PageCount “:10, RecordCount “:10,”dataList”:
	[{
		“Id”:1,
		“title”:”我家母猪眼睛长了一颗红肉，出眼屎，流泪，怎么办”,
“desc “:” 我家母猪眼睛眼角处长了一颗红肉，出眼屎，流泪，是怎么回事？（已怀孕80天了）求高指教，感谢”,
		“Catalog “:”家禽”,
“Status”:1
	},{
		“Id”:2,
		“title”:”我家母猪眼睛长了一颗红肉，出眼屎，流泪，怎么办”,
“desc “:” 我家母猪眼睛眼角处长了一颗红肉，出眼屎，流泪，是怎么回事？（已怀孕80天了）求高指教，感谢”,
		“Catalog “:”家禽”,
“Status”:1
	}]
}
	private String QnAType;
	private String QContent;
	private String QPublisher;
	private String QPhone;
	private String QTime;
	private String QImage;
	private String AContent;
	private String APublisher;
	private String APhone;
	private String ATime;
	private String AImage;

	*/	
	public String GetQuestionList(int pageIndex, int pageSize, int catalogId, String startDate, String endDate) {
		String json = "";
		JSONArray arrayBefore = null;
		JSONArray arrayAfter = null;
       try {
    	   json = eAppAgentSoap.getWTList(pageIndex, pageSize, catalogId, startDate, endDate);//Catalog	表示问题类别
    	   json = JSONObject.fromObject(json).getString("dataList");  //[{},{},{}]
    	   arrayBefore = JSONArray.fromObject(json);//转换为未添加属性的array
	
    	   
			arrayAfter = new JSONArray();
			//为每一个array中的object添加属性
        	for(int i = 0; i < arrayBefore.size(); i++) {
        	    JSONObject temp = arrayBefore.getJSONObject(i);
        	    if(temp.getString("Catalog").equals("家禽"))
        	    	temp.put("QnAType", "11");//养殖生产
        	    else
        	    	temp.put("QnAType", "1");//其他类型....
         		temp.put("QPublisher", "信息田园用户");
         		temp.put("QPhone", "暂无");
         		temp.put("QTime", "暂无");
         		temp.put("QImage", "");
         		
          		temp.put("AContent", GetAnswer(temp.getInt("Id")));
         		temp.put("APublisher", "");
         		temp.put("APhone", "");
         		temp.put("ATime", "");
         		temp.put("AImage", "");
         		arrayAfter.add(i, temp);
        	}        	
        	json = arrayAfter.toString();  

			json = json.replace("desc", "QContent");
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return json;
	}		

	public String GetAnswer(int id) {
		String answer = "";
		String json = "";
		JSONArray array = null;
       try {
    	   json = eAppAgentSoap.getWDInfo(id);
    	   //System.out.println("answer array "+id + " " + json);
    	   array = JSONArray.fromObject(json);//转换为未添加属性的array
	
			//为每一个array中的object添加属性
    	   int rec=0;
        	for(int i = 0; i < array.size(); i++) {
        	    JSONObject temp = array.getJSONObject(i);
         		if(temp.getInt("IsBase")==1)//最佳答案
         			answer = "最佳答案：" + temp.getString("Adesc") + answer + "\n";
         		else{
         			rec++;
         			answer = answer + "回答" + rec + ":" + temp.getString("Adesc") + "\n";
         		}
        	}      
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return answer;
	}	
	
	public String GetAnswerList(int id) {
		String json = "";
		JSONArray arrayBefore = null;
		JSONArray arrayAfter = null;
       try {
    	   json = eAppAgentSoap.getWDInfo(id);
    	   arrayBefore = JSONArray.fromObject(json);//转换为未添加属性的array
 	   
		   arrayAfter = new JSONArray();
			//为每一个array中的object添加属性
        	for(int i = 0; i < arrayBefore.size(); i++) {
        	    JSONObject temp = arrayBefore.getJSONObject(i);
         		
         		temp.put("APublisher", "");
         		temp.put("APhone", "");
         		temp.put("ATime", "");
         		temp.put("AImage", "");
         		arrayAfter.add(i, temp);
        	}        	
        	json = arrayAfter.toString();  

			json = json.replace("Adesc ", "AContent");
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return json;
	}		
	
/*	
 * 添加供求信息	
函数名：AddGY
传入的参数
名称	类型	说明	备注
mid	Int	发布人会员编号	
product_name	Int	产品名称	
low_price	double	价格，低	
hight_price	double	价格，高	
is_discuss	String	是否面议	1：面议。0：有薪资范围；
**********************product_place_id	Int	地区编号	
product_desc	String	产品描述	
begin_time	Datetime	有效时间-开始时间	
end_time	Datetime	有效时间-结束时间	
contact_phone	String	联系电话	
contact_name	String	联系人	

函数名：AddQG
传入的参数
名称	类型	说明	备注
mid	Int	发布人会员编号	
product_name	Int	产品名称	
low_price	double	价格，低	
hight_price	double	价格，高	
is_discuss	String	是否面议	1：面议。0：有薪资范围；
product_desc	String	产品描述	
begin_time	Datetime	有效时间-开始时间	
end_time	Datetime	有效时间-结束时间	
contact_phone	String	联系电话	
contact_name	String	联系人	


返回JSON格式如下：
{"Code":"0"}
返回参数说明：
名称	类型	说明	备注
Code	int	1: 添加成功；0：失败	

 * 
 * The method addGY(int, String, 
 * 					double, double, 
 * 					String, int, 
 * 					String, XMLGregorianCalendar, 
 * 					XMLGregorianCalendar, String, 
 * 					String)
 * 
 * The method addQG(int, String, 
 * 				double, double, 
 * 				String, 
 * 				String, XMLGregorianCalendar, 
 * 				XMLGregorianCalendar, String, 
 * 				String)
 * 
 * */
	public int AddSupplyBuy(int flag, String mid, String productName, String lowPrice, 
			String highPrice, String isDiscuss, String productPlaceId, String productDesc,
			String beginTimePara, String endTimePara, String contactPhone, String contactName) {
		
		int rec = 0;
		String json = "";
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;

        try {
			//字符串转日期
	        date = sdf.parse(beginTimePara);
	        cal.setTime(date);
	        XMLGregorianCalendar beginTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);       
	     	
	        //date = getDateAfter(date, 10);
	        date = sdf.parse(endTimePara);
	        cal.setTime(date);
	        XMLGregorianCalendar endTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);       
	        
	        if(flag == 0)//0供应 1求购
				json = eAppAgentSoap.addGY(Integer.parseInt(mid), productName, 
									Double.parseDouble(lowPrice), Double.parseDouble(highPrice),
									isDiscuss, Integer.parseInt(productPlaceId), 
									productDesc, beginTime, 
									endTime, contactPhone, 
									contactName);
			else
				json = eAppAgentSoap.addQG(Integer.parseInt(mid), productName, 
									Double.parseDouble(lowPrice), Double.parseDouble(highPrice),
									isDiscuss, 
									productDesc,beginTime, 
									endTime, contactPhone, 
									contactName);
			JSONObject jsonob = JSONObject.fromObject(json);  
			rec = jsonob.getInt("Code");// 城市  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return rec;
		
	}
	
    /** 
     * 得到几天后的时间 
     */  
    public Date getDateAfter(Date d, int day) {  
        Calendar now = Calendar.getInstance();  
        now.setTime(d);  
        now.set(Calendar.DATE, now.get(Calendar.DATE) + day);  
        return now.getTime();  
    }   	
    /** 
     * 得到几天前的时间 
     */  
    public Date getDateBefore(Date d, int day) {  
        Calendar now = Calendar.getInstance();  
        now.setTime(d);  
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);  
        return now.getTime();  
    }  
	
}