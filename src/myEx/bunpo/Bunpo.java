package myEx.bunpo;

class Bunpo {
    private String name;
    private Classwake classwake;
    private ClassWake2 classWake2;
    private String use;
    private String attention;
    private String ex;


    public Bunpo(String name, Classwake classwake, ClassWake2 classWake2, String use, String attention,String ex) {
        this.name = name;
        this.classwake = classwake;
        this.classWake2 = classWake2;
        this.use = use;
        this.attention = attention;
        this.ex= ex;
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

    public String getEx() {
        return ex;
    }

    @Override
    public String toString() {
        return String.format("\n\n文法：　%s  \n分類：　%s %s \n用途：　%s   \n注意:　%s \n \n例文：\n　%s",
                name,classwake.getJpName(),classWake2.getJpName(),use,attention,ex);
    }
}
