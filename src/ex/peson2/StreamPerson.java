package ex.peson2;

//Streamで書き換え

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StreamPerson {
    public static void main(String[] args) {

        List<Person> personlist = new ArrayList<>(15);
        personlist.addAll(Arrays.asList(
                new Person("かぼちゃ",Birthplace.HOKKAIDO, Gender.MEN,23),
                new Person("高菜",Birthplace.FUKUOKA, Gender.MEN,45),
                new Person("ビル",Birthplace.TOKYO, Gender.WOMEN,22),
                new Person("紅しょうが",Birthplace.OSAKA, Gender.MEN,67),
                new Person("じゃがいも",Birthplace.HOKKAIDO, Gender.WOMEN,19),
                new Person("水なす",Birthplace.OSAKA, Gender.WOMEN,16),
                new Person("コーン",Birthplace.HOKKAIDO, Gender.WOMEN,76),
                new Person("トマト",Birthplace.HOKKAIDO,Gender.OTHER,12)
        ));
    //年齢が３５歳以上の人表示
        System.out.println("EX　１　年齢が３５歳以上の人表示");
        personlist.stream() //.stream()→Stream生成
                .filter(p -> p.getAge() >= 35)//条件、渡す内容→３５歳以上抽出　//filter→中間操作条件に合致した要素のみに絞る
                    .forEach(p -> System.out.println(p.getName()));   //終端操作

        //年齢が35歳未満の人表示
        System.out.println("\nEX 2 年齢が35歳未満の人表示");
        personlist.stream() //生成
                .filter(p2 -> p2.getAge() < 35)//中間
                .forEach(System.out::println);//終端
        //こう書くと、合致した要素の情報全て表示される

        //ALL表示
        System.out.println("\nEX 3 ");
        personlist.stream()
                .forEach(System.out::println);  //中間操作は任意なので、無くてもいい

        //name only
        System.out.println("\nEX 4 名前のみ表示");
        personlist.stream()
                .forEach(person -> System.out.println(person.getName()));

        System.out.println(" 別解　");
        personlist.stream()
                .map(Person::getName) //map()→要素を置き換える
                .forEach(System.out::println);


        System.out.println("\nEX 5 男性のみ");
        personlist.stream()
                .filter(person -> person.getGender() .equals(Gender.MEN))
                //== でも表示できる
                .forEach(System.out::println);

        System.out.println(" women only");
        personlist.stream()
                .filter(person -> person.getGender().equals(Gender.WOMEN))
                .forEach(System.out::println);

        //sortedメソッド使用。正の数の比較なので、第2引数が前方に来る
        System.out.println("\nEX 6 年齢降順");
        personlist.stream()
                .sorted((p1,p2) -> p2.getAge()- p1.getAge())
                .forEach(System.out::println);

        System.out.println(" Comparator 使用");
        personlist.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                        .forEach(System.out::println);



        System.out.println("\n EX 7 男性のみ年齢昇順");
        personlist.stream()
                .filter(person -> person.getGender().equals(Gender.MEN))
                .sorted((p2,p1) -> p1.getAge() - p2.getAge())
                .forEach(System.out::println);

        System.out.println(" comparator ver ok");
        personlist.stream()
                .filter(person -> person.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getAge))//orderの指定無しだと、ナチュラルオーダー（昇順）になる
                .forEach(System.out::println);


    }
}
