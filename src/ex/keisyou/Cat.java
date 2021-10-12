package ex.keisyou;

class Cat  extends Animal {
    //フィールド
    private String name;
    private int age;
    private double weight;
//コンストラクタ

    public Cat( String name, int age, double weight) {
        super("かわいいねこ","さば");
        this.name = name;
        this.age = age;
        this.weight = weight;


    }

//getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        System.out.println(name + "です.体重は" + weight + "で、年齢は" + age + "です");
        return null;
    }
}

