package basic2.ex.exceptions;

class ArrayException {
    public static void main(String[] args) {

        int[] array2 = {0, 1, 2, 3};

        try {   //もしかしたらエラーが起こるかもしれない処理
            System.out.println(array2[4]);
            //→.ArrayIndexOutOfBoundsException発生
        } catch (ArrayIndexOutOfBoundsException ex) {  //可能性のあるエラーの受け皿を作っておく。
            // 捕捉したときにする処理を記述
            //
            System.out.println("!ArrayIndexOutOfBoundsException 発生!　\n配列のインデックスに存在しない値です" + ex);
            ex.printStackTrace();

        } finally {//本来ならcloseメソッドを記述//例外の有無に関わらず実行される
            System.out.println("Exception 練習　close");
            //.close();
        }


    }
}
