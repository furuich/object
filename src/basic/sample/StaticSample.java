package basic.sample;

class StaticSample {
    //static method sample
        /*
        足し算メソッド　add
        @param x int 一つ目の整数
        @param y int 二つ目の整数
        *@return int 加算した結果

        */
        static int add(int x ,int y){ //staticなんでnewとかいらない
            //int で戻すよ。int　ｘとyを渡すよ～
        return x+y;  //x＋yを返す。メソッド内に一つしか書けない
        }

   public static void main(String[] args) {
       System.out.println(StaticSample.add(10,20));
       int ans =add(100,50);  //staticつきなんですぐ使える
       System.out.println(ans);
        }
}
