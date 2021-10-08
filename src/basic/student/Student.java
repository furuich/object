package basic.student;

//データとしてのクラス宣言
class Student {

    //フィールドの宣言  名前、性別、学年
    private String name;
    private String gender;
    private int grade;

    //コンストラクタ。変数初期化
    public Student(String name, String gender, int grade) {
        this. name = name;  //this.がないと警告が出る
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {      //Stringで返してください。引数無し。もらうだけ
        return name;
    }
                                //
   public void  setName(String name) {   //String　nameを渡すだけ。もらわない
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                '}';
    }
}
