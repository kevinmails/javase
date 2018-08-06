package com.test.time;

import com.sun.istack.internal.NotNull;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * @author 陈彬
 *         Date 2017/11/3
 *         Time 11:40
 */
public interface DateUtil {
    public static void main(String[] args) {


//        LocalDate date = LocalDate.parse("2017-12-03", DateTimeFormatter.ISO_LOCAL_DATE);
//        LocalDate now = LocalDate.now();
//        System.out.println(now.toString());
//
//
//        int days = Period.between(now, date).getDays();
//        int m = Period.between(now, date).getMonths();
//
//        System.out.println(days);
//        System.out.println(m);
//
//        long da = ChronoUnit.DAYS.between(now, date);
//        System.out.println(da);
//        System.out.println(DateUtil.daysBetween("20170201", "20170202", DateUnit.HOURS));
//        System.out.println(DateUtil.until("20170201", "20170202"));
        System.out.println(DateUtil.daysBetween("20170201", "20170202", DateUnit.MILLISECOND));
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(Instant.now());


    }


    /**
     * 计算从开始日期{@code startDate}至结束日期{@code endDate}之间的天数
     *
     * @param startDate 开始日期,格式:yyyyMMdd e.g. 20171105
     * @param endDate   结束日期,格式:yyyyMMdd e.g. 20171105
     * @return 两日期间隔天数
     */
    static long daysBetween(@NotNull String startDate, @NotNull String endDate, DateUnit unit) {
        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        long count = ChronoUnit.DAYS.between(start, end);
        switch (unit) {
            case DAY:
                break;
            case HOURS:
                count = count * 24;
                break;
            case MINUTE:
                count = count * 24 * 60;
                break;
            case SECOND:
                count = count * 24 * 60 * 60;
                break;
            case MILLISECOND:
                count = count * 24 * 60 * 60 * 1000;
                break;
            case YEAR:
                count = ChronoUnit.YEARS.between(start, end);
                break;
            case MONTH:
                count = ChronoUnit.MONTHS.between(start, end);
                break;
            case WEEK:
                count = ChronoUnit.WEEKS.between(start, end);
                break;

        }
        return count;

    }

    /**
     * 计算从开始日期{@code startDate}至结束日期{@code endDate}之间的天数
     *
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return 两日期间隔天数
     */
    public static long daysBetween(@NotNull LocalDate startDate, @NotNull LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);

    }

    /**
     * @param startDate
     * @param endDate
     * @return
     */
    static long until(@NotNull String startDate, @NotNull String endDate) {
        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        return start.until(end, ChronoUnit.DAYS);
    }


    static long until(@NotNull String endDate) {
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        return LocalDate.now().until(end, ChronoUnit.MILLIS);
    }

}
