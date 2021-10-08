package basic.student;

public class StudentSample {
    public static void main(String[] args) {
        Student student1= new Student("マリアタチバナ","女性",1);
        Student student2= new Student("にゃー","メス",2);
        //Studentでクラス宣言してるので大文字な

//インスタンス利用
        //student１参照、表示
        System.out.println(student1.getName()); //return name が入ってるのでnameが帰ってくる。
        System.out.println(student1.getGender()); //return gender が入ってるのでgenderが戻ってくる
        System.out.println(student1.getGrade());
        System.out.println(student1);
    //student2
        System.out.println(student2.getName());
        System.out.println(student2.getGender());
        System.out.println(student2.getGrade());
        System.out.println(student2);

        //値のセット
        student1.setName("ゴメンこっち"); //再代入している
        System.out.println(student1);
    }


}
