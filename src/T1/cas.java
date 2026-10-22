package T1;
import java.util.Scanner;
public class cas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数:");
            int num =sc.nextInt();
            sc.nextLine();
            System.out.println("输入y继续，输入n退出");
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("n")){
                System.out.println("欢迎下次再来！");
                sc.close();
                System.exit(0);
            }
        }

    }
}
