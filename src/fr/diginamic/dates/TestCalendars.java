package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendars {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, Calendar.MAY);
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(date));

        Calendar cal2 = Calendar.getInstance();
        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(cal2.getTime()));

        SimpleDateFormat sdfFr = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.FRENCH);
        SimpleDateFormat sdfRu = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.forLanguageTag("ru"));
        SimpleDateFormat sdfCh = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.CHINESE);
        SimpleDateFormat sdfGe = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.GERMAN);

        System.out.println(sdfFr.format(cal2.getTime()));
        System.out.println(sdfRu.format(cal2.getTime()));
        System.out.println(sdfCh.format(cal2.getTime()));
        System.out.println(sdfGe.format(cal2.getTime()));
    }
}
