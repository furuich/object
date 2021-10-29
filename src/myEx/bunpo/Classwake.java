package myEx.bunpo;

public enum Classwake {
    BASIC("基本"),
    CONTROL("制御構文"),
    OBJECT("オブジェクト指向"),
    INHERITANCE("継承"),
    INTERFACE("インターフェース"),
    CLASSES("クラス"),
    RAP("ラッパー"),
    METHODS("メソッド"),
    NONE("なし"),
    OTHER("その他");

    public String jpName;

    Classwake(String jpName) {
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}
