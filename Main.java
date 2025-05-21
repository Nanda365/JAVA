import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter peak:");
        int peak = sc.nextInt();

        System.out.println("Enter Evening:");
        int even = sc.nextInt();

        System.out.println("Enter Night:");
        int nig = sc.nextInt();

        double silverAmt = (even * 0.2) + (nig * 0.15);
        double goldAmt = (even * 0.3) + (nig * 0.2);

        if (peak > 120) {
            silverAmt += (peak - 120) * 0.3;
        }

        if (peak > 200) {
            goldAmt += (peak - 200) * 0.4;
        }

        System.out.printf("GoldAmt: %.2f\n", goldAmt);
        System.out.printf("SilverAmt: %.2f\n", silverAmt);
        if(goldAmt>silverAmt){
            System.out.printf("Silver plan is best: %.2f", silverAmt);
        }else if(silverAmt>goldAmt) {
            System.out.printf("Gold plan is best: %.2f", goldAmt);
        }else{
            System.out.printf("Both plans are Same");
        }
    }
}
