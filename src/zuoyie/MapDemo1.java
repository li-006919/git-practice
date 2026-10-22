package zuoyie;
import java.util.HashMap;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();
        hm.put("郭靖", "黄蓉");
        hm.put("令狐冲", "任盈盈");
        hm.put("杨过", "小龙女");
        hm.put("杨康", "穆念慈");

        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            String value = hm.get(key);
            System.out.println(key+"\t"+value);
        }

    }
}

