package zuoyie;
public class d08 {
    public static void main(String[] args){
        int[][] arr={
            {1,55,-6},
            {34,59,86,13,-4},
            {100,75,32,25}
        };
        System.out.println("二维数组如下：");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
                if(j==arr[i].length-1){
                    System.out.println();
                }
            }
        }
        int min=arr[0][0];
        int row=0;
        int lie=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                    row=i;
                    lie=j;
                }
            }
        }
        System.out.println("元素最小值："+min);
        System.out.println("元素最小值所在行："+row);
        System.out.println("元素最小值所在列："+lie);

    }

}
