package basic.sample;

//ラッパークラスの利用
public class IntegerSample {
    public static void main(String[] args) {
        //クラスに設定された値(クラスフィールドと呼び,static修飾子が付く)
        System.out.println("Integerの最大値:" + Integer.MAX_VALUE);
        System.out.println("Integerの最小値:" + Integer.MIN_VALUE);

        //オートボクシング（プリミティブ→ラッパークラス）　自動変換されるので普通に代入されるだけ
        int i1 = 10;
        Integer integer1 = i1;
        System.out.println("基本型:" + i1);
        System.out.println("ラッパークラス:" + integer1);

        //アンボクシング（integer→int）　結局相互に代入できるんじゃ
        Integer integer2 = 20;
        int i2 = integer2;
        System.out.println("基本型:" + i2);
        System.out.println("ラッパークラス:" + integer2);

        //基本型への変換メソッド
        byte b = integer1.byteValue();
        short s = integer2.shortValue();
        long l = integer1.longValue();
        float f = integer1.floatValue();
        double d = integer1.doubleValue();

        //文字列への変換メソッド
        String str = integer1.toString();

        //println()メソッドの引数に書くと自動的にtoString()が呼び出される
        System.out.println(integer1);

        //値の比較
        System.out.println(integer1.equals(10));//true
        System.out.println(integer1 == 10);//true
        System.out.println(integer1.equals(10.0));//false

        //型変換の見本
                //数値→文字
                double d1 = 20.0;
                String st = String.valueOf(d1);

                //文字→数値
                String number ="12.34";
                double d2 = Double.parseDouble(number); //基本型にしたい
                Double d3 = Double.valueOf(number); //ラッパークラスにしたい
            }

    }

