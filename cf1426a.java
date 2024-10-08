import java.util.Scanner;

public class cf1426a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int x= sc.nextInt();
            if(n<=2) {
                System.out.println(1);
            } else {
                n-=2;
                int c= (n/x)+1;
                System.out.println((n)%x==0? c: c+1);
            }
        }
    }
}