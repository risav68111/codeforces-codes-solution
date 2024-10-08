import java.util.Scanner;

public class cf1669a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w= sc.nextInt();
        while(w-->0) {
            int n= sc.nextInt();
            if(n>=1900) {
                System.out.println("Division 1");
            } else if(1600<=n && n<=1899) {
                System.out.println("Division 2");
            } else if( 1400<=n && n<=1599) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
    }
}
