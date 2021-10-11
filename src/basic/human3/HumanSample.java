package basic.human3;

public class HumanSample {
    public static void main(String[] args) {
    Human h1= new Human("aaa");
    Human chinese =new Chinese("李紅蘭");//new HumanだとHumanクラスのインスタンスになっちゃうぞ
        Human hiroshi =new Japanese("ひろし");
        Human secret= new Secret("אַבְרָהָם");

        //処理実行命令
        h1.sayHello();
    chinese.sayHello();
    hiroshi.sayHello();
    secret.sayHello();

    }
}
