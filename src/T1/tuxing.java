package T1;

public class tuxing {
    public static void main(String[] args) {
        // 上半部分（从9个星号递减到1个）
        for (int i = 0; i < 5; i++) {
            // 打印前面的空格
            for (int j = 0; j < i; j++) {
                System.out.printf("  ");
            }
            // 打印星号
            for (int k = 0; k < 9 - 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 下半部分（从3个星号递增到9个）
        for (int i = 3; i >= 0; i--) {
            // 打印前面的空格
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // 打印星号
            for (int k = 0; k < 9 - 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}