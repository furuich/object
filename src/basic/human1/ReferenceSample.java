package basic.human1;

//参照型変数のサンプル
class ReferenceSample {
    public static void main(String[] args) {
        Human human1 = new Human("Tom",28);
        Human human2 =human1;  //human２に、１（Tom）を代入！？じゃない
        Human human3 = new Human(human1);

        System.out.println(human1);
        System.out.println(human2); //⇒Tomが2回出る
        human1.setName("aaa");  //参照型は、メモリ上のアドレスが入っているので、そのものを代入しているわけではない。値をかえても
                //newで新しく生成しないと、”変更”になってしまう
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3); //新しい器に、Tomのメモリのアドレスが入り、Tomが表示される！！
    }
}
