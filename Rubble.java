import java.util.*;

public class Rubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rubles:");
        int rubble = sc.nextInt();
        System.out.println("Machine A:");
        int A = sc.nextInt();
        System.out.println("Machine B:");
        int B = sc.nextInt();
        System.out.println("Machine C:");
        int C = sc.nextInt();
        int count = 0;
        while (rubble > 0) {
            rubble--;
            A++;
            count++;
            if (A % 30 == 0) {
                rubble += 30;
            }
            if (rubble == 0) break;
            
            rubble--;
            B++;
            count++;
            if (B % 100 == 0) {
                rubble += 60;
            }
            if (rubble == 0) break;
            
            rubble--;
            C++;
            count++;
            if (C % 15 == 0) {
                rubble += 10;
            }
        }

        System.out.printf("Number of times played: %d\n", count);
    }
}
