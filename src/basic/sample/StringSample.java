package basic.sample;

import java.util.Arrays;

public class StringSample {
    public static void main(String[] args) {
        //文字列結合　concat
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#concat(java.lang.String)
        String word1 = "cat";
        System.out.println(word1.concat("black"));
            //⇒catblack

        //文字列の分割 .split
        String sentence ="1-1,かんな,男,20,45,68";
                String[] data =sentence.split(",",6);
        System.out.println(Arrays.toString(data));
            //⇒[1-1, かんな, 男, 20, 45, 68]

        //連結　.join
         //ひとつｃずつ取り出して、間に空白をいれてる
        //for文で入れると、最後の一文字にも空白が入ってしまう
        //delimiter==あいだにいれる文字
        String joinword =String.join(" ",data);
        System.out.println(joinword);
            //⇒1-1 かんな 男 20 45 68

        //文字列置換　.replace
        //This のisも置換対象
        String original = "This is cat";
        String replace = original.replace("is","at");
        System.out.println(replace);
            //⇒That at cat

        //文字列の位置を検索　.indexOf
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#indexOf(int)
        sentence= "This is a cat.";
        int index =sentence.indexOf("is");
        System.out.println(index);
          //⇒2


    }
}
