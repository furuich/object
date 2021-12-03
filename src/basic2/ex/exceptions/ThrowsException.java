package basic2.ex.exceptions;

import java.io.IOException;

//例外をスローする構文
//例外を投げられた側は、try-catchしよう

//io=-input output 入出力用のパッケージ
class ThrowsException {
//投げる側で、複数形で例外を明示する
   static void readFile(String filepath) throws IOException {
       throw  new IOException (filepath+"　はないです！"); //
   }

    public static void main(String[] args) {
    try {
      readFile("C:\\neko-kawaii");
    }catch (IOException ex){
        System.out.println("例外発生: ファイルの読み込みに失敗しました\n"+ ex);
        ex.printStackTrace();

    }finally {

    }
    }
}
