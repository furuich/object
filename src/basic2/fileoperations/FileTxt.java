package basic2.fileoperations;

import java.io.*;

class FileTxt {
    public static void main(String[] args) {

        //Inputするtxtファイルと、出力先ファイルのパスを指定する
        // （Input/Output　Streamの引数に渡す）
        //文字コードの指定が出来ることが醍醐味。Fileクラスじゃできない

        //絶対パス指定している。できれば相対パスでいこう
        try(InputStreamReader reader = new InputStreamReader(
                new FileInputStream("C:\\Users\\user.DESKTOP-04GR1BM\\IdeaProjects\\object\\src\\basic2\\fileoperations\\sample\\Sample.txt"),"UTF-8");
            OutputStreamWriter writer = new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\user.DESKTOP-04GR1BM\\IdeaProjects\\object\\src\\basic2\\fileoperations\\sample\\Sample2.txt"),"UTF-8")){

            //ファイルの内容を全て読み込む為のwhile文。
            // 最後まで読み込んだら　int・read（）が、ー１を返すので、それで判断している

       int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
