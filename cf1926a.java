import java.util.Scanner;

public class cf1926a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s=sc.next();
            int i=5, a=0;
            while(i-->0) {
                a+= (s.charAt(i)=='B' ? 1:0);
            }
        System.out.println(a>2? 'B':'A');
        }
    }
}