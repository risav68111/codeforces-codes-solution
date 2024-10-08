import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int n= 0;
        while(t-->0) {
            n=n*10+sc.nextInt();
        }
        System.out.println(20240401%n);
    }
}