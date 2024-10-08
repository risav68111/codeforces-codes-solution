import java.util.Scanner;

public class cf1955a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt(), a=sc.nextInt(), b= sc.nextInt(), ans1= (n/2)*b+(n%2)*a, ans2= a*n;
            System.out.println(ans1> ans2 ? ans2 : ans1);
        }
    }
}