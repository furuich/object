package ex.dates;

import java.util.Calendar;
import java.util.Date;

public class DateSample {
    public static void main(String[] args) {
        //現在時刻でDateクラスのインスタンスを生成
        //＝＝引数なしでコンストラクタを呼び出す
        Date now =new Date();
        System.out.println(now);

        //  Unix時間(1970年1月1日0時0分0秒からの経過時間)をベースにしている
        //  今回は、そこから5000ミリ秒経過した時刻（long型で渡してる）
        Date specify= new Date(8640);
        System.out.println(specify);

        //  ⇒Thu Nov 04 13:57:18 JST 2021
        //  ⇒Thu Jan 01 09:00:05 JST 1970


        /*  Calendarクラス
          Calendarクラスは抽象クラスなので、newは出来ない
        　getInstanceメソッドを用いて取り出そう
        GregorianCalendarクラスのインスタンスを返してくれるぞ*/
        Calendar calendar= Calendar.getInstance();
        System.out.println("ーCalenderの値ですー");
        System.out.println(calendar);

        System.out.println("ー以下はgetTimeの値ですーー");
        System.out.println(calendar.getTime());

        //⇒  ーCalendarの値ですー
        //⇒　java.util.GregorianCalendar[time=1636004797229,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Tokyo",offset=32400000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=308,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=37,MILLISECOND=229,ZONE_OFFSET=32400000,DST_OFFSET=0]
        //⇒　ー以下はgetTimeの値ですーー
        //⇒　Thu Nov 04 14:46:37 JST 2021


        //setメソッドで指定する
        Calendar calendar2= Calendar.getInstance();
        System.out.println("デフォルト　"+calendar2);

        //分だけ指定　.set(Calendar.MINUTE,リテラル)
        calendar2.set(Calendar.MINUTE,44);
        System.out.println("\n分の指定: "+calendar2.getTime());

        //全部指定　.set(年,月,日,時,分,秒,)
        calendar2.set(2044,4,4,4,44,44);
        System.out.println("\n全部指定：　"+calendar2.getTime());

        //日表示 .get(Calendar.DATE)
        System.out.println("\n日の表示：　"+calendar2.get(Calendar.DATE));
        //秒表示 .get(Calendar.SECOND)
        System.out.println("\n秒表示：　"+calendar2.get(Calendar.SECOND));

        //年を　2400追加　（　2400年後に変更）add(Calendar.YEAR,2400);
        calendar2.add(Calendar.YEAR,2400);
        System.out.println("\n年の加算　＋2400：　"+calendar2.getTime());

        //月を 12 減らす（　12ヶ月前に変更）.add(Calendar.MONTH,-12)
        calendar2.add(Calendar.MONTH,-12);
        System.out.println("\n月の減算（－12か月）：　"+calendar2.getTime());


        //⇒デフォルト　java.util.GregorianCalendar[time=1636006573611,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Tokyo",offset=32400000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=10,WEEK_OF_YEAR=45,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=308,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=16,SECOND=13,MILLISECOND=611,ZONE_OFFSET=32400000,DST_OFFSET=0]

        //⇒分の指定: Thu Nov 04 15:44:13 JST 2021

        //⇒全部指定：　Wed May 04 04:44:44 JST 2044

        //⇒日の表示：　4

        //⇒秒表示：　44

        //⇒年の加算　＋2400：　Wed May 04 04:44:44 JST 4444

        //⇒月の減算（－12か月）：　Mon May 04 04:44:44 JST 4443



    }
}
