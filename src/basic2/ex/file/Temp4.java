package basic2.ex.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//ファイル読み込み
//Stream使用 Buffered ver
class Temp4 {
    public static void main(String[] args) {
        Path path = Paths.get("./src/basic2/ex/file/temp.txt");
        String first = "./src/basic2/ex/file";
        String fileName = "temp.txt";

        try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
         reader.lines()
               .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("\n");

        Path path2 = Path.of(first,fileName);

        if (!Files.isReadable(Path.of(first)) ||Files.notExists(Path.of(first))) {
            System.out.println("ファイルが読み込めません");
        }
        try {
            Files.lines(path2)
                    .forEach(System.out::println);
        }catch(IOException ex){
            ex.printStackTrace();


        }


    }
}
