package ex.person;

import basic.sample.enumsample.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static basic.sample.enumsample.Gender.MEN;

public class ViewPerson {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.addAll(Arrays.asList(
                new Person("しむら", MEN, 28),
                new Person("すどう", Gender.WOMEN, 34),
                new Person("そのだ", Gender.WOMEN, 21),
                new Person("さの", MEN, 42),
                new Person("せがわ", Gender.WOMEN, 55)
        ));
        //一覧
        System.out.println("デフォルト");
        personList.forEach(System.out::println);

        //比較関数作成　comparetor
        Comparator<Person> ageReverseOrder =
                Comparator.comparing(Person::getAge, Comparator.reverseOrder());

        Comparator<Person> nameOr = Comparator.comparing(Person::getName);

        Comparator<Person> ave1 = Comparator.comparing(Person::getAve);

        Comparator<Person> gender = Comparator.comparing(Person::getGender);

        //年齢降順
        personList.sort(ageReverseOrder);
        System.out.println("降順");
        personList.forEach(System.out::println);

//男性のみ

        System.out.println("\n男性のみ");


        //
        personList.sort(nameOr);
        for (Person a : personList) {  //要素を持って来てaに代入
            if (a.getGender().equals(MEN)) { //aから、.getGenderで性別を持ってくる
                System.out.println(a);
            }


            //課題４
            System.out.println("課題４");
            int sumMen = 0,sumWomen = 0;
            double countMen = 0,countWomen = 0;
            for (Person person:personList) {
                if (person.getGender().equals(Gender.MEN)){
                    countMen++;
                    sumMen += person.getAge();
                } else {
                    countWomen++;
                    sumWomen += person.getAge();
                }
            }
            System.out.println(String.format("男性の平均年齢:%.1f",sumMen/countMen));
            System.out.println(String.format("女性の平均年齢:%.1f",sumWomen/countWomen));

            //課題５
            List<Person> menList = new ArrayList<>();
            List<Person> womenList = new ArrayList<>();

            for (Person person:personList) {
                if (person.getGender().equals(Gender.MEN)){
                    menList.add(person);
                } else {
                    womenList.add(person);
                }
            }//年齢でソートして、最後尾をとって来るだけ

            System.out.println("課題５");
            menList.sort(Comparator.comparing(Person::getAge));
            womenList.sort(Comparator.comparing(Person::getAge));
            System.out.println("男性の最年長:" + menList.get(menList.size()-1));
            System.out.println("女性の最年長:" + womenList.get(womenList.size()-1));



        }
    }
}
