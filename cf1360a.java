import java.util.Scanner;

public class cf1360a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int min= Math.min(a,b);
            int max= Math.max(a,b);
            System.out.println(max<2*min? 4*min*min: max*max);
        }
    }
}