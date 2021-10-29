package myEx.map;

import java.util.*;


public class MapSample {
    public static void main(String[] args) {

        Map<String, List<Mapex>> vegeMap = new HashMap<>();

        List<Mapex> vegeList = new ArrayList<>();

        vegeList.addAll(Arrays.asList(
                new Mapex("青首大根", Variety.RADISH, "秋ごろ", "なんでもおｋ", 00),
                new Mapex("聖護院大根", Variety.RADISH, "11～2月", "辛みが少ない。なんでもおｋ", 00),
                new Mapex("アイコ", Variety.TOMATO, "夏", "甘味が強い", 00),
                new Mapex("桃太郎", Variety.TOMATO, "夏", "甘味が強い", 00),
                new Mapex("土佐一号", Variety.GINGER, "秋ごろ", "なんでもおｋ", 00),
                new Mapex("金時人参", Variety.CARROT, "冬～初春", "煮物がうまい", 00),
                new Mapex("八郎生姜", Variety.GINGER, "冬", "なんでもおｋ", 00)

        ));
        System.out.println("デフォ"+vegeList);

        for (Mapex mapex : vegeList) {
            if (vegeMap.containsKey(mapex.getVariety().getJpName())) {
                vegeMap.get(mapex.getVariety().getJpName()).add(mapex);

            } else {
                List<Mapex> exes = new ArrayList<>();
                exes.add(mapex);
                vegeMap.put(mapex.getVariety().getJpName(), exes);
            }


        }
        System.out.println("\nMap"+vegeMap);


        for (Map.Entry entry:vegeMap.entrySet()){
            for (Mapex mapex:(List<Mapex>)entry.getValue()){
                if (mapex.getVariety().getJpName().equals("大根")){
                    System.out.println("大根は美味い！！！");

                }
            }
        }


    }
}
