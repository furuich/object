package ex.peson2;

//課題１　各地域の平均年齢
//課題２　男女別の平均年齢
import basic.sample.enumsample.Gender;

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

    //キーと値を取り出す
        for (Map.Entry entry : listMap.entrySet()){
            //System.out.println(entry.getValue()+"Value");
            double menSum=0,woSum=0,mCun=0,wCum=0;

            for (Person person : (List<Person>)entry.getValue()) {


                if (person.getGender().equals(Gender.MEN)) {
                    menSum += person.getAge();
                    mCun++;
                } else {
                    woSum += person.getAge();
                    wCum++;
                }
            }

            double menAve=menSum/mCun;
            double woAve =woSum/wCum;
            System.out.println(entry.getKey());
            //列挙型がlistMapのKeyになっているので、地域名が表示される
            System.out.println("\n MEN AVE "+menAve);
            System.out.println("\n WOMEN AVE "+woAve);
            }

        //MapのKeyに、地域名が設定されている！！

        //平均年齢の算出
        System.out.println("平均年齢");
        for (Map.Entry entry:listMap.entrySet()) {
            double sum= 0,cnt = 0,sumMen = 0,sumWomen = 0,menCnt = 0,womenCnt = 0;
            for (Person person:(List<Person>)entry.getValue()) {
                sum += person.getAge();
                cnt++;
                if (person.getGender().equals(Gender.MEN)) {
                    sumMen += person.getAge();
                    menCnt++;
                } else {
                    sumWomen += person.getAge();
                    womenCnt++;
                }
            }
            System.out.println("地域");
            System.out.println(String.format("全体平均:%.1f歳", sum/ cnt));
            System.out.println(String.format("男性平均:%.1f歳",(sumMen / womenCnt)));
            System.out.println(String.format("女性平均:%.1f歳",(sumWomen / womenCnt)));
        }




    }

    }

