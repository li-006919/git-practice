package zuoyie;

import java.util.ArrayList;
import java.util.HashMap;

public class d12 {
    public static void main(String[] args) {
        ArrayList<String> array1=new ArrayList<>();
        array1.add("诸葛亮");
        array1.add("周瑜");

        ArrayList<String> array2=new ArrayList<>();
        array2.add("令狐冲");
        array2.add("林平之");

        ArrayList<String> array3=new ArrayList<>();
        array3.add("郭靖");
        array3.add("杨过");

        HashMap<String, ArrayList<String>> hm=new HashMap<>();
        hm.put("三国演义",array1);
        hm.put("笑傲江湖",array2);
        hm.put("神雕侠侣",array3);

        //jdk8 forEach嵌套遍历
        hm.forEach((bookName,personList)->{
            System.out.println(bookName);
            personList.forEach(p-> System.out.println("\t"+p));
        });
    }
}

