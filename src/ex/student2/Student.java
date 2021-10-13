package ex.student2;

public class Student {
    private String name,gender;
    private int jap,math,eng;

    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

   public   int sum(){
        return jap + math +eng;
    }

    public double ave(){
        return sum() /3.0;
    }


    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f %s %s",
        name,gender,jap,math,eng,sum(),ave());
    }

}
