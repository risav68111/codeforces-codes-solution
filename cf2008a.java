import java.util.Scanner;

public class cf2008a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0) {
            int a= sc.nextInt(), b= sc.nextInt()%2;
            int ans= (a-2*b);
            
            System.out.println(ans>=0 ? ans%2==0 ? "YES" : "NO" : "NO");
        }
    }
}