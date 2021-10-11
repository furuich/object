package basic.human3;

class Japanese extends Human { //クラス名　extends superクラス で継承できる

    //コンストラクタ　継承しても必須
    public Japanese(String name){
        super (name); //Human(name)としてるのと同じ＝＝superクラスのコンストラクタを呼び出して名前を与えている
    }
    //継承されているので、コンストラクタのみで実行出来る

    @Override  //Human（スーパークラス）のsay.helloを呼び出してオーバーライド（上書き、変更）
    public void sayHello() {
        System.out.println("こんにちは！"+name+"ですよ。");
    }//多態性によりクラスごとにふるまいを変えることができる
}//機能が同じで、処理内容が違うときに使おう

