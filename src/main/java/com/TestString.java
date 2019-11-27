package com;

import java.time.*;
import java.util.Date;

public class TestString {

    public static void main(String[] args) {
        System.out.println("----下面是关于clock的用法----");
        //获取当前clock
        Clock clock=Clock.systemUTC();
        //通过Clock获取当前时刻
        System.out.println("当前时刻为: "+clock.instant());
        //获取clock对应的毫秒数,与system.currentTimeMillis()输出相同
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());
        //----下面是关于Duration的用法------
        System.out.println("----下面是关于Duration的用法------");
        Duration dur=Duration.ofSeconds(6001);
        // 向下取整
        System.out.println("6000秒相当于: "+dur.toMinutes()+"分");
        System.out.println("6000秒相当于: "+dur.toMinutes()+"小时");
        System.out.println("6000秒相当于: "+dur.toDays()+"天");
        //在clock基础上增加6000秒,返回新的clock
        Clock clock2=Clock.offset(clock, dur);
        //可以看到clock2与clock相差1小时40分
        System.out.println("当前时刻加6000秒为: "+clock2.instant());
        //下面是instant的用法
        //获取当前时间
        Instant instant=Instant.now();
        System.out.println(instant);
        //instant添加6000秒,返回新的Instant
        Instant instant2=instant.plusSeconds(6000);
        System.out.println(instant2);
        //根据字符串解析Instant对象
        Instant instant3=instant.parse("2018-12-08T11:57:43.054Z");
        System.out.println(instant3);
        //在instant3的基础上添加5小时4分钟
        Instant instant4=instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant4);
        //获取instant4五天前的时刻
        Instant instant5=instant4.minus(Duration.ofDays(5));
        System.out.println(instant5);
        //-----下面是关于LocalDate的用法-----
        System.out.println("-----下面是关于LocalDate的用法-----");
        LocalDate localdate=LocalDate.now();
        System.out.println(localdate);
        //获得2018年的第345天
        localdate=LocalDate.ofYearDay(2018, 345);
        System.out.println(localdate);
        //设置为2018年12月31日
        localdate=LocalDate.of(2018, Month.DECEMBER, 31);
        System.out.println(localdate);
        //---下面是关于LocalTime---的用法
        System.out.println("--------下面是关于LocalTime---的用法-----");
        //获取当前时间
        LocalTime localtime=LocalTime.now();
        System.out.println(localtime);
        //设置为22点33分
        localtime=LocalTime.of(22, 33);
        System.out.println(localtime);
        //返回一天中的第5503秒
        localtime=LocalTime.ofSecondOfDay(5503);
        System.out.println(localtime);
        //---下面是关于localDateTime的用法
        System.out.println("---下面是关于localDateTime的用法");
        //获取当前时间
        LocalDateTime localdatetime=LocalDateTime.now();
        System.out.println(localdatetime);
        //当前日期,时间加上25小时3分钟
        LocalDateTime future=localdatetime.plusHours(25).plusMinutes(3);
        System.out.println(future);
        //---下面是关于year,yearMonth,MonthDay的用法示例---
        System.out.println("---下面是关于year,yearMonth,MonthDay的用法示例---");
        Year year=Year.now();//获取当前的年份
        System.out.println("当前年份: "+year);//输出当前年份
        year=year.plusYears(5); //当前年份再加5
        System.out.println("当前年份再过5年: "+year);
        //根据指定月份获取yearsMonth
        YearMonth ym=year.atMonth(10);
        System.out.println("year年10月: "+ym);
        //当前年月再加5年.减三个月
        ym=ym.plusYears(5).minusMonths(3);
        System.out.println("year年10月再加5年,减3个月: "+ym);
        MonthDay md=MonthDay.now();
        System.out.println("当前月日: "+md);
        //设置为5月23日
        MonthDay md2=md.with(Month.MAY).withDayOfMonth(23);
        System.out.println("5月23日为: "+md2);
    }
}
