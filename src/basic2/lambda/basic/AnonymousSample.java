package basic2.lambda.basic;

//匿名（無名）クラス作成
class AnonymousSample {
    public static void main(String[] args) {

        //この中かっこ｛｝の位置、；に注意
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello anonymous");
            }
        };
        runnable.run();
//Rannable[インターフェースを実装]した[無名クラスのインスタンス]を生成してる



        //lambda の記述　2箇所省略しちゃう
        Runnable runnable2 = () -> {
            System.out.println("hello lambda! これでも食え");
        };
    runnable2.run();
    //省略ポイント
        /* 1 new Rannable(){} 　インスタンス生成の文
           　→　Q　何型のインスタンスか分からんくない？
           　　　A　型推論使って、引数にIF指定して推測してるから大丈夫

           2 public void run（） 　オーバーライドするメソッドの宣言
           　→Q　どのメソッドをオーバーライドするか分からんくならん？
           　　　A　だから、関数型IF（抽象メソッドがひとつだけある）でしか使えないんだぜ
         */


        //型推論で記述　引数にIFを指定
        method(() -> {
            System.out.println("型推論"); });
    }
    public  static void method(Runnable r){
        r.run();
    }

}
