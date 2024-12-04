package Practice;

import java.io.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToDay {
    public static void main(String[] args) throws IOException {
        System.out.println(findDay(5,8,2015));
    }

    public static String findDay(int day, int month, int year) {
        String date = Integer.toString(month) + "/"  + Integer.toString(day) + "/"  +Integer.toString(year);
        Date askedDate = new Date(date);
        DateFormat f = new SimpleDateFormat("EEEE");
        NumberFormat.getCurrencyInstance();

        return f.format(askedDate);
    }




}
