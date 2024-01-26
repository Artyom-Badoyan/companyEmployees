package javaCore.karenHomeWorck.homework16.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private SimpleDateFormat sdf = new SimpleDateFormat("21/01/2024/ 14:50");

    public Date stringToDate(String date) throws ParseException {
        if (date == null) {
            return null;
        }
        return sdf.parse(date);
    }

    public String dateToString(Date dateStr) {
        if (dateStr == null) {
            return null;
        }
        return sdf.format(dateStr);
    }
}
