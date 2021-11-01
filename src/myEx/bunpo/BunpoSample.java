package myEx.bunpo;

import myEx.bunpo.Classwake;
import myEx.bunpo.ClassWake2;

import java.security.Key;
import java.util.*;

class BunpoSample {
    public static void main(String[] args) {

        Map<String, List<Bunpo>> bunpoMaplist = new HashMap<>(30);

        List<Bunpo> bunpos = new ArrayList<>(30);
        bunpos.addAll(Arrays.asList(
                //basic
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", "final int num=100;"),

                new Bunpo("(type)変数名", Classwake.BASIC, ClassWake2.NONE,
                        "型キャスト", "データ型変更、縮小変換不可。ワイドニング、ナローイング", "(double)num;"),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),


                //制御
                new Bunpo("if(条件){\n処理\n}else if(条件２){\n処理\n}else{\n処理\n}", Classwake.CONTROL, ClassWake2.NONE,
                        "条件の真偽に応じて実行する命令を分岐する。\nもし～ならば→if\nでなければ～。→else　if\nどれでもない→else",
                        "条件式は、必ず真偽判定ができるものにする", ""),

                new Bunpo("for (初期化; 条件式 ; 変化){\n  statements\n}", Classwake.CONTROL, ClassWake2.NONE,
                        "iを使ったfor。\n指定された回数だけ処理を繰り返す。条件が成立している間、ブロック内を反復する命令", "。前置判定", "for (int i = 1; i <= 10 ; i++) {　　　　　　　　　　　\n" +
                        "sum += i;\n" +
                        "System.out.println(i + \"回目: \" + sum);"),
                new Bunpo("for(データ型　受け取る変数名　: 参照するもの)", Classwake.CONTROL, ClassWake2.NONE,
                        "拡張for", "前置判定。インデックスを指定してないので、全部参照してしまう", "for (int num:array) {\n" +
                        "            if (max < num) 　　//maxがnumより小さいとき（numのほうが大きいとき）maxにnumを代入＝＝置き換える\n" +
                        "                max = num;" +
                        "最大値を見つける"),
                new Bunpo("switch() ", Classwake.CONTROL, ClassWake2.NONE,
                        "式の値によって処理を分岐する、等価比較。case、default、breakを使用", "式の値は、char／byte／short／int／String／enum型のいずれかのみ\nbreakをいれないと全て実行されてしまう(フォールスルーもあるけど)",
                        "int val = 3;\n" +
                                "    switch (val) {\n" +
                                "      case 1:\n" +
                                "        System.out.println(\"変数valは1です\");\n" +
                                "        break;\n" +
                                "      case 2:\n" +
                                "        System.out.println(\"変数valは2です\");\n" +
                                "        break;" +
                                "　　　　default:\n" +
                                "        System.out.println(\"変数valは1、2、3いずれでもありません\");\n" +
                                "        break;"),
                new Bunpo("while(継続する条件式) {\n" +
                        "statements\n" +
                        "}", Classwake.CONTROL, ClassWake2.NONE,
                        "条件式の真偽に応じて処理を繰り返す(trueの間繰り返す)前置判定", "前置判定、インクリメントがないと無限ループになる",
                        "int sum = 0;　//合計を初期化\n" +
                                "int i = 1;　//繰り返しの変数を初期化\n" +
                                "while (i <= 10) {\n" +
                                "sum += i;//合計を計算する\n" +
                                "System.out.println(i + \"回目: \" + sum);\n" +
                                "i++;　//i を増やす　最後に処理させるので最後に変化式を書こう\n" +
                                "}"),
                new Bunpo("do {\n" +
                        "statements\n" +
                        "} while(継続する条件式);", Classwake.CONTROL, ClassWake2.NONE,
                        "do-while。whileの後置判定版。\n条件式の真偽に応じて繰り返す", "後置判定（最低1回は実行）",
                        " do {\n" +
                                "      System.out.print(val + \"/\");\n" +
                                "      val++;\n" +
                                "    } while(val < 5); // 結果：7/\n" +
                                "  }\n" +
                                "}"),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),


                //メソッド
                new Bunpo("比較条件.equals(比較したいもの)) ", Classwake.METHODS, ClassWake2.NONE,
                        "equalsメソッド。文字列比較", "・==→参照先が等しいか。同じインスタンスである（同一である）\n・equls→異なるインスタンスだが、同じ値である。同値（等価）である", "if (entry.getValue().equals(Gender.MEN))\n while (!\"cat\".equals(str)){  "),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),


                //インターフェース
                new Bunpo("Map<String, List<Listのクラス名>> mapList名 = new HashMap<>();", Classwake.INTERFACE, ClassWake2.NONE,
                        "HashMapへArrayListデータを格納", "ネストのforで取り出す", "MapにListを格納\n" +
                        "List<Person> personList = new ArrayList<>(15);\n" +
                        "        Map<Birthplace,List<Person>> birthplacePersonMap = new HashMap<>();\n" +
                        "personList.addAll(Arrays.asList(\n" +
                        "                    new Person(\"やまだ\",Birthplace.HOKKAIDO,Gender.MEN,35),\n" +
                        "                    new Person(\"いけだ\",Birthplace.HOKKAIDO,Gender.WOMEN,26),\n" +
                        " for (Person person:personList) {\n" +
                        "            if (birthplacePersonMap.containsKey(person.getBirthplace())) {\n" +
                        "                birthplacePersonMap.get(person.getBirthplace()).add(person);\n" +
                        "            } else {\n" +
                        "                List<Person> list = new ArrayList<>();\n" +
                        "                list.add(person);\n" +
                        "                birthplacePersonMap.put(person.getBirthplace(),list);"),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),


                //other
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", ""),
                new Bunpo("final データ型　変数名= ", Classwake.BASIC, ClassWake2.NONE,
                        "定数宣言", "再代入不可", "")

                //ob指向
                // 継承
                //classq


        ));
        //分類してMapにする
        //Maplistのキーにしたいものを指定して仕分ける
        //MaplistからcontainsKeyでさがしてMapに代入する
        for (Bunpo bunpo : bunpos) {
            if (bunpoMaplist.containsKey(bunpo.getClasswake())) {
                bunpoMaplist.get(bunpo.getClasswake()).add(bunpo);
            } else {//空のlistを作る
                List<Bunpo> bunpos1 = new ArrayList<>();
                bunpos1.add(bunpo);
                bunpoMaplist.put(bunpo.getClasswake().getJpName(), bunpos1);
            }

        }
        System.out.println("\n" + bunpoMaplist + "\n");


        //値による検索
        //キーの入力

        System.out.println("検索を受け付けます");


        for (Map.Entry entry : bunpoMaplist.entrySet()) {

            for (Bunpo bunpo : (List<Bunpo>)entry.getValue()) {
                String message=bunpo.inputString();
                if (entry.getValue().equals(message)){
                    System.out.println(message+"がありました");
                        System.out.println(bunpoMaplist.get(message));

                } else {
                    System.out.println("Not find " + message);
                }
            }
        }





    }


    }
