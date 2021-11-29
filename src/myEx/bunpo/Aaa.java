package myEx.bunpo;
import java.util.HashMap;
import java.util.Map;


class Aaa {

        public static void main(String[] args) {
            Map<String, String> map = new HashMap<String, String>() {
                {
                    put("パソコン", "personal computer");
                    put("エアコン", "air conditioner");
                    put("リモコン", "remote control");
                }
            };

            for (String str : map.keySet()) {
                System.out.println(str + ":" + map.get(str));
                // 結果：エアコン:air conditioner、パソコン:personal computer、リモコン:remote control
            }

            for (String val : map.values()) {
                System.out.println(val + ":" + map.get(val));
                // 結果：air conditioner、personal computer、remote control
            }

            System.out.println(map.containsKey("エアコン"));    // 結果：true
            System.out.println(map.containsValue("tourconductor")); // 結果：false

            if (!map.isEmpty()) {
                System.out.println("要素数は" + map.size() + "個です。");
                // 結果：要素数は3個です。
            }

            map.remove("パソコン");
            System.out.println(map);
            // 結果：{エアコン=air conditioner, リモコン=remote control}

            map.clear();
            System.out.println(map);    // 結果：{}
        }
    }

