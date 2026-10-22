package zuoyie;

public class d05 {
    public static void main(String[] args) {
        int[] arr = {11, 34, 47, 19, 5, 87, 63, 88};
        System.out.println("原数组如下：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            int mindex=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[mindex]>arr[j]){
                    mindex=j;
                }
            }
            int t = arr[i];
            arr[i] = arr[mindex];
            arr[mindex]=t;
        }
        System.out.println("排序后的数组如下：");
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
