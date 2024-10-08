import java.util.Scanner;

public class cf1535a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();
            System.out.println(Math.max(a,b)> Math.min(c,d) && Math.max(c,d) > Math.min(a,b) ? "YES": "NO") ;
        }
    }
}