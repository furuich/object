package myEx.bunpo;

public enum ClassWake2{
        BASIC("基本"),
        CONTROL("制御構文"),
        OBJECT("オブジェクト指向"),
        INHERITANCE("継承"),
        INTERFACE("インターフェース"),
        CLASSES("クラス"),
        RAP("ラッパー"),
        METHODS("メソッド"),
        NONE(" "),
        OTHER("その他"),
        COLLECTION("コレクションフレームワーク"),
        STRING("文字列"),
        MATH("数値演算");



public String jpName;

        ClassWake2(String jpName) {
        this.jpName = jpName;
        }

public String getJpName() {
        return jpName;
        }
        }
