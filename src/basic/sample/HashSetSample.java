package basic.sample;


import java.util.*;

public class HashSetSample {
    public static void main(String[] args) {
        //宣言
        Set<Integer> integers = new HashSet<>();
        //追加 add, addAll
    integers.add(10);
    integers.addAll(Arrays.asList(20,30));
        System.out.println(integers);
        //削除 remove
        integers.remove(20);
        System.out.println(integers);//10,30
        //要素数　.size
        System.out.println(integers.size());
        //空かどうか？ isEmpty
        System.out.println(integers.isEmpty());
        //値の検索　.contains()検索したい値
        System.out.println(integers.contains(20));//False
        //ArrayListからの変換
        List<Integer> integerList = new ArrayList<>(Arrays.asList(3,5,84,1,1));
        System.out.println("ArrayList"+integerList);//3.5.84.1.1
        Set<Integer> integerTreeSet =new TreeSet<>(integerList);
        System.out.println("Treeset"+integerTreeSet);//1.3.5.84
   Set<Integer> linked=new LinkedHashSet<>(integerList);
        System.out.println(linked);//3.5.84.1

    //Treesetは自動的にソートしてくれる
    }
}
