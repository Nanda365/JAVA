import java.util.*;
public class Shape{
    static void fact(int n){
       int sum=0;
       for(int i=0;i<=n;i++){
           sum+=i;
       }
       System.out.print(sum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
    }
}