package ex.exception;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RuntimeExceptionSample {
    //非検査例外　例外の伝播
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        try{
            // メソッドの呼び出し元１
            t2.runSample1();
        } catch (ArithmeticException e) {
            System.out.println(e);
            //java.lang.ArithmeticException: / by zero
        }
    }
}
class Test2 {
    void runSample1(){
        // メソッドの呼び出し元２
        Test3.runSample2();
        // try-catchがないので例外はさらに呼び出し元に投げられる
    }
}
class Test3 {
    static void runSample2() {
        // try-catchがないため呼び出し元に例外が投げられる
        int i;
        i = 10/0;
    }
}
