import java.util.Scanner;
import java.util.Arrays;

public class cf1929a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int[] n= new int[sc.nextInt()];
            for(int i=0; i<n.length; i++) {
                n[i]= sc.nextInt();
            }
            Arrays.sort(n);
            int sum=0;
            for(int i=1; i<n.length; i++) {
                 sum+=(n[i]-n[i-1]);
            }
            System.out.println(sum);
        }
    }
}