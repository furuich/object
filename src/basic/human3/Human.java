package basic.human3;

    //継承
class Human {
    //フィールド
    protected String name; //protectedなんでサブクラスから参照できる

    public Human(String name) {
        this.name = name;
    }

    public void sayHello() {  //自分のフィールドで実行している
        System.out.println("Hello.I'm" + name+ ".");//渡して、そのまま完結するメソッド。何も返してもらわない
    }//消費型
}
