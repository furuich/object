package basic.figure2;

class FigureSample {
    public static void main(String[] args) {



        Figure[] figures={  //figure型配列から取り出す。Figure型配列を宣言して、図形インスタンスを格納している。
                new Rectangle(10.54,18.23,12),
                new Triangle(10,20),
                new Circle(10)
        };

for (Figure f:figures){ //for (int num:array) 参照した値を入れる変数宣言：配列名
    System.out.println(f);
    System.out.println(f.getArea());
}

    }
}
