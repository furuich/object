package ex.peson2;

//課題１　各地域の平均年齢
//課題２　男女別の平均年齢
import basic.sample.enumsample.Gender;
import ex.peson2.Birthplace;

import java.util.*;

public class ViewPerson {
    public static void main(String[] args) {

        //１．Mapを宣言するList型の型までお忘れなく
        Map<String,List<Person>> listMap =new HashMap<>();

        List<Person> personList =new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("かぼちゃ",Birthplace.HOKKAIDO, Gender.MEN,23),
                new Person("高菜",Birthplace.FUKUOKA, Gender.MEN,45),
                new Person("ビル",Birthplace.TOKYO, Gender.WOMEN,22),
                new Person("紅しょうが",Birthplace.OSAKA, Gender.MEN,67),
                new Person("じゃがいも",Birthplace.HOKKAIDO, Gender.WOMEN,19),
                new Person("水なす",Birthplace.OSAKA, Gender.WOMEN,16),
                new Person("コーン",Birthplace.HOKKAIDO, Gender.WOMEN,76)

        ));

        System.out.println("デフォ"+personList);

        //２．MapにArrayListを追加していく
        for (Person person :personList){
            if (listMap.containsKey(person.getBirthplace().getName())){
                //containsKey→キーによる検索
                //Ｍａｐのキーとして引数が存在しますか？
                //していれば、そのキーを取り出して、listに加える

                listMap.get(person.getBirthplace().getName()).add(person);
                //条件はHasｈMap側で設定する
                //.get＝＝指定されたキーがマップされている値を返す
            }else {
                List<Person> pe =new ArrayList<>();
                pe.add(person);
                listMap.put(person.getBirthplace().getName(), pe);
            }
            // MapへListのgroup情報をわたしている
            //ここでlistをmapに代入している

        }

        System.out.println(listMap+"mapのリスト");

        //MapにArrayListで格納完了（地域毎の分類）


        //maplist　からageを取り出して、足し、
        // listにキャストして.sizeで割ろう！
      //forをネストにして、Mapの中のListを取り出してる
        for (Map.Entry entry :listMap.entrySet()){
            double hoSum=0;
            for(Person person :(List<Person>)entry.getValue()){
                hoSum+= person.getAge();
            }

           double ave = hoSum/ ((List<?>) entry.getValue()).size();

            System.out.println(ave);
        }

        //課題２
    for (Map.Entry entry: listMap.entrySet()){
        double menSum=0,woSum=0;

        for (Person person:(List<Person>)entry.getValue()){
            if (person.getGender().equals(Gender.MEN)){
                menSum+= person.getAge();
            }else {
                woSum+= person.getAge();
            }

            double menAve=menSum/((List<?>) entry.getValue()).size();
            double woAve =woSum/((List<?>) entry.getValue()).size();
            System.out.println("\n MEN AVE "+menAve);
            System.out.println("\n WOMEN AVE "+woAve);
        }

    }



    //キーと値を取り出す
        for (Map.Entry entry : listMap.entrySet()){
            //System.out.println(entry.getValue()+"Value");
            double menSum=0,woSum=0;

            for (Person person : (List<Person>)entry.getValue()) {


                if (entry.getValue().equals(Gender.MEN)) {
                    menSum += person.getAge();
                } else {
                    woSum += person.getAge();
                }
            }
            double menAve=menSum/((List<?>) entry.getValue()).size();
            double woAve =woSum/((List<?>) entry.getValue()).size();
            System.out.println("\n MEN AVE "+menAve);
            System.out.println("\n WOMEN AVE "+woAve);
            }
        }

    }

