package myEx.map;

public enum Cook {
    NIRU("煮る"),
    YAKU("焼く"),
    ITAMERU("炒める"),
    SEISYOKU("生食"),
    SONOMAMA("そのまま"),
    MUSU("蒸す"),
    OTHER("そのた");

    public String jpName;

    Cook(String jpName) {
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}
