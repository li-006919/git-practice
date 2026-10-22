package zuoyie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("郭靖", "黄蓉");
        hm.put("令狐冲", "任盈盈");
        hm.put("杨过", "小龙女");
        hm.put("杨康", "穆念慈");

        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"\t"+value);
        }
        //hm.forEach((key,value)->System.out.println(key+"\t"+value));
    }
}
