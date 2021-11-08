package ex.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class DateandTimeString {
    public static void main(String[] args) {
        //文字列変換
        //Dateクラス→文字列
        Date date1 =new Date();
        DateFormat format =new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
        System.out.println(format.format(date1));

        //  ⇒2021/11/08/ 14:07:02
        Date date3 =new Date(5000);
        System.out.println(format.format(date3));

        //文字列→Dateクラス
        //catchしないとエラーになる

        try{
            Date date2 =format.parse("2222/12/22/ 13:22:22");
            System.out.println(date2);
        }catch (ParseException ex){
            System.out.println("パースエラーです。再入力してください");
        }
        //⇒ Sun Dec 22 13:22:22 JST 2222

        //西暦→和暦変換　JapaneseDate = JapaneseDate.of()
        JapaneseDate date = JapaneseDate.of(1997,3,15);
        System.out.println("西暦→和暦：　"+date);
        //  ⇒Japanese Heisei 9-03-15

        JapaneseDate date2 =JapaneseDate.of(JapaneseEra.MEIJI,9,2,8);
        System.out.println("和暦指定して生成：　"+date2);
        //  ⇒Japanese Meiji 9-02-08

        //日付クラスとの相互変換
        JapaneseDate date4 =JapaneseDate.of(1969,6,8);
        System.out.println(DateTimeFormatter
                .ofPattern("GGGGy/M/d")
                .format(date4));
        //  ⇒昭和44/6/8
        JapaneseDate date5=JapaneseDate.now();
        System.out.println(date5);
        // ⇒Japanese Reiwa 3-11-08

    }
}
