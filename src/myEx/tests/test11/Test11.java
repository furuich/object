package myEx.tests.test11;

class Test11 {
   //main
    public static void main(String[] args){
        System.out.println("Hello world!!yeahhhh!hoo");
    //変数宣言
        System.out.println("コメント：　// で　一行" +
                "\n/*  複数行 \n    *\\");

    int a=10,b=20,c=30;
    a=b=c;
    System.out.println("a"+a+"b"+b+"c"+c);
    //　⇒a30b30c30

    //特殊なリテラル
        double num1 = 3.14d;
        float num2 = 3.14f;
        long num3 =3L;
        System.out.printf("%f %f %d",num1,num2,num3);
    //  ⇒3.140000 3.140000 3

        boolean boo =true;

        if (!boo){
            System.out.println("\nboo==false");
        }else{
            System.out.println("\nboo==true");
        }
    //  ⇒

    }

}
