import java.util.*;
public class Main1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Select \"p\" \"S\" \"R\":");
        String user=sc.next().toUpperCase();
        
        int cpu1=rand.nextInt(3);
        String[] options={"P","S","R"};
        String cpu=options[cpu1];
        String winner;
        System.out.println("User: " + user);
        System.out.println("CPU: " + cpu);
        
         if (cpu.equals(user)) {
            winner = "Nobody. It's a Tie.";
        } else if (cpu.equals("R") && user.equals("S")) {
            winner = "CPU";
        } else if (cpu.equals("P") && user.equals("S")) {
            winner = "User";
        } else if (cpu.equals("S") && user.equals("R")) {
            winner = "User";
        } else if (cpu.equals("S") && user.equals("P")) {
            winner = "CPU";
        } else if (cpu.equals("R") && user.equals("P")) {
            winner = "User";
        } else if (cpu.equals("P") && user.equals("R")) {
            winner = "CPU";
        } else {
            winner = "Invalid input!";
        }

        System.out.println("The winner is: " + winner);
    }
}