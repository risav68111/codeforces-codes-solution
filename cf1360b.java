import java.util.Scanner;
import java.util.Arrays;

public class cf1360b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int n= sc.nextInt();
            int min=Integer.MAX_VALUE;
            int ar[]= new int[n];
            for(int i=0; i<n; i++) {
                ar[i]= sc.nextInt();
            }
            Arrays.sort(ar);
            for(int i=1; i<n; i++) {
                min=Math.min(min, ar[i]- ar[i-1]);
                if(min==0) {
                    break;
                }
            }
            System.out.println(min);
        }
    }
}