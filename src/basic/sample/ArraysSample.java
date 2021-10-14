package basic.sample;

import java.util.Arrays;

public class ArraysSample {
    static int sum(int... array) {
        int sum = 0;   //sum初期化
        for (int value : array) { //forでarray要素を参照
            sum += value; //

        }
        return sum;
    }



    public static void main(String[] args) {
        //配列のcopy
        int[] oldArray ={10,50,64};
        int[] newArray = Arrays.copyOf(oldArray,
                oldArray.length +3); //要素の数は、負の数には出来ない
        //配列の文字列表現
        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));

        //配列のソート（整列）プリミティブ型のみ
        int[] array ={100,5,64,32};
        Arrays.sort(array); //自然順にソート（昇順）
        System.out.println(Arrays.toString(array));

    //バイナリーサーチ
        int[] array1 ={12,340,55,10,5};
        Arrays.sort(array1);
        //値５００を検索
        System.out.println(Arrays.binarySearch(array1,5)); //key
        System.out.println(Arrays.binarySearch(array1,4));

    //可変長引数
        System.out.println(sum(1,2,3,4,5));//メソッドがた引数..受け皿　配列型引数を受け取れる
        System.out.println(sum(10,20));

    char[] chars={'C','D','A','B','a'};
    Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

    }




}
