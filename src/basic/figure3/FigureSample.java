package basic.figure3;

class FigureSample {
    public static void main(String[] args) {

        IfGetArea[] figures={
                new Rectangle(10.54, 18.23, 12),
                new Triangle(10, 20),
                new Circle(10)
        };

        for (IfGetArea f :figures){
            System.out.println(f.getArea());
        }
        }
    }

