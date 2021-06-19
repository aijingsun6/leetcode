package org.alking.p1300;


import java.text.SimpleDateFormat;
import java.util.Date;

public class P1360 {

    public int daysBetweenDates(String date1, String date2)  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d1 = sdf.parse(date1 + " 00:00:00");
            Date d2 = sdf.parse(date2 + " 00:00:00");
            long gap = Math.abs(d1.getTime() - d2.getTime());
            return (int) (gap / 86400000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
