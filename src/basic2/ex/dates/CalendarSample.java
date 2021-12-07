package basic2.ex.dates;

//日付処理の練習
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

class CalendarSample {
    public static void main(String[] args) {
        question1();
        question2();
        question3();

    }

    //EX　1　Calendarで日付取得しよう
        private  static void question1(){
       Calendar calendar = Calendar.getInstance();
        DateFormat  format1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        Date now = new Date();
        //現在時刻を、Dateに代入しておく
            //逐次、これでsetTimeしてリセットしながら使う

        //format作成　代入してつかおう
//getTime()しないとひょうじされない
//add すると、どんどん変更するので、getTime()は変わっていく。
        //→いちいちnewしないといけない

        System.out.println("現在時刻：　"+format1.format(calendar.getTime()));

        calendar.setTime(now);
        //いちいち、現在時刻をsetしないと、どんどん変更されていく
        calendar.add(Calendar.YEAR,1);
        System.out.println("1年後：　"+format1.format(calendar.getTime()));

        calendar.setTime(now);
        calendar.add(Calendar.MONTH,2);
        System.out.println("2か月後：　"+format1.format(calendar.getTime()));

        calendar.setTime(now);
        calendar.add(Calendar.WEEK_OF_MONTH,-3);
        System.out.println("3週間前：　"+format1.format(calendar.getTime()));

        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH,-4);
        System.out.println("4日前：　"+format1.format(calendar.getTime()));

        calendar.setTime(now);
        calendar.add(Calendar.HOUR,5);
        System.out.println("5時間後：　"+format1.format(calendar.getTime()));

        calendar.setTime(now);
        calendar.add(Calendar.MINUTE,-6);
        System.out.println("6分前：　"+format1.format(calendar.getTime()));

        calendar.setTime(now);
        calendar.add(Calendar.SECOND,-7);
        System.out.println("7秒前：　"+format1.format(calendar.getTime()));

    }

    //DateAndTime　API　で同じものを表示する
    private static void question2(){
        LocalDateTime baseTimes = LocalDateTime.now();
        //ベースになる、現在時刻を代入しておく
        System.out.println("\n Date　Time　API\n　デフォルト： "+baseTimes);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
        //API使用のときは、DateTimeFormatterを使う
            //Date　Time　Formatter型　formatter　にパターンを代入して使ってみた


        System.out.println("現在時刻: "+ DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒").format(baseTimes));

        System.out.println("1年後　: "+formatter.format(baseTimes.plusYears(1)));
        System.out.println("2ヶ月後　: "+formatter.format(baseTimes.plusMonths(2)));
        System.out.println("3週間前　: "+formatter.format(baseTimes.minusWeeks(3)));
        System.out.println("4日前　: "+formatter.format(baseTimes.minusDays(4)));
        System.out.println("5時間後　: "+formatter.format(baseTimes.plusHours(5)));
        System.out.println("6分前　: "+formatter.format(baseTimes.minusMinutes(6)));
        System.out.println("7秒前　: "+formatter.format(baseTimes.minusSeconds(7)));

    }

    //うるう年計算
    //2000年～2100年までを閏年かどうか判定し表示すること。
    private static void question3(){
        // !!NG!!2100 は平年なのにうるうってでる
        for (int year = 2000; year <= 2100; year++){
            if (year % 4 == 0 || year % 400 == 0) {
                System.out.println(year + " 年は　うるう年");
            }else if (year % 100 == 0){
                    System.out.println(year + "　年は 平年");
            }else {
            }
        }
    }


}
