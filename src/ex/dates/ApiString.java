package ex.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

class ApiString {
    public static void main(String[] args) {
        //文字列出力　DateTimeFormatter.ofPattern～.format()
        LocalDateTime date1= LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:ss (E)")
        .format(date1));
    //　⇒2021/11/09/ 09:31:35 (火)
    //DateTimeFormatterのパターンクラスに引数として、表示形式を渡す
        //.format（date）で、なにに適用させるか指す


    //文字列→日付/時刻クラス変換　.ofPattern～.parse～.from()
        TemporalAccessor parse =DateTimeFormatter
                .ofPattern("yyyy/MM/dd HH:mm:ss:SSS")
                .parse("2044/02/05 23:23:11:222");
        LocalDateTime date2= LocalDateTime.from(parse);
        System.out.println(parse);
        //  ⇒{},ISO resolved to 2044-02-05T23:23:11.222


        //DateTimeFormatterのDATEインスタンス使用
        // 　日付のみの情報なので、LocalDateから持ってこないとエラーになる
        TemporalAccessor parse2= DateTimeFormatter.ISO_LOCAL_DATE.parse("2044-02-05");
        LocalDate date3 =LocalDate.from(parse2);
        System.out.println(parse2);
    //  ⇒{},ISO resolved to 2044-02-05

    }
}
