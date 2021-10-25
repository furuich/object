package basic.sample.map.student;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample {
    public static void main(String[] args) {
        //クラスごとのMap
        Map<String, List<Student>> studentGroup = new HashMap<>(50);
        //Key の型、値の型　値の型の型 Map自体の宣言してるだけで
        //mapへの追加はしていない

        List<Student> studentList = new ArrayList<>(100);
        //ArrayList宣言・要素追加
        studentList.add(new Student("1-1", "東芝", Gender.MEN, 58, 80, 10));
        studentList.add(new Student("1-1", "三菱", Gender.WOMEN, 92, 82, 37));
        studentList.add(new Student("1-1", "大発", Gender.MEN, 49, 91, 65));

        studentList.add(new Student("1-2", "シャープ", Gender.MEN, 40, 83, 71));
        studentList.add(new Student("1-2", "ぺんてる", Gender.WOMEN, 92, 36, 37));
        studentList.add(new Student("1-2", "Tombow", Gender.MEN, 55, 5, 12));

        studentList.add(new Student("1-3", "奈良", Gender.MEN, 58, 66, 14));
        studentList.add(new Student("1-3", "べったら", Gender.WOMEN, 92, 45, 52));
        studentList.add(new Student("1-3", "たくあん", Gender.MEN, 49, 86, 22));

        studentList.add(new Student("1-4", "伊藤", Gender.WOMEN, 58, 23, 82));
        studentList.add(new Student("1-4", "後藤", Gender.WOMEN, 77, 82, 73));
        studentList.add(new Student("1-4", "加藤", Gender.OTHER, 54, 91, 11));

        studentList.add(new Student("1-5", "シアン", Gender.WOMEN, 72, 99, 88));
        studentList.add(new Student("1-5", "マゼンタ", Gender.MEN, 1, 12, 27));
        studentList.add(new Student("1-5", "ネイビー", Gender.MEN, 35, 22, 55));


        //一人一人参照して、クラスごとにListをわける
        for (Student s : studentList) {
            //１５人を一斉に読み込む
            if (studentGroup.containsKey(s.getGroup())) {
                //containsKey→キーによる検索
                //Ｍａｐのキーとして引数が存在しますか？
                //trueかfalse
                studentGroup.get(s.getGroup()).add(s);
                //リストにaddで追加.
            } else {
                //新しいキー作成
                //空のリストをセット
                List<Student> list = new ArrayList<>();
                list.add(s);
                //空のListを作成して、渡している
                studentGroup.put(s.getGroup(), list);
                //put==Mapへの追加なので、
                // MapへListのgroup情報をわたしている
                //ここでlistをmapに代入している
            }

            //⇒
        }
        System.out.println(studentGroup);

        for (Map.Entry entry : studentGroup.entrySet()) { //KeyとValueを同時に取り出す
            System.out.println(entry.getValue());
            //
        }


        System.out.println("\n課題\n");

        for (Map.Entry entry : studentGroup.entrySet()) {
            //KeyとValueを同時に取り出す.
            // entrysetのときは、絶対Map.Entry型
            double sumJap = 0,sumMath = 0,sumEng = 0;
            //合計の器をつくる
            for (Student student:(List<Student>)entry.getValue()) {
                sumJap += student.getJap();
                sumMath += student.getMath();
                sumEng += student.getEng();
            }
            //合計を入れていく
            double aveJap = sumJap /((List<?>) entry.getValue()).size();
            //ArrayListのサイズで割ってる。
            // ((List<?>)は、キャストしてSizeメソッドを使えるようにしている
            // しかもワイルドカード
            double aveMath = sumMath /((List<?>) entry.getValue()).size();
            double aveEng = sumEng / ((List<?>) entry.getValue()).size();
            //個数で割っていく
            System.out.println(String.format("クラス：%s 　国語平均：%.2f 数学平均：%.2f 英語平均：%.2f",
                    entry.getKey(),aveJap,aveMath,aveEng));
            }

        ////Map内にクラス分けされたArrayListが入っているので、
        //　　　ArrayListでforすると、そりゃ一人ずつ参照になりますわ
        //
                //ぐちゃぐちゃに出現してても、きれいにだしてくれる
                //ArrayListを取り出してくれるので
                //クラス毎にリストで取り出せる
            }
        }


