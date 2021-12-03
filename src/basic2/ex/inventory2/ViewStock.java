package basic2.ex.inventory2;

//在庫管理PGのイメージ
//在庫の表示をする

import java.util.*;

class ViewStock implements Constants {
    public static void main(String[] args) {


        List<PersonalCompurter> pcList = new ArrayList<>();
        pcList.addAll(Arrays.asList(
                new PersonalCompurter("やまだ", 1, 1, 40_000, Constants.BIT_64, Constants.WIN_10),
                new PersonalCompurter("いけだ", 2, 1, 90_000, Constants.BIT_64, Constants.WIN_11),
                new PersonalCompurter("いのうえ", 3, 1, 80_000, Constants.BIT_64, Constants.WIN_11),
                new PersonalCompurter("たむら", 4, 2, 120_000, Constants.BIT_32, Constants.WIN_11),
                new PersonalCompurter("わだ", 5, 2, 30_000, Constants.BIT_32, Constants.WIN_10),
                new PersonalCompurter("くどう", 6, 2, 150_000, Constants.BIT_64, Constants.MAC),
                new PersonalCompurter("さらど", 7, 3, 40_000, Constants.BIT_32, Constants.WIN_10),
                new PersonalCompurter("あいざわ", 8, 3, 700_000, Constants.BIT_32, Constants.MAC)//リテラルじゃなくて変数名で定数を記述
        ));
        //p.get～()で各フィールドを表示できる
        for (PersonalCompurter p : pcList) {
            System.out.println(p);
        }
//さてmapにいれるぞ　グループ分けしてるだけ
        //目的→倉庫番号で金額を出したい

        //1.初期化（型の宣言に注意）
        //キー→倉庫番号==integer　値→ArrayList（priceが目当て）　にマッピングしたい
        Map<Integer, List<Integer>> storagePriceMap = new HashMap<>();
        //ListとArrayListの違い　List<Integer>　OR　ArrayList<Integer>
        //　→ArrayListのほうが狭義なので、Listのほうが良いかも


        //for文でMapに代入
        for (PersonalCompurter p : pcList) {
            int storageNo = p.getStorageNo(); //可読性の為変数で代入

            if (!storagePriceMap.containsKey(storageNo)) {  //Mapに倉庫番号がふくまれているかどうか//同じキーがあったら、Mapに追加しないようにする
                storagePriceMap.put(storageNo, new ArrayList<>()); //キーに倉庫番号、 値に空のListを作成する
                //keyが入るたびに、対応する値を入れるArrayListがnewされる文
                //keyを重複させないために、存在するかif文で書く
            }
            storagePriceMap.get(storageNo).add(p.getPrice());
            //Mapに代入したキーに対応した値（ArrayList構造だからadd）を追加する
        }
        //mapにNoを入れる→対応させたいもの（price）を値として入れる
        //キーと値を上書きさせずにまとめたい

        System.out.println("\n//中身確認");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            System.out.println(entry.getKey() + " : ");
            System.out.println(entry.getValue());
        }

//↓　Map｛キー…番号　値…OS（ArrayList）
        Map<Integer, ArrayList<String>> osMap = new HashMap<>();

        for (PersonalCompurter p2 : pcList) {
            if (!osMap.containsKey(p2.getStorageNo())) {
                osMap.put(p2.getStorageNo(), new ArrayList<>());
            }
            osMap.get(p2.getStorageNo()).add(p2.getOS());
        }
        System.out.println(osMap);

        //倉庫ごとの合計
        System.out.println("\n倉庫ごとの合計金額");
        for (Map.Entry entry : storagePriceMap.entrySet()) {//entryset==キーと値のセットのこと。
            double sum = 0; //合計を入れる変数用意
            for (Integer i : (List<Integer>) entry.getValue()) { //キャストしないと怒られる
                sum += i; //sumにvalueが加算されていく
            }
            System.out.println("倉庫番号" + entry.getKey());
            System.out.println("合計金額： ¥" + sum);
        }
        //倉庫ごとの合計台数
        System.out.println("\n倉庫ごとの合計台数");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            int cnt = ((List) entry.getValue()).size(); //豪渓台数を入れる変数に　valueのサイズ＝＝台数　を代入
            System.out.println("倉庫番号" + entry.getKey());
            System.out.println("合計台数: " + cnt);
        }
        //倉庫ごとの平均金額
        System.out.println("\nEX 倉庫ごとの平均金額");

        for (Map.Entry entry : storagePriceMap.entrySet()) {
            //Mapをsetで回して、ネストで
            double ave = 0;  //forの外で使う場合、外側で宣言しよう
            double sum = 0;

            for (Integer i : (List<Integer>) entry.getValue()) {
                sum += i;
            }
            int cnt = ((List) entry.getValue()).size(); //これは、forの外側に出してもいい。不変だから
            ave = sum / cnt;
            System.out.println("倉庫番号 :" + entry.getKey());
            System.out.println("¥" + ave);
        }

        Map<Integer, ArrayList<String>> bitMap = new HashMap<>();
        for (PersonalCompurter compurter : pcList) {
            if (!bitMap.containsKey((compurter.getBit()))) {
                bitMap.put(compurter.getBit(), new ArrayList<>());
            }
            bitMap.get(compurter.getBit()).add(compurter.getUserName());

        }
        System.out.println(bitMap);
    }
}

