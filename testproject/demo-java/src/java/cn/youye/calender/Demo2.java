package cn.youye.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by pc on 2016/7/9.
 */
public class Demo2 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("格式化之前的：" + date1);
        System.out.println("格式化之后的: " + sdf.format(date1));
        try {
            String date = "2016-07-08 10:23:56";
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date2 = sdf2.parse(date);
            System.out.println("String ->date：" + date2);

            date = sdf2.format(date2);
            System.out.println("Date ->String: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
