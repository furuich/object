package basic.figure3;

 class Rectangle implements IfGetArea {
    //フィールド　　//この変数使いますよ。適当に器を持ってくる
    private double height;  //他のクラスからは参照されない
    private double width;
    private double radius;

    //コンストラクタ  インスタンス生成。
    public Rectangle(double h, double width,double h2) { //publicなのでどこからでも参照できる
        this.height = h; //
        this.height= h2;
        this.width = width;
    }

    //ゲッター 個別に値を呼び出すときに使う。今回は使ってない
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    /**
     * 面積を求める　getArea（）
     * @return double 図形の面積
     */


     @Override
     public String toString() {
         //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
         //https://java-code.jp/173
         return String.format("長方形 高さ:%.2f 幅:%.2f 面積:%.2f",
                 height,width,getArea());  //表示の仕方なので戻り値がStringになっている。
     }//まとめて呼び出される.まとめて一括表示

     @Override
     public double getArea() {
         return height * width;
     }
 }

