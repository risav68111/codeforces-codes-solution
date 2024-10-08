import java.util.Scanner;
import java.util.Arrays;

public class cf1742b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n= sc.nextInt();
            int[] ar= new int[n];
            for(int i=0; i<n; i++) {
                ar[i]= sc.nextInt();
            }
            Arrays.sort(ar);
            String s="YES";
            while(n-->1) {
                if(ar[n]==ar[n-1]) {
                    s= "NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
