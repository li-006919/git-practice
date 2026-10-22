package zuoyie;

public class StringTest {
    public static void main(String[] args) {
        String str = new String("a");
        StringBuilder sb = new StringBuilder(str);

        System.out.println(str);
        System.out.println(sb.append(6546.76434).append('$'));
        System.out.println(sb.length());

    }
}
