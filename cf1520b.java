import java.util.Scanner;

public class cf1520b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int c= 0;
            for(long i=1; i<=n; i=i*10+1) {
                for(int j=1; j<10; j++) {
                    if(i*j<=n ) {
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}