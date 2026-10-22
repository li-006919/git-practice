package zuoyie;
import java.util.Random;
public class d01 {
    public static void main(String[] args){
        Random random=new Random();
        int[] a=new int[10];
        for(int i=1;i<10;i++){
            a[i]=random.nextInt(100);
        }
        System.out.println("产生的10个随机数如下：");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        int max=a[0];
        int maxindex=0;
       for( int j=1;j<10;j++){
               if(max<a[j]){
                   max=a[j];
                   maxindex=j;
               }
           }
        System.out.println("该数组中的最大值为："+max);
        System.out.println("其所在索引为："+maxindex);
       }
    }

