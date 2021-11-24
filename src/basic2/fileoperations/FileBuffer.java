/*
package basic2.fileoperations;

import java.io.*;

class FileBuffer {
    public static void main(String[] args) {
        //バッファリング処理

        try(BufferedReader reader = new BufferedReader(
               new InputStreamReader(
                        new FileInputStream("相対パス"),"UTF-8"));
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("出力パス"),"UTF-8")))


   String line;
      while ((line = reader.readerLine()) != null){
           writer.write(line);
           writer.newLine();
        }catch(IOException e){
           e.print
        }
    }
}

 */
