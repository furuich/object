package ex.figure2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class FigureSample {

    public static void main(String[] args) {

//宣言
        List<Figure> figure = new ArrayList<>(); //<>内は、型を入れるので、継承済みのFigureが使える

        figure.addAll(Arrays.asList(
                new Rectangle(10, 21, 12),
                new Triangle(10, 20),
                new Circle(10)
        ));
        figure.add(new Rectangle(10, 20, 30)); //これで１つずつ追加してもおｋ


        for (Figure f : figure) { //for (int num:array) 参照した値を入れる変数宣言：配列名
            System.out.println(f);
            System.out.println(f.getArea());


        }
    }
}
