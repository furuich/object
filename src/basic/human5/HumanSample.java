package basic.human5;

public class HumanSample {
    public static void main(String[] args) {

        Human[] humans={
            new English(12.5,"jemini"),
            new Chinese("李紅蘭",12.2),
            new Japanese(12.5,"いちろう"),
            new Secret( 30.0,"אַבְרָהָם")
    };


        //処理実行命令
for (Human h:humans){
    h.sayHello();   //hのsayhelloだけ呼び出す
    h.getAge();
}

    }
}
