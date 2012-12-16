import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * XMLGregorianCalendar类型和Date类型之间的相互转换
 * @author Xin
 * 2010-06-12
 */

public class Test {

	
	
    public XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        try {
            gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (Exception e) {

             e.printStackTrace();
        }
        return gc;
    }
 
     public  Date convertToDate(XMLGregorianCalendar cal) throws Exception{
         GregorianCalendar ca = cal.toGregorianCalendar();
         return ca.getTime();
     }
 
     public static void main(String[] args) {
         Test dateTest = new Test();
         XMLGregorianCalendar d = dateTest.convertToXMLGregorianCalendar(new Date());
         System.out.println(d.getDay());
         XMLGregorianCalendar cal = null;
         try {
             cal = DatatypeFactory.newInstance().newXMLGregorianCalendar();
             cal.setMonth(06);
             cal.setYear(2010); 
             Date date = dateTest.convertToDate(cal);
             String format = "yyyy-MM-dd HH:mm:ss";
             SimpleDateFormat formatter = new SimpleDateFormat(format);
             System.out.println(formatter.format(date));
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
}