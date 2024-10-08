import java.util.Scanner;

public class cf1722b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            String a= sc.next();
            String b= sc.next();
            boolean bol = true;
            while(n-->0) {
                if((a.charAt(n)=='R' || b.charAt(n)=='R') && b.charAt(n)!= a.charAt(n)) {
                    bol= false;
                    break;
                }
            }
            System.out.println(bol? "YES": "NO");
        }
    }
}
