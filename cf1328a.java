import java.util.Scanner;

public class cf1328a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0) {
            int dd= sc.nextInt();
            int dv= sc.nextInt();
            int x= dd%dv;
            if(x==0) {
                System.out.println(0);
            } else {
            System.out.println(dv-x);
            }
        }
    }
}
