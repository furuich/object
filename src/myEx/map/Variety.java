package myEx.map;
//列挙型。
// Stringのフィールド、コンストラクタ、getter

public enum Variety {
    RADISH("大根"),
    TOMATO("トマト"),
    GINGER("生姜"),
    CARROT("人参");

public String jpName;

    Variety(String jpName) {
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}
