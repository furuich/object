package basic.human5;

class Secret implements Human {

    private  double age;
    private String name;

    public Secret(double age,String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "アブラム：";
    }

    @Override
    public void sayHello() {
        System.out.println("שלום"+name+"נעים להכיר אותך");
        System.out.println("年齢×２は"+getAge());
    }

    @Override
    public double getAge() {
        return age*2;
    }
}
