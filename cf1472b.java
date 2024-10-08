import java.util.Scanner;

public class cf1472b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int o= 0;
            int s= 0;
            while(n-->0) {
                int x= (sc.nextInt()%2==0? s++: o++);
            }
            System.out.println(s%2==0 &&  o%2==0? "YES": (s*2+o)%2==0 && o>0? "YES":"NO");
        }
    }
}