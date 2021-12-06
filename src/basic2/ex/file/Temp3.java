package basic2.ex.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

class Temp3 {
    public static void main(String[] args) {

        //ArrayList ver

            String first2 = "src/basic2/ex/file";
            String fileName2 = "temp.txt";
            Path path = Path.of(first2, fileName2);

            if (Files.exists(path)) {
                List<String> list = Arrays.asList("みごとな", "JAVA", "構文");
                try {
                    Files.write(path, list);
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }

            }
    }
}
