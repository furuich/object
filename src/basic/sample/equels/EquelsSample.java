package basic.sample.equels;

import basic.sample.equels.Employee;

public class EquelsSample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Jack");
        Employee employee2 =employee1;  //２に１を代入。１＝＝２
        Employee employee3 = new Employee(2,"Lucy");
        Employee employee4 = new Employee(1,"Jack");
        Employee2 employee21 =new Employee2(1,"Jack");


            //  1と4は、変数名は違うが、中の値(フィールド)が等しく、同じクラスのインスタンス
        //      なので、等しいOBとみなされる！

        //比較
        System.out.println("1と2が同じか:"+employee1.equals(employee2));
        System.out.println("1と3が同じか:"+employee1.equals(employee3));
        System.out.println("1と4が同じか:"+employee1.equals(employee4));
        System.out.println("1と21が同じか:"+employee1.equals(employee21));
        //      ⇒1と2が同じか:true　
        //         1と3が同じか:false　
        //         1と4が同じか:true　　newでアドレスが違っても同じOB
        //      1と21が同じか:false　　アドレスが違う＝＝別OB
    }
}
