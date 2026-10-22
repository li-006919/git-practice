package zuoyie;

public class d10 {
    public static void main(String[] args) {
        // 1. 给静态变量银行名称赋值
        Account.bankName = "中国建设银行";

        // 2. 调用静态欢迎方法
        Account.welcome();

        System.out.println("------------------------");

        // 3. 使用带参构造创建账户对象（初始余额、账号、密码）
        Account account = new Account(1000.0, "zhangsan", "123456");

        // 4. 调用存款方法（正确账号、密码、存款金额）
        System.out.println("----- 存款操作 -----");
        account.deposit("zhangsan", "123456", 500.0);

        System.out.println("------------------------");

        // 5. 调用取款方法
        System.out.println("----- 取款操作 -----");
        account.withdraw("zhangsan", "123456", 300.0);

        System.out.println("------------------------");

        // 6. 调用静态欢送方法
        Account.sayBye();
    }
}