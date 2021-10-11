package basic.figure1;
import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
public double getArea(){  //ここで計算して、double型のgetAreaに値を返す。
        return ((Math.pow(radius,2)))*Math.PI;
}

    @Override
    public String toString() {
        return String.format("円:半径:%.2f 面積:%.2f",
                radius,getArea());
    }
}


