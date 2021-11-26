package basic2.basics;

class Hukusyu {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(i + "　回目　" + sum);

            //何をするために使うの？
            //配列、Listの中身を取り出す、
        }

        String str = "cat";
        while (!str.equals("cat")) {  //falseの時（catじゃないとき）に実行し続ける
            System.out.println("pathが違う。再入力してね");
        }
        System.out.println("OK");//catに一致したときのみ実行される


    }
}