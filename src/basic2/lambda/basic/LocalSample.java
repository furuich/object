package basic2.lambda.basic;

//ローカル、クラス
class LocalSample {
    public static void main(String[] args) {


        //ローカルクラス 宣言、メソッドのインスタンス生成
        class Local {
            public void sayHello() {
                System.out.println("Hello");
            }
        }
        Local local = new Local();
        local.sayHello();

        //ローカルクラスにIF実装（オーバーライド必須）
        class Local2 implements Runnable {
            @Override
            public void run() {
                System.out.println("Hello IF");
            }
        }
Runnable runnable = new Local2();
        runnable.run();


    }
}
