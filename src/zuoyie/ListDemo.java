package zuoyie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo {
    public static void main(String[] args) {
        // (1)
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        // (2)
        System.out.println("----迭代器遍历方式----");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // (3)
        System.out.println("----增强for遍历方式----");
        for (String s : list) {
            System.out.println(s);
        }
        // (4)
        System.out.println("----JDK8的forEach遍历方式----");
        list.forEach(s -> System.out.println(s));
    }
}

