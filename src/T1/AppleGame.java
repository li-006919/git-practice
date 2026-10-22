package T1;
import java.util.Random;
import java.util.Scanner;

/**
 * 猜水果游戏（幸运苹果机）
 * 规则：
 * 1. 初始玩家拥有10个金币
 * 2. 选择一种水果进行押注
 * 3. 运转后若停在所选水果上，获得【押注金币×奖励系数】的奖励；否则损失押注金币
 * 4. 输入Q可结束游戏
 */
public class AppleGame {
    public static void main(String[] args) {
        // 初始化金币
        int coins = 10;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 水果与奖励系数映射
        String[] fruits = {"苹果", "木瓜", "西瓜", "香蕉", "橙子", "葡萄"};
        int[] multipliers = {2, 5, 10, 20, 50, 100};

        System.out.println("🎮 欢迎来到猜水果游戏！初始金币：" + coins);
        System.out.println("📜 奖励系数：苹果×2 | 木瓜×5 | 西瓜×10 | 香蕉×20 | 橙子×50 | 葡萄×100");
        System.out.println("--------------------------------------------------");

        while (true) {
            // 显示当前金币
            System.out.println("\n💰 当前金币：" + coins);
            if (coins <= 0) {
                System.out.println("❌ 金币耗尽，游戏结束！");
                break;
            }

            // 选择水果
            System.out.print("请选择押注的水果（苹果/木瓜/西瓜/香蕉/橙子/葡萄），输入Q退出：");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("Q")) {
                System.out.println("👋 游戏结束，最终金币：" + coins);
                break;
            }

            // 验证水果是否合法
            int fruitIndex = -1;
            for (int i = 0; i < fruits.length; i++) {
                if (fruits[i].equals(choice)) {
                    fruitIndex = i;
                    break;
                }
            }
            if (fruitIndex == -1) {
                System.out.println("⚠️  输入的水果不存在，请重新选择！");
                continue;
            }

            // 输入押注金额
            System.out.print("请输入押注的金币数量：");
            int bet;
            try {
                bet = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("⚠️  请输入有效的数字！");
                continue;
            }
            if (bet <= 0 || bet > coins) {
                System.out.println("⚠️  押注金额必须在1~" + coins + "之间！");
                continue;
            }

            // 随机生成结果水果
            int resultIndex = random.nextInt(fruits.length);
            String resultFruit = fruits[resultIndex];
            System.out.println("🎰 运转结果：" + resultFruit);

            // 结算金币
            if (fruitIndex == resultIndex) {
                int reward = bet * multipliers[fruitIndex];
                coins += reward;
                System.out.println("✅ 恭喜你猜中！获得奖励：" + reward + "，当前金币：" + coins);
            } else {
                coins -= bet;
                System.out.println("❌ 未猜中，损失押注：" + bet + "，当前金币：" + coins);
            }
        }
        scanner.close();
    }
}