package myEx.tests.test11;

class ArraySample {
    public static void main(String[] args) {
        //配列の練習
        int[] arrays = {10,50,44,64,4,7};
        System.out.println(arrays[0]);

        //forで参照
        for (int ar :arrays) {
            System.out.println(ar);
        }
            //初期化
            //大きさだけ指定
            int[] array1 = new int[2];
        array1[0] = 1;
        array1[1] = 2 ;

        //初期値指定
            int[] array2 = {10, 12,23,11};
        //初期値と型を指定
            int[] array3 = new int[] {5,7,6,9,8};

            System.out.println("\narray1の大きさ：　"+array1.length+", 要素[0]：　"+array1[0]);
        int array4[] = {10,20};


        }

}
