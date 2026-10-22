package zuoyie;
import java.util.Random;
public class d11 {
   public static void main(String[] args) {
       Random random=new Random();
       for (int j = 0; j<10; j++) {
           int i=random.nextInt(1000);
           int temp=i;
           System.out.println(temp);
           while(i!=0){
               int ge=i%10;
               i/=10;
               if(ge==7||temp%7==0){
                   System.out.println("过");
                   break;
               }
           }
       }

    }
}
