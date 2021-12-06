package basic2.ex.file;
//データを書き込む
import java.io.BufferedWriter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


class Temp2 {
    public static void main(String[] args) {
        String first = "./src/basic2/ex/file";
        String fileName = "temp.txt";
        Path path = Paths.get("src/basic2/ex/file/temp.txt");
        //Filesクラスの	newBufferedWriterメソッドの
        //引数の型はPathなので、生成しておこう

        //BufferedWriter ver

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            //
            writer.append(" ");
            writer.newLine();
            writer.append("です\\(^o^)/");
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        }
    }
