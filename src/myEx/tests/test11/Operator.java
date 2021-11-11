package myEx.tests.test11;

class Operator {
    public static void main(String[] args) {
        //operator
        short sNum= 10;
        int intNum =sNum;
        System.out.println(intNum);

        double doubleNum = 10.5d;
        float floatNum= (int)doubleNum;
        System.out.println(floatNum);
        //int にキャストしてるので、小数点の数字は失われる


        //演算子
        int a=1,b=2,c=3,d=4,e=5;
        System.out.println("\n演算子だよ  int a=1,b=2,c=3,d=4,e=5");
        //算術演算子 +-/*　%（余りを求める）
        System.out.println("a+b= "+a+b);
        System.out.println("=b-a "+(b-a));
        System.out.println("e%b(5/２の余り)　＝　"+e % b);

        //算術演算子の単項→ 　++（インクリ）　--（デクリ） -（符号反転）
        System.out.println("e++ = "+e++);
        System.out.println("++e = "+ ++e);
        //後に付けるか先につけるかによって、加算の順番が変わる
        //e++　→表示後に加算　　++e　→　加算して表示　

        //累乗　Math.pow()
        System.out.println("\nおまけのMath.pow(3,2)");
        System.out.println(Math.pow(3, 2));

        //⇒　　　　⇒







        //関係演算子　2項の比較、真偽判定
        System.out.println("関係演算子です。== != > >=  < <= instansof(左辺objectが右辺クラスのインスタンスであれば真");
            //== != > >=  < <=  instansof(左辺objectが右辺クラスのインスタンスであれば真)

        System.out.println("a == b(等価比較) : "+(a == b));
        System.out.println("a != b(異なれば真) : "+(a != b));
        System.out.println("a > b(成り立てば真) : "+(a > b));
        System.out.println("a < b(等価比較) : "+(a < b));

//条件演算子（3項演算子のみ）IF文に書き換えられる
        //条件　？　式１　：　式２
        System.out.println("条件式　ifで書き換えられる");
        System.out.println("b < 3 ? \"bは3より小さい\": \"３より大きい\" \n"+(b < 3 ? "3より小さい": "３より大きい"));
        System.out.println("b+cはa+cより..."+(b + c > a + c ? "大きい" : "小さいい"));

        //折角なんでかきかえてみた
        if (b < 3){
            System.out.println("ｂは3よりちいさい");
        }else{
            System.out.println("bは３より大きい");
        }



        //論理演算子（式同士の真偽判定）
        //　&&(AND) ||(OR) !(真偽反転==否定)
        System.out.println("\n論理演算子  &&(AND) ||(OR) !(真偽反転==否定)");
        System.out.println("a < b  && b < c : "+(a < b  && b < c ));
        System.out.println("a<b || b<a : "+(a < b || b < a  ));
        System.out.println("!(a<b) : " +!(a<b));

      //代入演算子　代入、代入と同時に計算　右辺の式を代入
        // = += -= *= /= %=

        double dA = 1.0d;
        System.out.println("\n代入演算子　= += -= *= /= %= ");
        System.out.println("double dA = 1.0d");
        System.out.println("dA += 100.0 : "+(dA += 100));
        System.out.println("dA -= 10 : "+(dA -= 10));
        System.out.println("dA *= 100 : "+(dA *= 100));
        System.out.println("dA /= 100 : "+(dA /= 100));
        System.out.println("dA %= 20 : "+(dA %= 20));
    //代入を同時にしているので、消費型ではなくなる。

    }
}
