package org.example.java8test.timeTest;

import javax.swing.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        //获取所有时区
        System.out.println(ZoneId.getAvailableZoneIds());

        //创建特定时区
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId);

        //创建clock对象
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);

        //获取Instant对象，并转化为Date对象
        Instant instant = clock.instant();
        Date date = Date.from(instant);
        System.out.println(date);

        //本地时间
        LocalTime localTime = LocalTime.now(zoneId);
        LocalTime localTime1 = LocalTime.now(clock);

        //计算两个时间之间的小时（分钟）
        long hoursBetween = ChronoUnit.HOURS.between(localTime, localTime1);
        long minutesBetween = ChronoUnit.MINUTES.between(localTime, localTime1);
        System.out.println(hoursBetween);
        System.out.println(minutesBetween);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate.plus(1,ChronoUnit.DAYS);

        DateTimeFormatter fomatter1 = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss");

        String time = "2022-09-08 12时01:00";
        LocalDateTime time1 = LocalDateTime.parse(time, fomatter1);
        System.out.println(time1);

    }
}
