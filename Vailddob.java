import java.util.*;

public class Vailddob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day:\n");
        int day = sc.nextInt();
        System.out.print("Enter month:\n");
        int mon = sc.nextInt();
        System.out.print("Enter year:\n");
        int year = sc.nextInt();

        boolean isValid = false;
        boolean isLeap = false;
        int maxDays = 0;

        if (year >= 1600 && year <= 2025) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                isLeap = true;
            }

            if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
                maxDays = 30;
            } else if (mon == 2) {
                maxDays = isLeap ? 29 : 28;
            } else if (mon >= 1 && mon <= 12) {
                maxDays = 31;
            }

            if ((mon >= 1 && mon <= 12) && (day >= 1 && day <= maxDays)) {
                isValid = true;
            }

            if (isValid) {
                System.out.println("Given Date of Birth is Valid.");
            } else {
                System.out.println("Given Date of Birth is Invalid.");
            }
        } else {
            System.out.println("Year must be between 1600 and 2025.");
        }
    }
}
