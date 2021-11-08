package ex.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;

class DateandTimeSample {
    public static void main(String[] args) {
        //Date and Time API

        //日付 .LocalDate
        LocalDate date =LocalDate.now();
        System.out.println("日付：　"+date);

        DateTimeFormatter dafo =
                DateTimeFormatter.ofPattern("yyyy年MM月dd日　（E）");
        String stdafo =dafo.format(date);
        System.out.println("日付でformat :"+stdafo);

        //時刻　.LocalTime
        LocalTime time =LocalTime.now();
        System.out.println("\n時刻：　"+time);

        DateTimeFormatter timeFo=
                DateTimeFormatter.ofPattern("HH時mm分　ss秒 SSSミリ秒");
        String stTime= timeFo.format(time);
        System.out.println("時刻（format）: "+stTime);

        //日時
        LocalDateTime daTi =LocalDateTime.now();
        System.out.println("\n日時: "+daTi);

        DateTimeFormatter daTiFo=
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH mm ss SSS (E)");
        String stDaTi =daTiFo.format(daTi);
        System.out.println("日時（format）：　"+stDaTi);

        //指定して取得
        System.out.println(LocalDateTime.of(4444,4,4,4,44,44));
        System.out.println(LocalDate.parse("2012-05-26"));
        // ⇒4444-04-04T04:44:44
        //  2012-05-26（文字列で取得）

        LocalDateTime dateTime1= LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter
         =DateTimeFormatter.ofPattern("yyyy年　MM月　dd日 HH:mm:ss (E)");
        String stDati= dateTimeFormatter.format(dateTime1);
        System.out.println("\nデフォルト：　"+stDati);

        System.out.println("年だけ取得：　"+dateTime1.getYear());
        System.out.println("月だけ取得：　"+dateTime1.getMonth());
        System.out.println("月だけ取得(Value)：　"+dateTime1.getMonthValue());
        System.out.println("日だけ取得：　"+dateTime1.getDayOfMonth());

        //⇒ 年だけ取得：　2021
        //  月だけ取得：　NOVEMBER
        //  月だけ取得：　11
        //  日だけ取得：　8

        //加算・減算
        System.out.println("\n１時間後: "+dateTime1.plusHours(1));
        System.out.println("１時間前: "+dateTime1.minusHours(1));
        System.out.println("１年後: "+dateTime1.plusYears(1));

        //⇒ １時間後: 2021-11-08T14:26:15.635252800
        //  １時間前: 2021-11-08T12:26:15.635252800
        //  １年後: 2022-11-08T13:26:15.635252800






        //タイムゾーン
        ZonedDateTime date2
                =ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("\n東京の日時：　"+date2);
        DateTimeFormatter toDa=
        DateTimeFormatter.ofPattern("東京　：　yyyy年MM月dd日 HH時 mm分 (E)");
        String stTo= toDa.format(date2);
        System.out.println(stTo);

        ZonedDateTime date3
                =ZonedDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("シカゴの日時: "+date3);

    }
}
