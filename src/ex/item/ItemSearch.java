package ex.item;

import java.util.*;

public class ItemSearch {
    public static void main(String[] args) {

        Map<Integer,Item> items = new HashMap<>(15); //番号が必要なので、キーはIntege
       //＜＞内はデータ型なので、値はクラス型でも宣言できる
        //value が、Item型。List型も出来るよ

        items.put(1, new Item(1,"消しゴム",100));
        items.put(2,new Item(2,"ボールペン",120));
        items.put(3,new Item(3,"コンパス",400));
        items.put(4,new Item(4,"定規",200));
        items.put(5,new Item(5,"ノート",140));
        items.put(6, new Item(6,"付箋",480));
        items.put(7, new Item(7,"えんぴつ",500));


    for (Item it :items.values()){
        System.out.println(it);
    }


        int searchNo =1;
        System.out.println("商品ID　"+searchNo+"　を検索します");
       if (items.containsKey(searchNo)){
           System.out.println("ありました！");
           System.out.println(items.get(searchNo));
       }else{
           System.out.println("Not find"+searchNo);
       }


    }

}
