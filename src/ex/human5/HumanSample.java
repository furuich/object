package ex.human5;

import basic.human5.Human;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanSample {
    public static void main(String[] args) {

        List<Human> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new English(12.5, "jemini"),
                new Chinese("李紅蘭", 12.2),
                new Japanese(12.5, "いちろう"),
                new Secret(30.0, "אַבְרָהָם")
                )
                
        );




        //処理実行命令
for (Human h:list){
    h.sayHello();   //hのsayhelloだけ呼び出す
    h.getAge();
}

    }
}
