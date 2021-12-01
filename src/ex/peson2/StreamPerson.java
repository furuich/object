package ex.peson2;

//Streamで書き換え
//メソッドチェインで記述していく
import basic.sample.enumsample.Gender;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

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


        System.out.println("\nEX 5 男性のみ"); //person.getGender
        personlist.stream()
                .filter(person -> person.getGender() .equals(Gender.MEN))
                //== でも表示できる
                //！personは引数！なので、名前はなんでもいい
                .forEach(System.out::println);

        System.out.println(" women only");
        personlist.stream()
                .filter(person -> person.getGender().equals(Gender.WOMEN))
                .forEach(System.out::println);

        //sortedメソッド使用。正の数の比較なので、第2引数が前方に来る
        System.out.println("\nEX 6 年齢降順"); //.sorted
        personlist.stream()
                .sorted((p1,p2) -> p2.getAge()- p1.getAge())
                .forEach(System.out::println);

        System.out.println(" Comparator 使用");   //.Comparator~reversed
        personlist.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                        .forEach(System.out::println);



        System.out.println("\n EX 7 男性のみ名前の昇順");
        personlist.stream()
                .filter(person -> person.getGender().equals(Gender.MEN))
                .sorted((p2,p1) -> p1.getAge() - p2.getAge())
                .forEach(System.out::println);

        System.out.println(" comparator ver ok");
        personlist.stream()
                .filter(person -> person.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getName))//orderの指定無しだと、ナチュラルオーダー（昇順）になる
                .forEach(System.out::println);

        System.out.println(" おさらい　女性名前昇順で");
        personlist.stream()
                .filter(p -> p.getGender().getJpName().equals(Gender.WOMEN.getJpName()))
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        System.out.println("\n\n EX　８　名前リスト生成して表示");//.collect 要素を走査(スキャン)し、結果を作成
        List<String> nameList =personlist.stream()              //まず代入して生成。新しくListを作らないと、結果を入れる先がない
            .map(Person::getName)   //メソッド参照
            .collect(Collectors.toList());  //collectors クラスでリスト化する
            nameList.forEach(System.out::println);

        //性別でグルーピングしたMAP<Gender, List<Person>>を生成し、内容を表示
        System.out.println("\n EX 9 性別でグルーピングしたMAP<Gender, Person>を生成し、内容を表示");//Map~entrySet() or keySet など
        Map<Gender,List<Person>> genderListMap = personlist.stream()    //まず結果の内容を詰めるList宣言
                .collect(Collectors.groupingBy(Person::getGender));     //

            genderListMap.entrySet().stream()   //Mapに含まれるSetを返して、それにStream生成する
                                                //一度閉じてるので、また新しくStream生成しよう
                        .map(s -> s.getKey().getJpName() + ":" + s.getValue())
                        .forEach(System.out::println);

            System.out.println("\n EX 10 男性で最年長の人を表示");
            Optional<Person> parson = personlist.stream()  //Optional→nullを含んでいてもいいオブジェクトを指定する。エラー回避
                                        .filter(p -> p.getGender().equals(Gender.MEN))  //filterで、性別が男性に振り分ける
                                        .max(Comparator.comparing(Person::getAge)); //ソートして、getAgeを参照して、maxに渡して出してもらう
            parson.ifPresent(p -> System.out.println(p)); //nullかも対策で記述。Optionalとセット。nullのときは実行しない

        System.out.println("\n EX 11 女性で最年長");//.max(終端)戻り値がOptionalの時は、結果を一つだけ取り出すやつ
        Optional<Person> parson2 = personlist.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .max(Comparator.comparing(Person::getAge));
        parson2.ifPresent(p -> System.out.println(p));

        System.out.println("　北海道で最年少");
        Optional<Person> parson3 = personlist.stream()
                .filter(p -> p.getBirthplace().equals(Birthplace.HOKKAIDO))
                .min(Comparator.comparing(Person::getAge));
        parson3.ifPresent(System.out::println);

        System.out.println("\n EX 12 女性の平均年齢");//.ave（）（終端）　戻り値がOptionalDouble
        OptionalDouble woAve = personlist.stream()      //.aveの戻り値がOptionalDouble型なので、OptionalDouble型で宣言する
                .filter(p -> p.getGender().equals(Gender.WOMEN))    //女性の平均年齢をintにキャストしたい→数値用の処理メソッドが使えるようになる
                .mapToInt(Person::getAge)   //nullにしないための文。intにキャストしている→なぜ？
                .average(); //このぶんでDouble型でもどる。OptionalIntだとエラー吐く
        woAve.ifPresent(System.out::println);

        System.out.println("\n EX 13 男性の平均年齢");
        OptionalDouble menAve = personlist.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)
                .average();
        menAve.ifPresent(System.out::println);

        System.out.println(" 北海道民の平均値");
        OptionalDouble ave = personlist.stream()
                .filter(p -> p.getBirthplace().equals(Birthplace.HOKKAIDO)) //filter の戻り値はboolean
                .mapToDouble(Person::getAge)    //小数点からAveを求めたいときは、mapToDoubleにしよう
                .average();
        ave.ifPresent(System.out::println);

    //誰が見ても分かりやすく、コーディング規約に合わせて書くのが前提
        //






    }
}
