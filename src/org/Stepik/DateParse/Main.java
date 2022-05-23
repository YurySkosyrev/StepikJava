package org.Stepik.DateParse;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int day = 31;
        int month = 6;
        int year = 2000;

        Boolean positive = (day > 0) && (month > 0) && (month < 13)&& (year > 0);

        Boolean m31 = ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (day < 32);
        Boolean m30 = ((month == 4) || (month == 6) || (month == 9) || (month == 11)  && (day < 31));
        Boolean vis = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        Boolean m28 = month == 2 && !vis && day < 29;
        Boolean m29 = month == 2 && vis && day < 30;
        System.out.println(positive && (m28 || m29 || m30 || m31));
    }

}