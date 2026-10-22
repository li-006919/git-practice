package zuoyie;
import java.util.*;

public class d13 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();

        String[] colors = {"红桃", "黑桃", "方片", "梅花"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                String poker = number + color;
                hm.put(index, poker);
                array.add(index);
                index = index + 1;
            }
        }
        hm.put(index, "大王");
        array.add(index);
        index = index + 1;
        hm.put(index, "小王");
        array.add(index);

        //洗牌
        Collections.shuffle(array);

        TreeSet<Integer> Tom = new TreeSet<>();
        TreeSet<Integer> Jeck = new TreeSet<>();
        TreeSet<Integer> Mike = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        //发牌，留3张底牌
        for (int x = 0; x < array.size(); x++) {
            if (x >= array.size() - 3) {
                dipai.add(array.get(x));
            } else if (x % 3 == 0) {
                Tom.add(array.get(x));
            } else if (x % 3 == 1) {
                Jeck.add(array.get(x));
            } else if (x % 3 == 2) {
                Mike.add(array.get(x));
            }
        }

        System.out.println("==每人的展示====================");
        lookPoker("Tom", Tom, hm);
        System.out.println("------------------------");
        lookPoker("Jeck", Jeck, hm);
        System.out.println("------------------------");
        lookPoker("Mike", Mike, hm);
        System.out.println("------------------------");
        lookPoker("Dipai", dipai, hm);
        System.out.println("==============================");
    }

    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(name + ":");
        for (Integer key : ts) {
            String value = hm.get(key);
            System.out.print(value + "  ");
        }
        System.out.println();
    }
}
