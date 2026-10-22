package zuoyie;

public class d02 {
    public static void main(String[] args){
        int[] a=new int[30];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<30;i++){
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println("Fibonaci数列前30项项值如下：");
        System.out.println();
        for(int j=1;j<=30;j++){
            System.out.printf("%-8d",a[j-1]);
            if(j%6==0){
                System.out.println();
            }
        }
    }
}
