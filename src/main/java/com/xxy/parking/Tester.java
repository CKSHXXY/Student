package com.xxy.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        java();
//        java8();
        LocalDateTime enter = LocalDateTime.of(2018, 12,25, 8 , 0, 0);
        LocalDateTime leave = LocalDateTime.of(2018, 12, 25, 10, 0 ,0 );
        Car car = new Car("AA-0001", enter);
        car.setLeave(leave);
        System.out.println(car.getduration());
        long hours = (long)Math.ceil(car.getduration()/60.0);
        System.out.println(hours);
        System.out.println(hours*30);

    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);

        //Local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)) );
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2019/08/30 08:00:00";
        try {
            Date other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
//        calendar.set();
    }
}
