import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Friends:");
        int friends= sc.nextInt();
        int[] D=new int[friends];
        for(int i=0;i<friends;i++){
            System.out.println("Enter friend[" + (i + 1) + "]:");
            D[i]= sc.nextInt();
        }
        int miscount=0;
        for(int i=1;i<friends;i++){
            if(D[0]==D[i] || D[i]!=D[i-1]){  /*if(D[0]!=D[i] && D[i]!=D[i-1]) input:1 2 3 1 2 1*/ /*result misscount:3*/
            miscount++;
            }
        }
        System.out.printf("Misscount: %d\n",miscount);
    }
}
