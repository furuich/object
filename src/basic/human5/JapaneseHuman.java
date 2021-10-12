package basic.human5;

class Japanese implements Human { //クラス名　extends superクラス で継承できる

    private double age;
    private String name;
    //コンストラクタ　継承しても必須

    public Japanese(double age,String name) {
        this.name = name;
        this.age = age;
    }


    @Override  //Human（スーパークラス）のsay.helloを呼び出してオーバーライド（上書き、変更）
    public void sayHello() {
        System.out.println("こんにちは！"+name+"ですよ。");
    }//多態性によりクラスごとにふるまいを変えることができる

    @Override
    public double getAge() {
        return age*2;
    }
}//機能が同じで、処理内容が違うときに使おう

