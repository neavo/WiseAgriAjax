import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



/*sqlserver数据库的datetime数据类型对应java的就应该是java.sql.date类型
你可以查查java api文档 SimpleDateFormat的用法，可以了解到更详细

//SimpleDateFormat中的parse方法可以
把String型的字符串转换成特定格式的date类型

import java.text.*;
import java.util.*;*/

public class TestDate {
    public static void main(String[] args) {
        String dStr = "2010-06-01 00:00:00";
        Date d = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            d = sdf.parse(dStr);
        } catch (ParseException pe) {
            System.out.println(pe.getMessage());
        }
        System.out.println(d);
        System.out.println(d.getTime());
    }
}