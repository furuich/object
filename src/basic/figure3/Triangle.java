package basic.figure3;

public class Triangle implements IfGetArea {
    private double height;
    private double base;
//cons
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    //getter
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
//getArea


    @Override
    public String toString() {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
        //https://java-code.jp/173
        return String.format("三角形 高さ:%.2f 底辺:%.2f 面積:%.2f",
                height,base,getArea());  //表示の仕方なので戻り値がStringになっている。
    }

    @Override
    public double getArea() {
        return base*height/2;
    }
}