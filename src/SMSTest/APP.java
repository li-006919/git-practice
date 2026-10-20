package SMSTest;

import java.util.ArrayList;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        System.out.println("欢迎来到学生管理系统,请选择您的操作");
        System.out.println("--------------------------");
        System.out.println("1：登录");
        System.out.println("2：注册");
        System.out.println("3：忘记密码");
        System.out.println("4：退出");
        System.out.println("--------------------------");
        System.out.println("请输入您的选择：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int chioce = sc.nextInt();
            switch (chioce) {
                case 1:
                    Signup(list);
                    break;
                case 2:
                    Register(list);
                    break;
                case 3:
                    ForgetPassward(list);
                    break;
                case 4:
                    System.out.println("退出");
                    System.exit(0);
                default:
                    System.out.println("没有这个选项");
            }
        }
    }

    public static void Register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String UserName = null;
        while (true) {
            System.out.println("请输入用户名：");
            UserName = sc.next();
            boolean flag = checkUserName(UserName);
            if(!flag){
                System.out.println("用户名不规范，请重新输入:");
                 continue;
            }else{
                System.out.println("用户名输入成功");
                break;
            }
        }
        System.out.println("请输入密码：");
        String Passward = sc.next();
        System.out.println("请输入身份证号：");
        String idCard = sc.next();
        System.out.println("请输入手机号：");
        String PhoneNumber = sc.next();
        User user = new User(UserName, Passward, idCard, PhoneNumber);
    }

    public static boolean checkUserName(String UserName) {
        int lenth=UserName.length();
        int count=0;
        //检验用户名长度
        if(lenth<3||lenth>15){
            return false;
        }
        //检验用户名内容
        for (int i = 0; i < UserName.length(); i++) {
            char c=UserName.charAt(1);
            if(!(c>'a'||c<'z'||c>'0'||c<'9'||c>'A'||c<'z')){
                return false;
            }
        }
        for (int i = 0; i < UserName.length(); i++) {
            char c=UserName.charAt(1);
            if(c>'a'||c<'z'){
                count++;
                break;
            }
        }
        return count++>0;
    }

    public static void Signup(ArrayList<User> list) {

    }

    public static void ForgetPassward(ArrayList<User> list) {

    }

}
