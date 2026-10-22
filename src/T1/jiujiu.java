package T1;

public class jiujiu {
    public static void main(String[] args){
        int i,j;
        for(i=1;i<=9;i++)
        {
            for (j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%-4d", j, i, i * j);
            }
            System.out.printf("\n");
        }

    }
}
