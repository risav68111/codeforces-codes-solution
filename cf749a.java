import java.util.Scanner;

public class cf749a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;
        if(n%2==0) { 
            n/=2;
            System.out.println(n);
            while(n-->0) {
                System.out.print(2+" ");
            }
        } else {
            n-=3;
            n/=2;
            System.out.println(n+1);
            System.out.print(3+" ");
            while(n-->0) {
                System.out.print(2+" ");
            }
        }
    }
}