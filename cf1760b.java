import java.util.Scanner;

public class cf1760b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt(), x= 0;
            String s= sc.next();
            while(n-->0) {
                x= Math.max(((int)s.charAt(n)-96), x);
            }
            System.out.println(x);
        }
    }
}