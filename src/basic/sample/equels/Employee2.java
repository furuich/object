package basic.sample.equels;

import java.util.Objects;

//従業員クラス
class Employee2 {
    private int id;  //id
    private String name; //社員名


    //コンストラクタ
    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {//すべてのオブジェクトを受け入れて比較
    //等しさの基準を定義している

        if (this == o) return true;
        //1.オブジェクトが等しいですか？→等しければtrueを返す

        if (o == null || getClass() != o.getClass()) return false;
        //               ob oのクラス   ＝   Enplyee（自分のクラス）　
        //  クラス名をとってきて、等しくなければfalseを返す。
        //  今回はサブクラスを含めてないので自分のクラスのもののみtrue

        Employee2 employee = (Employee2) o;
        //型変換して、変数empoyeeに代入　　
        return id == employee.id && Objects.equals(name, employee.name);
    }   //受け取った名前と、自分の名前が等しいか聞いてる

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
