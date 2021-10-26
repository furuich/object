package basic.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正規表現のサンプル
public class RegexSample {
    public static void main(String[] args) {
        //郵便番号の正規表現
        //正規表現のパターン
        String regex ="^\\d{3}-[0-9]{4}$";
            //[]文字の種類
            // 0~9の数字で、｛３回｝繰り返す
        //この形で合っているのが、郵便番号だよ、という定義

        String zip1 ="065-0026";
        zip1.matches(regex);
        System.out.println(zip1.matches(regex));
        String zip2="aあa1222";
        zip2.matches(regex);
        System.out.println(zip2.matches(regex));

        //
        Pattern pattern =Pattern.compile("^[0-9]{3}-[0-9]{4}$");

        //Matcherクラスのインスタンス生成
        Matcher matcher= null;
        //List.ofメソッド　可変長じゃない
        List<String> zipList =List.of("065-0026","aaa111222");

        for (String zip :zipList){
            matcher = pattern.matcher(zip);
            if (matcher.matches()){
                System.out.println(zip+":ok!");
            }else {
                System.out.println(zip+":NG!");
            }
        }

    }
}
