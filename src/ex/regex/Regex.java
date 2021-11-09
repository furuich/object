package ex.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    public static void main(String[] args) {
        //正規表現　適合チェック　Pattern.compile（）～String～　pattern1.matcher（）~if
        Pattern pattern1 = Pattern.compile("my name is .*\\.");
        String sentence = "my name is nullpo.";
        String sentence2 = "Life  on  mars? ";
        Matcher matcher1 = pattern1.matcher(sentence);

        if (matcher1.matches()) {
            System.out.println("Ok");
        } else {
            System.out.println("NO");
        }
    //  ⇒OK
        // sentence2にしたらNOになるよ


        //正規表現　分割　Pattern.compile（）～String～String[]　pattern2.split()～for
        Pattern pattern2 = Pattern.compile("☆");
        //どこで分割するか。対象の文字列に存在しないとアカン
        String sentence3 = "遊☆戯☆王";
        String[] word = pattern2.split(sentence3);

        for (String st :word){
            System.out.println(st);
        }
    //  ⇒遊
        //戯
        //王

        //正規表現　置換　Pattern型　Pattern.compile（）～Matcher型　pattern3.matcher（）～matcher2.replaceAll（）
    Pattern pattern3 = Pattern.compile("\\s+");
        Matcher matcher2 = pattern3.matcher(sentence2);

        System.out.println(matcher2.replaceAll("☆"));

    //  ⇒Life☆on☆mars?☆


        //Stringを利用したもの

        System.out.println("match");
        System.out.println(sentence2.matches("Life on mars.\\S"));
        //  ⇒match
        //false

        System.out.println("\nsplit");
        String[] words = sentence2.split("//s+");
        for (String st : words){
            System.out.println(st);
        }
        //⇒split
        //Life  on  mars?


        System.out.println("\nreplace");
        System.out.println(sentence2.replaceAll("\\s+","☆"));

    //   ⇒replace
        //Life☆on☆mars?☆

    }
}
