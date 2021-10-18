package ex.human5;
import basic.human5.Human;

class English implements Human{

    private String name;
    private double age;


    public English(double age, String name) {
        this.name = name;
        this.age = age;
    }


    @Override
     public void sayHello() {
         System.out.println("i'm "+name+" nice to meet you");
        System.out.println("年齢＊２は"+getAge());
    }

    @Override
    public double getAge() {
        return age*2;
    }
}
