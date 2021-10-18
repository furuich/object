package ex.human5;

import basic.human5.Human;

class Chinese implements Human {
private String name;
private double age;

    public Chinese(String name,double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println("你好 "+name+" 謝謝～～！");
    }

    @Override
    public double getAge() {
        return age*2;
    }
}

