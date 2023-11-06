package com.javaquestions;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Q17 {
    public static void main(String[] args) {
        String currentDateTime = getCurrentDateTime();
        System.out.println("Current Date and Time: " + currentDateTime);
    }

    public static String getCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
