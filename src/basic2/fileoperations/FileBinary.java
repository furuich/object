package basic2.fileoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileBinary {
    public static void main(String[] args) {

        //img.pngを読み込んで、img2.pngに書き込むPG
        try(FileInputStream in = new FileInputStream("C:\\Users\\user.DESKTOP-04GR1BM\\IdeaProjects\\object\\src\\basic2\\fileoperations\\sample\\img.png");
            FileOutputStream out = new FileOutputStream("C:\\Users\\user.DESKTOP-04GR1BM\\IdeaProjects\\object\\src\\basic2\\fileoperations\\sample\\img2.png")){
            int data;

            //ファイルの内容を全て読み込む為のwhile文。
            // 最後まで読み込んだら　int・read（）が、ー１を返すので、それで判断している
            //
            while ((data = in.read()) != -1){
                out.write((byte) data);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
