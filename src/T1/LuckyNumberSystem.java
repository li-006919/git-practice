package T1;
import java.util.Random;
import java.util.Scanner;
public class LuckyNumberSystem {
    // 全局变量：存储用户信息（用户名、密码、卡号、注册状态）
    private static String username;
    private static String password;
    private static int cardNumber;
    private static boolean isRegistered = false;
    private static boolean isLoggedIn = false;
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        // 外层循环：控制整个系统的持续运行
        while (true) {
            // 1. 输出菜单
            printMenu();

            // 2. 获取用户菜单选择
            System.out.print("请选择菜单：");
            int choice = getMenuChoice();

            // 3. 根据选择执行对应功能
            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    luckyDraw();
                    break;
                default:
                    System.out.println("您的输入有误！");
            }

            // 4. 询问是否继续
            if (!askContinue()) {
                System.out.println("系统退出，谢谢使用！");
                break;
            }
        }
        sc.close();
    }

    // ========== 阶段1：菜单输出 ==========
    private static void printMenu() {
        System.out.println("*****欢迎进入奖客富翁系统*****");
        System.out.println("\t1.注册");
        System.out.println("\t2.登录");
        System.out.println("\t3.抽奖");
        System.out.println("****************************");
    }

    // 获取菜单输入，处理非数字输入
    private static int getMenuChoice() {
        while (!sc.hasNextInt()) {
            System.out.println("您的输入有误！");
            System.out.print("请选择菜单：");
            sc.next();
        }
        return sc.nextInt();
    }

    // ========== 阶段2：循环询问是否继续 ==========
    private static boolean askContinue() {
        System.out.print("继续吗？(y/n)：");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("y")) {
                return true;
            } else if (input.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("您的输入有误！请输入y或n：");
            }
        }
    }

    // ========== 阶段3：注册功能 ==========
    private static void register() {
        System.out.println("[奖客富翁系统 > 注册]");
        if (isRegistered) {
            System.out.println("您已注册，无需重复注册！");
            return;
        }

        System.out.println("请填写个人注册信息：");
        System.out.print("用户名：");
        username = sc.next();
        System.out.print("密码：");
        password = sc.next();

        // 生成4位随机卡号（1000-9999）
        cardNumber = random.nextInt(9000) + 1000;
        isRegistered = true;

        // 显示注册成功信息
        System.out.println("注册成功，请记好您的会员卡号");
        System.out.println("用户名\t密码\t会员卡号");
        System.out.println(username + "\t" + password + "\t" + cardNumber);
    }

    // ========== 阶段4：登录功能 ==========
    private static void login() {
        System.out.println("[奖客富翁系统 > 登录]");
        if (!isRegistered) {
            System.out.println("您还未注册，请先注册！");
            return;
        }
        if (isLoggedIn) {
            System.out.println("您已登录，无需重复登录！");
            return;
        }

        // 最多3次输入机会
        int chance = 3;
        while (chance > 0) {
            System.out.print("请输入用户名：");
            String inputUser = sc.next();
            System.out.print("请输入密码：");
            String inputPwd = sc.next();

            if (inputUser.equals(username) && inputPwd.equals(password)) {
                System.out.println("欢迎您：" + username);
                isLoggedIn = true;
                return;
            } else {
                chance--;
                if (chance > 0) {
                    System.out.println("用户名或密码错误，您还有" + chance + "次机会！");
                } else {
                    System.out.println("3次输入错误，系统锁定！");
                }
            }
        }
    }

    // ========== 阶段5：幸运抽奖功能 ==========
    private static void luckyDraw() {
        System.out.println("[奖客富翁系统 > 抽奖]");
        // 校验登录状态
        if (!isLoggedIn) {
            System.out.println("您还未登录，请先登录！");
            return;
        }

        System.out.print("请输入您的卡号：");
        int inputCard = sc.nextInt();

        // 生成5个4位随机幸运数
        int[] luckyNumbers = new int[5];
        System.out.print("本日的幸运数字为：");
        for (int i = 0; i < 5; i++) {
            luckyNumbers[i] = random.nextInt(9000) + 1000;
            System.out.print(luckyNumbers[i] + " ");
        }
        System.out.println();

        // 匹配卡号，判断是否中奖
        boolean isWin = false;
        for (int num : luckyNumbers) {
            if (num == inputCard) {
                isWin = true;
                break;
            }
        }

        if (isWin) {
            System.out.println("恭喜！您是本日的幸运会员！");
        } else {
            System.out.println("抱歉！您不是本日的幸运会员！");
        }
    }
}

