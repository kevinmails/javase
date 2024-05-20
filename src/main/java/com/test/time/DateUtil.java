package com.test.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/**
 * @author 陈彬
 * Date 2017/11/3
 * Time 11:40
 */
public interface DateUtil {

    String DATE_PATTERN = "yyyyMMdd";
    String DATE_PATTERN_HYPHEN = "yyyy-MM-dd";
    String DATE_PATTERN_SLASH = "yyyy/MM/dd";

    String DATE_TIME_PATTERN = "yyyyMMdd HH:mm:ss";
    String DATE_TIME_PATTERN_HYPHEN = "yyyy-MM-dd HH:mm:ss";
    String DATE_TIME_PATTERN_SLASH = "yyyy/MM/dd HH:mm:ss";


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

        System.out.println(DateUtil.format(Instant.now(), DATE_PATTERN_HYPHEN));


    }


    /**
     * 计算从开始日期{@code startDate}至结束日期{@code endDate}之间的天数
     *
     * @param startDate 开始日期,格式:yyyyMMdd e.g. 20171105
     * @param endDate   结束日期,格式:yyyyMMdd e.g. 20171105
     * @return 两日期间隔天数
     */
    static long daysBetween(String startDate, String endDate, DateUnit unit) {
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
    public static long daysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);

    }

    /**
     * @param startDate
     * @param endDate
     * @return
     * @throws
     * @Description: 计算两个日期之间的天数
     */
    static long until(String startDate, String endDate) {
        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        return start.until(end, ChronoUnit.DAYS);
    }


    /**
     * 计算当前日期与指定日期之间的毫秒数
     *
     * @param endDate
     * @return
     */
    static long until(String endDate) {
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
        return LocalDate.now().until(end, ChronoUnit.MILLIS);
    }

    static String format(Date date, String pattern) {
        Objects.requireNonNull(date, "date is null");
        Objects.requireNonNull(pattern, "pattern is null");
        LocalDateTime localDate = LocalDateTime.from(date.toInstant().atZone(ZoneId.systemDefault()));
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    static String format(LocalDateTime date, String pattern) {
        Objects.requireNonNull(date, "date is null");
        Objects.requireNonNull(pattern, "pattern is null");
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    static String format(Instant instant, String pattern) {
        Objects.requireNonNull(instant, "instant is null");
        Objects.requireNonNull(pattern, "pattern is null");
        return instant.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(pattern));
    }

}
