package basic.human4;

public class HumanSample {
    public static void main(String[] args) {
    Human[] humans={
            new English("jemini"),
        new Chinese("李紅蘭"),
            new Japanese("いちろう"),
            new Secret("אַבְרָהָם")};


        //処理実行命令
for (Human h:humans){
    h.sayHello();   //hのsayhelloだけ呼び出す
}

    }
}
