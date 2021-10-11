package ex.keisyou;
//super class
class Animal {
    protected String eat;
    protected String toy;

    public Animal(String eat, String toy) {
        this.eat = eat;
        this.toy = toy;

        String[] strings = {eat, toy};
        for (String s : strings) {
            System.out.println(s);
        }
    }
}



