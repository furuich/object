package basic.human1;

//データとしてのクラス宣言
class Human {
    //フィールドの宣言
    private String name;  //俺たち専用の値を宣言するぜ！これが必要な。int a;みたいなもん
    private int age;

    //コンストラクタ
    public Human(String name, int age) { //まだ実値は与えられてない。下記の初期化に渡してる
        this.name = name;  //変数の初期化役。a = 0; てきな。privateだから、thisは無くてもいいんじゃない
        this.age = age;
    }
    //コンストラクタのオーバーロード（同名、引数が異なるメソッド）
    public Human(Human human){      //参照型で追記
        this.name = human.name;     //deep copy になってくれる
        this.age = human.age;
}



    //アクセサ（ゲッター）　//引数（渡すもの）無し、戻り値→String
    public String getName() {
        return name;
    }

    public int getAge() {   //引数なし。戻り値→int
        return age;
    }

    //アクセサ（セッター）
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toStringメソッド
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
