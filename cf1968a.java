import java.util.Scanner;

public class cf1968a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int x= gcd(n);
            System.out.println(x);
        }
    }
    public static int gcd(int n) {
        for(int i=n-1; i>0; --i) {
            while(n!=i) {
                
            }
        }
        return 1;
    }
}
