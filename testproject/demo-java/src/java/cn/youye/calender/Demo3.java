package cn.youye.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by pc on 2016/7/9.
 */
public class Demo3 {

    public static void main(String[] args) {
        String birth = "2016-7-9";
        String date = "0000-7-01";
        Date date1 = Remember(birth, date);

        System.out.println("提醒时间为：" + (new SimpleDateFormat("yyyy-MM-dd").format(date1)));

    }

    public static Date Remember(String birth, String date) {
        Calendar calendar = new GregorianCalendar();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = sdf.parse(birth);
            Date remark = sdf.parse(date);

            calendar.setTime(birthday);
            int day = remark.getDay();
            int month = remark.getMonth();
            calendar.add(Calendar.WEEK_OF_MONTH, -2);
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar.getTime();
    }
}
