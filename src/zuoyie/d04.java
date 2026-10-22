package zuoyie;

public class d04 {
    public static void main(String[] args) {
        int[] arr = {11, 34, 47, 19, 5, 87, 63, 88};
        System.out.println("原数组如下：");
        for (int k : arr) {
            System.out.print(k + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int t =arr[i];
                    arr[i]= arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("排序后的数组如下：");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
