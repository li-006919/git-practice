package zuoyie;
import T1.TreeMapDemo1;

import java.util.HashMap;
import java.util.Set;
public class HashDemo {
    public static void main(String[] args) {
        HashMap<TreeMapDemo1.Student,String> hm=new HashMap<>();
        hm.put(new TreeMapDemo1.Student("西施", 27),"9999");
        hm.put(new TreeMapDemo1.Student("王昭君", 30),"8888");
        hm.put(new TreeMapDemo1.Student("貂蝉", 29),"6666");
        hm.put(new TreeMapDemo1.Student("杨玉环", 26),"7777");
        hm.put(new TreeMapDemo1.Student("西施", 27),"5555");//重复key，覆盖值

        Set<TreeMapDemo1.Student> keySet = hm.keySet();
        for (TreeMapDemo1.Student stu : keySet) {
            String v = hm.get(stu);
            System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+v);
        }
    }
}

