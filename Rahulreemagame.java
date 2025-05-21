import java.util.*;

public class Rahulreemagame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of rounds:");    
        int rounds=sc.nextInt();
        System.out.println("Rahul:");
            int rahul = sc.nextInt();
        System.out.println("Reema:");
            int reema=sc.nextInt();
        for(int i=1;i<=rounds;i++){
            if(i%2==1){
                rahul=rahul*2;
            }else{
                reema=reema*2;
            }
        }
        System.out.printf("Points of both: %d\n",rahul+reema);
    }
}
