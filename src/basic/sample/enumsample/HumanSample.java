package basic.sample.enumsample;

class HumanSample {
    public static void main(String[] args) {
        Human human= new Human("Tom",Gender.OTHER,45);//String型じゃなく、列挙型になっている
        System.out.println(human);

        System.out.println(Gender.OTHER.name()); //　⇒OTHER
        System.out.println(Gender.WOMEN.ordinal()); //　⇒１　列挙順.配列と同じく0~
        System.out.println(Gender.OTHER);
    }
}
