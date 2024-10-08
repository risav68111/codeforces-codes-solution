import java.util.Scanner;
import java.util.Arrays;

public class cf1873b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int[] ar= new int[n];
            for(int i=0; i<n; i++) {
                ar[i]= sc.nextInt();
            }
            Arrays.sort(ar);
            ar[0]+=1;
            int gift=1;
            while(n-->0) {
                gift*=ar[n];
            }
            System.out.println(gift);
        }
    }
}
