package ex;

import basic.sample.enumsample.Gender;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static basic.sample.enumsample.Gender.MEN;
import static basic.sample.enumsample.Gender.WOMEN;

class ExViewPerson {
    public static void main(String[] args) {

        List<ExPerson> expersonList = new ArrayList<>();

        expersonList.addAll(Arrays.asList(
                new ExPerson("しむら", MEN, 28),
                new ExPerson("すどう", Gender.WOMEN, 34),
                new ExPerson("そのだ", Gender.WOMEN, 21),
                new ExPerson("さの", MEN, 42),
                new ExPerson("せがわ", Gender.WOMEN, 55)
        ));
        //一覧
        System.out.println("デフォルト");
        expersonList.forEach(System.out::println);

        //comp
        System.out.println("\n年齢昇順");
        Comparator<ExPerson>ageOr=Comparator.comparing(ExPerson::getAge);
        expersonList.sort(ageOr);
        for (ExPerson ag : expersonList){
            System.out.println(ag);
        }

    //女のみ
        System.out.println("\n女のみ降順");
        Comparator<ExPerson> nameOr=Comparator.comparing(ExPerson::getName);
        expersonList.sort(nameOr);
        for (ExPerson a: expersonList) {
            if (a.getGender().equals(Gender.WOMEN)) {
                System.out.println(a);
            }
        }

//男女平均
            System.out.println("男女");
            int menSum = 0, woSum = 0;  //forで使う合計の変数初期化
            double menC = 0, woC = 0;
            //doubleでiの代わりにカウントを宣言している。
            //ave計算で割るときにワイドニングを狙ったもの

            for (ExPerson person : expersonList) {
                if (person.getGender().equals(MEN)){
                    menC++;
                    menSum += person.getAge();
                }else{
                    woC++;
                    woSum += person.getAge();

                }
            }
        System.out.println(menSum/menC+"男性平均");
            //countで割れば良い
        System.out.println(woSum/woC+"女性平均");


            //

        }
    }

