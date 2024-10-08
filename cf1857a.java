import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int c= 0;
            while(n-->0) {
                c+=sc.nextInt();
            }
            System.out.println(c%2==0 ? "YES": "NO");
        }
    }
}