
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.YiNong.WebService.AppAgent;
import com.YiNong.WebService.AppAgentSoap;


public class DateGcConvert {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws DatatypeConfigurationException 
	 */
	public static void main(String[] args) throws ParseException, DatatypeConfigurationException {
		
		//WebService中写法
		String pt = "2010-06-01 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date temp = sdf.parse(pt);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(temp);
        XMLGregorianCalendar beginTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);       
        
		//博文
       //GregorianCalendar-〉XMLGregorianCalendar   
        GregorianCalendar nowGregorianCalendar =new GregorianCalendar();  
        XMLGregorianCalendar xmlDatetime= DatatypeFactory.newInstance().newXMLGregorianCalendar(nowGregorianCalendar);  
        //XMLGregorianCalendar ->GregorianCalendar  
        nowGregorianCalendar = xmlDatetime.toGregorianCalendar();  
        //GregorianCalendar->String  
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String dateTimeString=simpleDateFormat.format(nowGregorianCalendar.getTime());  
       
        //GregorianCalendar->Date  
        Date date = nowGregorianCalendar.getTime();  
        //Date->GregorianCalendar  
        nowGregorianCalendar.setTime(date);  
    
        //String->Date  
        date=simpleDateFormat.parse("1981-07-22 00:00:00");  
        //Date->String  
        String dateString=simpleDateFormat.format(date.getTime());  
          
        //Sring->XMLGregorianCalendar  
        nowGregorianCalendar.setTime(simpleDateFormat.parse("1981-07-22 00:00:00"));  
        xmlDatetime= DatatypeFactory.newInstance().newXMLGregorianCalendar(nowGregorianCalendar);  
        //XMLGregorianCalendar->Sring  
        simpleDateFormat.format(xmlDatetime.toGregorianCalendar().getTime());  

	}

}
