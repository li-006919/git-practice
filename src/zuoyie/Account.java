package zuoyie;

public class Account {
    // （a）公有静态变量：银行名称
    public static String bankName;

    // 成员变量
    private double balance;     // 账户余额
    private String accountName; // 账户名称
    private String accountPass; // 账户密码

    // 无参构造
    public Account() {}

    // 带3个参数的构造方法
    public Account(double balance, String accountName, String accountPass) {
        this.balance = balance;
        this.accountName = accountName;
        this.accountPass = accountPass;
    }

    // getXxx() / setXxx() 方法
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPass() {
        return accountPass;
    }

    public void setAccountPass(String accountPass) {
        this.accountPass = accountPass;
    }

    // （b）公有静态方法：欢迎
    public static void welcome() {
        System.out.println("===== 欢迎来到 " + bankName + " 银行 =====");
    }

    // 公有静态方法：欢送
    public static void sayBye() {
        System.out.println("===== 感谢使用 " + bankName + " 银行服务，再见！ =====");
    }

    // （c）存款方法 deposit：验证账号密码 → 验证金额 → 存款
    public boolean deposit(String accountName, String accountPass, double money) {
        // 验证账号密码
        if (this.accountName.equals(accountName) && this.accountPass.equals(accountPass)) {
            // 验证存款金额 > 0
            if (money > 0) {
                balance += money;
                System.out.println("成功存入：" + money + " 元，当前账户余额：" + balance + " 元");
                return true;
            } else {
                System.out.println("存款金额错误！必须大于0！");
                return false;
            }
        } else {
            System.out.println("账号或密码错误！");
            return false;
        }
    }

    // （d）取款方法 withdraw：验证账号密码 → 验证余额 → 取款
    public boolean withdraw(String accountName, String accountPass, double money) {
        // 验证账号密码
        if (this.accountName.equals(accountName) && this.accountPass.equals(accountPass)) {
            // 验证取款金额 <= 余额
            if (money > 0 && money <= balance) {
                balance -= money;
                System.out.println("成功取出：" + money + " 元，当前账户余额：" + balance + " 元");
                return true;
            } else {
                System.out.println("取款金额错误！余额不足或金额非法！");  
                return false;
            }
        } else {
            System.out.println("账号或密码错误！");
            return false;
        }
    }
}
