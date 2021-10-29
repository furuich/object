package myEx.bunpo;

class Bunpo {
    private String name;
    private Classwake classwake;
    private ClassWake2 classWake2;
    private String use;
    private String attention;

    public Bunpo(String name, Classwake classwake, ClassWake2 classWake2, String use, String attention) {
        this.name = name;
        this.classwake = classwake;
        this.classWake2 = classWake2;
        this.use = use;
        this.attention = attention;
    }

    public String getName() {
        return name;
    }

    public Classwake getClasswake() {
        return classwake;
    }

    public ClassWake2 getClassWake2() {
        return classWake2;
    }

    public String getUse() {
        return use;
    }

    public String getAttention() {
        return attention;
    }

    @Override
    public String toString() {
        return String.format("文法：　%s  \n分類：　%s %s \n用途：　%s   \n注意:　%s",
                name,classwake.getJpName(),classWake2.getJpName(),use,attention);
    }
}
