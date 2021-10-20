package basic.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        //宣言
        Map<String, String> stmap= new HashMap<>(35);//容量は大き目に取っておく
    //要素追加 .put
    stmap.put("apple","りんご");
    stmap.put("pineapple","パイナップル");
    stmap.put("orange","オレンジ");
    //表示
    System.out.println(stmap);   // ⇒{apple=りんご}

        //キー、値から対応する要素の取得　.get
        System.out.println(stmap.get("apple")); //　⇒りんご 対応する値が帰ってくる
    //キー(値についたインデックス)の一覧を取得　.keySet()
        System.out.println(stmap.keySet()); //　⇒[apple, orange, pineapple]
        //値のリスト .values()
        System.out.println(stmap.values()); //　⇒[りんご, オレンジ, パイナップル]

        //キーと値を同時に取得　.entrySet()
        for (Map.Entry entry: stmap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //⇒ apple:りんご
        //⇒ orange:オレンジ
        //⇒ pineapple:パイナップル

        //要素の削除 .remove
        System.out.println(stmap.remove("orange")); //⇒オレンジ

        //要素の変更 　再度.put　何が変更されたか、元の値を出す
        System.out.println(stmap.put("apple", "しいな")); //りんご
        System.out.println(stmap); //{apple=しいな, pineapple=パイナップル}
            //存在するキーに対してputをすると変更になる

//キーによる検索　　.containsKey
        //containsvalue　はあんま使わん
                //containsは、等価演算なので、同じ物がないとつかえない

        String search ="orenge"; //本来はキーボード入力で受け取る

        if (stmap.containsKey(search)){  //真偽でかえって来る。ので、必ず.getする
            System.out.println(stmap.get(search));  //　⇒しいな
        } else {
            System.out.println("Not find : "+search);
        }
    }     //containsで検索して、ifで見つかった時の処理をして、elseでないときを書く
}
