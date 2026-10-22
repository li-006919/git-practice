package zuoyie;

public class d03 {
    public static void main(String[] args) {
        int[] arr = {11,34,47,19,5,87,63,88};
        System.out.println("原数组如下：");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("逆序后的数组如下：");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"\t");
        }
    }
}
