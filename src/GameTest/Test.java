package GameTest;

public class Test {
    public static void main(String[] args) {
        Role r1 = new Role('男', 100, "乔峰");
        Role r2 = new Role('男', 100, "郭靖");
        r1.show(r1, '男');
        r2.show(r2, '男');
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() <= 0) {
                System.out.println(r1.getName() + "获胜");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() <= 0) {
                System.out.println(r2.getName() + "获胜");
                break;
            }

        }
    }
}
