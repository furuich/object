package basic.human4;

class Chinese extends Human {

    public Chinese(String name) {
        super(name); //super class(Human) のnameコンストラクタ呼び出し
        //Humanの、protected String name; が肝。protectedなんでサブクラスから参照できる
    }

    @Override
    public void sayHello() {
        System.out.println("你好 "+name+" 謝謝～～！");
    }
}

