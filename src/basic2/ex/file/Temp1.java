package basic2.ex.file;
//tEXTファイルを作成する


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Temp1 {
    public static void main(String[] args) {
            String first = "src/basic2/ex/file";  //作成するパス指定
            String fileName = "temp.txt";//ファイル名指定
    //if文で、作成前にファイルの存在を確認
        // →　存在しなければ、try-catch（作成）へ進む

        //notExists→このパスが示すファイルが存在しないかどうかをテストします

        //try-catch内で作業する安心感パネェ
            if (Files.notExists(Path.of(first, fileName))) {
                try {
                    Files.createFile(Path.of(first, fileName));
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


