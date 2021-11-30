package basic2.ex.inventory2;

//在庫管理PGのイメージ
//在庫の表示をする

import java.util.*;

class ViewStock implements Constants{
    public static void main(String[] args) {


        List<PersonalCompurter> pcList = new ArrayList<>();
        pcList.addAll(Arrays.asList(
                new PersonalCompurter("やまだ",1,1,40_000,Constants.BIT_64,Constants.WIN_10),
                new PersonalCompurter("いけだ",2,1,90_000,Constants.BIT_64,Constants.WIN_11),
                new PersonalCompurter("いのうえ",3,1,80_000,Constants.BIT_64,Constants.WIN_11),
                new PersonalCompurter("たむら",4,2,120_000,Constants.BIT_32,Constants.WIN_11),
                new PersonalCompurter("わだ",5,2,30_000,Constants.BIT_32,Constants.WIN_10),
                new PersonalCompurter("くどう",6,2,150_000,Constants.BIT_64,Constants.MAC),
                new PersonalCompurter("さらど",7,3,40_000,Constants.BIT_32,Constants.WIN_10),
                new PersonalCompurter("あいざわ",8,3,700_000,Constants.BIT_32,Constants.MAC)
        ));
        //p.get～()で各フィールドを表示できる
        for (PersonalCompurter p :pcList){
            System.out.println(p);
        }
//さてmapにいれるぞ　グループ分けしてるだけ
        //目的→倉庫番号で金額を出したい

        //1.初期化（型の宣言に注意）
        //キー→倉庫番号==integer　値→ArrayList（priceが目当て）
        Map<Integer ,ArrayList<Integer>> storagePriceMap = new HashMap<>();

            //for文でMapに代入
        for (PersonalCompurter p : pcList){
            int storageNo = p.getStorageNo(); //可読性の為変数で代入

            if (!storagePriceMap.containsKey(storageNo)){  //Mapに倉庫番号がふくまれているかどうか//同じキーがあったら、Mapに追加しないようにする
                storagePriceMap.put(storageNo, new ArrayList<>()); //キーに倉庫番号、 値に空のListを作成する
            }
        storagePriceMap.get(storageNo).add(p.getPrice());
            //Mapに代入したキーに対応した値（ArrayList構造だからadd）を追加する
        }
        //mapにNoを入れる→対応させたいもの（price）を値として入れる
        //キーと値を上書きさせずにまとめたい

        System.out.println("\n//中身確認");
        for (Map.Entry entry : storagePriceMap.entrySet()){
            System.out.println(entry.getKey()+" : ");
            System.out.println(entry.getValue());
        }

//↓　Map｛キー…番号　値…OS（ArrayList）
        Map<Integer ,ArrayList<String>> osMap = new HashMap<>();

        for (PersonalCompurter p2 : pcList){
            if (!osMap.containsKey(p2.getStorageNo())){
                osMap.put(p2.getStorageNo(),new ArrayList<>());
            }
        osMap.get(p2.getStorageNo()).add(p2.getOS());
        }
        System.out.println(osMap);

        //Map｛for文でキー→storage番号　に対応した値→新しいListを作成
        //同じキーが存在するので、上書きさせないためにifぶんで振り分ける。
        // 違うNo（キー）がでたら、それに対応したArrayList（値を作成）
        //



    }
}
