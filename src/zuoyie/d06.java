package zuoyie;
import java.util.Scanner;
public class d06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr = {11, 34, 47, 19, 5, 87, 63, 88};
        System.out.println("原数组如下：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("请输入要查找的数：");
        int get=scanner.nextInt();
        int Get=0;
        int i;
        for(i=0;i< arr.length;i++){
            if(arr[i]==get){
                Get=i;
                break;
            }
        }
        if(i==arr.length){
            System.out.println("该数组没有元素："+get);
        }else{
            System.out.println(get+"在数组中的索引为："+Get);
        }
    }
}

