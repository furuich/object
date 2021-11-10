package ex.strings;

import java.text.MessageFormat;
import java.util.Arrays;

class Strings {
    public static void main(String[] args) {
        //メソッド色々

        //実行のたびに一部変更して出力  printf
        int num = 1984;
        String bowie ="bowie";

        System.out.printf("David %s %d",bowie,num);
    //　　⇒David  Bowie 1984

        //書式文字列で指定　大文字指定で中身も大文字になる
        System.out.printf("\nDavid %S %X",bowie,num);
        //  ⇒David BOWIE 7C0

    //MessageFormat.format
        String message = MessageFormat.format("David {0} {1}",bowie,num);
        System.out.println("\n"+message);
        //  ⇒David bowie 1,984



    }
}
