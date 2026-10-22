package zuoyie;

import java.util.Scanner;
public class d07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {11,34,47,19,5,87,63,88};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int left=0, right=arr.length-1;
        System .out.print("请输入要查找的数：");
        int value= scanner.nextInt();
        while(left<=right){
            int mid=(left+right)/2;
            if(value==arr[mid]){
                System.out.println(value+"在数组中的索引下标是："+mid);
                 break;
            }else if (value>arr[mid]){
                left=mid+1;
            } else if (value<arr[mid]) {
                right=mid-1;
            }
        }
        if(left>right){
           System.out.println("该数组中没有元素:"+value);
        }
    }
}
