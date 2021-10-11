package basic.figure2;

//抽象クラス １．abstractを頭に付ける
abstract class Figure {
    //抽象メソッド　処理を書かんでいい
    //２．戻り値と引数、メソッド名定義
    abstract double getArea(); //図形クラスはgetAreaのみ。
    // 抽象クラスを継承した共通的な機能を書く。必ずオーバーライドする。
}
