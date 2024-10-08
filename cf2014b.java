import java.util.Scanner;

public class cf2014b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt(), k=sc.nextInt(), sum=0;
            while(k--> 0) {
                sum+= Math.pow(n,n);
                n--;
            }
            System.out.println(sum%2==0 ? "YES": "NO");
        }
    }
}