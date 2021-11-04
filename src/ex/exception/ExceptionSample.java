package ex.exception;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionSample {
    public static void main(String[] args) {
        try{
            //呼ぶ側。もしかしたらここで例外が発生するかも？
            ExTest.read();
        } catch (IOException e){//キャッチ
            System.out.println(e);

        }finally {
            System.out.println("finallyは例外に関係なく実行します");
        }//今回は無くてもエラーにならん
    }
}
class ExTest{
    //呼ばれる
    static void read() throws IOException{ //throw書く
        String dir ="D:\\workspace";
        String filename="test.txt";
        //存在しないので例外発生（IOException）
        List<String> line= Files.readAllLines(Paths.get(dir,filename),
                Charset.forName("SHIFT_JIS"));

    }
}