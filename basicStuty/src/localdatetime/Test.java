package localdatetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @program: basicTest
 * @description:
 * @author: 全栈者也
 * @create: 2020 - 10 - 05 17:34
 **/
public class Test {

    /**
     * 在JDK1.8之前，Java处理日期、日历和时间的方式一直为社区所诟病，将 java.util.Date设定为可变类型，以及SimpleDateFormat的非线程安全使其应用非常受限。
     * 因此推出了java.time包，该包下的所有类都是不可变类型而且线程安全。
     *
     * Instant：瞬时时间。
     * LocalDate：本地日期，不包含具体时间, 格式 yyyy-MM-dd。
     * LocalTime：本地时间，不包含日期. 格式 yyyy-MM-dd HH:mm:ss.SSS 。
     * LocalDateTime：组合了日期和时间，但不包含时差和时区信息。
     * ZonedDateTime：最完整的日期时间，包含时区和相对UTC或格林威治的时差。
     *
     */

    public static void main(String[] args) {


        //本地日期,不包括时分秒
        LocalDate nowDate = LocalDate.now();
        System.out.println("当前时间:"+nowDate);

        //本地日期,包括时分秒
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("当前时间:"+nowDateTime);


        //获取当前的时间，包括毫秒
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("当前年:"+ldt.getYear());
        System.out.println("当前年份天数:"+ldt.getDayOfYear());
        System.out.println("当前月:"+ldt.getMonthValue());
        System.out.println("当前时:"+ldt.getHour());
        System.out.println("当前分:"+ldt.getMinute());
        System.out.println("当前时间:"+ldt.toString());

        //格式化时间
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        ldt.format(dateTimeFormatter);
        System.out.println("格式化时间: "+ ldt);


        //时间增减
        System.out.println("后5天时间:"+ldt.plusDays(5));
        System.out.println("前5天时间并格式化:"+ldt.minusDays(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("前一个月的时间:"+ldt.minusMonths(1).format(DateTimeFormatter.ofPattern("yyyyMM")));
        System.out.println("后一个月的时间:"+ldt.plusMonths(1));
        System.out.println("指定2099年的当前时间:"+ldt.withYear(2099));


        //创建指定时间
        LocalDate ld3 = LocalDate.of(2017, Month.NOVEMBER, 17);
        System.out.println(ld3);
        LocalDate ld4 = LocalDate.of(2018, 02, 11);
        System.out.println(ld4);


        //时间相差比较  Period
        LocalDate ld=LocalDate.parse("2017-11-17");
        LocalDate ld2=LocalDate.parse("2018-01-05");
        Period p = Period.between(ld, ld2);
        System.out.println("相差年: "+p.getYears()+" 相差月 :"+p.getMonths() +" 相差天:"+p.getDays());

        //相差总数的时间  ChronoUnit
        LocalDate startDate = LocalDate.of(2017, 11, 17);
        LocalDate endDate = LocalDate.of(2018, 01, 05);

        System.out.println("相差月份:"+ ChronoUnit.MONTHS.between(startDate, endDate));
        System.out.println("两月之间的相差的天数   : " + ChronoUnit.DAYS.between(startDate, endDate));

        //精度时间相差  Duration
        //这个类以秒和纳秒为单位建模时间的数量或数量。
        Instant inst1 = Instant.now();
        System.out.println("当前时间戳 : " + inst1);

        Instant inst2 = inst1.plus(Duration.ofSeconds(10));
        System.out.println("增加之后的时间 : " + inst2);

        System.out.println("相差毫秒 : " + Duration.between(inst1, inst2).toMillis());
        System.out.println("相毫秒 : " + Duration.between(inst1, inst2).getSeconds());

        //时间大小比较
        LocalDateTime ldt4 = LocalDateTime.now();
        LocalDateTime ldt5 = ldt4.plusMinutes(10);

        System.out.println("当前时间是否大于:"+ldt4.isAfter(ldt5));
        System.out.println("当前时间是否小于"+ldt4.isBefore(ldt5));


        //时区时间计算
        //得到其他时区的时间。
        //通过Clock时钟类获取计算
        //Clock时钟类用于获取当时的时间戳，或当前时区下的日期时间信息。
        Clock clock = Clock.systemUTC();
        System.out.println("当前时间戳 : " + clock.millis());

        Clock clock2 = Clock.system(ZoneId.of("Asia/Shanghai"));
        System.out.println("亚洲上海此时的时间戳:"+clock2.millis());

        Clock clock3 = Clock.system(ZoneId.of("America/New_York"));
        System.out.println("美国纽约此时的时间戳:"+clock3.millis());


        //通过ZonedDateTime类和ZoneId
        ZoneId zoneId= ZoneId.of("America/New_York");
        ZonedDateTime dateTime=ZonedDateTime.now(zoneId);
        System.out.println("美国纽约此时的时间 : " + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
        System.out.println("美国纽约此时的时间 和时区: " + dateTime);

    }


}
