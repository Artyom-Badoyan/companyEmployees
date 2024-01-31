package javaCore.karenHomeWorck.homework16.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
    private static final SimpleDateFormat SDTF = new SimpleDateFormat("dd-MM-yyyy HH:mm");

    public static Date stringToDate(String date) throws ParseException {
        if (date == null) {
            return null;
        }
        return SDF.parse(date);
    }

    public static Date stringToDateTime(String date) throws ParseException {
        if (date == null) {
            return null;
        }
        return SDTF.parse(date);
    }

    public static String dateToString(Date dateStr) {
        if (dateStr == null) {
            return null;
        }
        return SDF.format(dateStr);
    }

    public static String dateTimeToString(Date dateStr) {
        if (dateStr == null) {
            return null;
        }
        return SDTF.format(dateStr);
    }

    public static boolean isSameDay(Date date1, Date date2) {
        return dateToString(date1).equals(dateToString(date2));
    }
}
